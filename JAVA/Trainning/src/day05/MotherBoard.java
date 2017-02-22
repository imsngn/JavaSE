package day05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class MotherBoard implements HotPlugAble{
	private int totalSlots;
	private int freeSlots;
	private ArrayList<Integer>  pciUsedSlotArrayList = new ArrayList<Integer>();
	private ArrayList<PciDevice> devices = new ArrayList<PciDevice>();
	
	
	
	public MotherBoard(int totalSlots, ArrayList<PciDevice> devices) {
		super();
		this.totalSlots = totalSlots;
		this.devices = devices;
		this.freeSlots = totalSlots - devices.size();
		for (PciDevice pciDevice : devices) {
			for (int i = 0; i < totalSlots; i++) {
				if (pciDevice.getDeviceOrder() == (i+1)) {
					pciUsedSlotArrayList.add((i+1));
				}
			}
		}
	}
	public MotherBoard(int totalSlots) {
		super();
		this.totalSlots = totalSlots;
		this.freeSlots = totalSlots;
	}
	@Override
	public boolean plug(Integer slotNumber, PciDevice device) {
		if(pciUsedSlotArrayList.indexOf(slotNumber) == -1) {
			pciUsedSlotArrayList.add(slotNumber);
			devices.add(device);
			freeSlots--;
//			int index = devices.indexOf(device);
			device.setDeviceOrder(slotNumber);
		
			return true;
		}
		else {
			System.out.println(slotNumber + "��λ�ѱ�"+ getSpecificOrderDevice(slotNumber).getType()+ "ʹ�ã�������ѡ��");
			return false;
		}
	}
	@Override
	public boolean unplug(Integer slotNumber, PciDevice device) {
		if (pciUsedSlotArrayList.indexOf(slotNumber) != -1) {
			pciUsedSlotArrayList.remove(slotNumber);
			device.setDeviceOrder(0);
			devices.remove(device);
			freeSlots++;
			return true;
		}
		else {
			System.out.println("�����λ�Ѿ�û���豸��");
			return false;
		}

	}

	public void displayUsedSlot(){
		System.out.println("---------------------------------------------");

		System.out.print("���嵱ǰ��ռ�õĲ�λ��");
		Collections.sort(pciUsedSlotArrayList);
		System.out.println(pciUsedSlotArrayList);
		System.out.println("---------------------------------------------");

	}
	public void displayFreeSlots(){
		
		System.out.print("��ǰ������" + freeSlots + "�����в�λ: ");
		for (int i = 0; i < totalSlots; i++) {
			if (pciUsedSlotArrayList.indexOf(i+1) == -1) {
				System.out.print((i+1) + " ");
			}
		}
		System.out.println("");
	}
	
	public void displayPluggedDevices(){
		if (freeSlots == totalSlots ) {
			System.out.println("��ǰ������û�в���PCI�豸");
		}else{
			System.out.print("��ǰ�Ѿ���װ���豸��");
			for (PciDevice pciDevice : devices) {
				System.out.print(pciDevice.getType() + " ");
			}
			System.out.println("\n");
		}
		

	}
	
	public boolean verifyDevice(String devType){
		ArrayList<String> deviceTypeList = PciDevice.getAlltypes();
		if (deviceTypeList.indexOf(devType) == -1) {
			return false;
		}
		else {
			return true;
		}
	}
	public void bulkPlugDevices(){
		System.out.println("��ʼ��������PCI�豸: ");
		while(freeSlots > 0) {
			displayPluggedDevices();
			displayFreeSlots();
			int slot = day02.InterActiveGet.getOneInterger("��ӿ��в�λ���ѡ��һ����λ: ");
			String devtype =day02.InterActiveGet.getOneString("��ѡ����Ҫ�����豸������ : " + PciDevice.getAlltypes());
			if(verifyDevice(devtype)){
				PciDevice device =new PciDevice(devtype);
				if (plug(slot, device)) {
					System.out.println(device.getType()  + "�Ѿ����뵽��" + slot + "��λ");
				}
			}
			else {
				System.out.println("�����岻֧��" + devtype + " �������͵��豸��������ѡ��Уã��豸");
			}
			
		}
		displayPluggedDevices();
		System.out.println("���в�λ���Ѱ�װ");
		System.out.println("---------------------------------------------");
	}
	
	public void displayCurrentDeviceOnSlots(){
		if(freeSlots  !=  totalSlots){
			System.out.println("��ǰ�����豸��");
			System.out.println("��λ" + "\t" + "�豸");
			for (int i = 0; i < totalSlots; i++) {
				for (PciDevice pciDevice : devices) {
					if((i+1) == pciDevice.getDeviceOrder()){
						System.out.println((i+1) + ":\t" + pciDevice.getType());
					}
				}
			}
		}
		else {
			System.out.println("��ǰ�������豸");
		}
		
	}
	public PciDevice getSpecificOrderDevice(Integer slot){
		PciDevice target = new PciDevice();
		for (PciDevice pciDevice : devices) {
			if (slot == pciDevice.getDeviceOrder()){
				target = pciDevice;
//				System.out.println(target.getType());
				break;
			}
		}
		return target;
	}
	public void bulkUnPlugDevices(){
		System.out.println();
		System.out.println();
		System.out.println("--------------ɾ���豸-------------------");

		int num = 0;
		while(freeSlots < totalSlots) {
//			displayUsedSlot();
//			displayPluggedDevices();
			num++;
			displayCurrentDeviceOnSlots();
			Integer slot = day02.InterActiveGet.getOneInterger("������ò�λ���ѡ��һ����λ: ");
			String devtype= getSpecificOrderDevice(slot).getType();
			if(unplug(slot, getSpecificOrderDevice(slot))) {
				System.out.println("�Ѵӵ�" + slot + "��λ�γ�" + devtype+"�豸");
			}
		}
		System.out.println("���ͷ�" + num + "����λ,��ǰ�����Ѿ�û��PCI�豸");
		System.out.println("---------------------------------------");
		displayFreeSlots();
		System.out.println("---------------------------------------");
	}
	
	
}
