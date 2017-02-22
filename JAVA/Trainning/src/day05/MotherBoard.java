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
			System.out.println(slotNumber + "槽位已被"+ getSpecificOrderDevice(slotNumber).getType()+ "使用，请重新选择");
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
			System.out.println("这个槽位已经没有设备了");
			return false;
		}

	}

	public void displayUsedSlot(){
		System.out.println("---------------------------------------------");

		System.out.print("主板当前被占用的槽位：");
		Collections.sort(pciUsedSlotArrayList);
		System.out.println(pciUsedSlotArrayList);
		System.out.println("---------------------------------------------");

	}
	public void displayFreeSlots(){
		
		System.out.print("当前主板有" + freeSlots + "个空闲槽位: ");
		for (int i = 0; i < totalSlots; i++) {
			if (pciUsedSlotArrayList.indexOf(i+1) == -1) {
				System.out.print((i+1) + " ");
			}
		}
		System.out.println("");
	}
	
	public void displayPluggedDevices(){
		if (freeSlots == totalSlots ) {
			System.out.println("当前主板上没有插入PCI设备");
		}else{
			System.out.print("当前已经安装的设备：");
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
		System.out.println("开始批量插入PCI设备: ");
		while(freeSlots > 0) {
			displayPluggedDevices();
			displayFreeSlots();
			int slot = day02.InterActiveGet.getOneInterger("请从空闲槽位里边选择一个槽位: ");
			String devtype =day02.InterActiveGet.getOneString("请选择你要插入设备的类型 : " + PciDevice.getAlltypes());
			if(verifyDevice(devtype)){
				PciDevice device =new PciDevice(devtype);
				if (plug(slot, device)) {
					System.out.println(device.getType()  + "已经插入到第" + slot + "槽位");
				}
			}
			else {
				System.out.println("该主板不支持" + devtype + " 这种类型的设备，请重新选择ＰＣＩ设备");
			}
			
		}
		displayPluggedDevices();
		System.out.println("所有槽位都已安装");
		System.out.println("---------------------------------------------");
	}
	
	public void displayCurrentDeviceOnSlots(){
		if(freeSlots  !=  totalSlots){
			System.out.println("当前主板设备：");
			System.out.println("槽位" + "\t" + "设备");
			for (int i = 0; i < totalSlots; i++) {
				for (PciDevice pciDevice : devices) {
					if((i+1) == pciDevice.getDeviceOrder()){
						System.out.println((i+1) + ":\t" + pciDevice.getType());
					}
				}
			}
		}
		else {
			System.out.println("当前主板无设备");
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
		System.out.println("--------------删除设备-------------------");

		int num = 0;
		while(freeSlots < totalSlots) {
//			displayUsedSlot();
//			displayPluggedDevices();
			num++;
			displayCurrentDeviceOnSlots();
			Integer slot = day02.InterActiveGet.getOneInterger("请从已用槽位里边选择一个槽位: ");
			String devtype= getSpecificOrderDevice(slot).getType();
			if(unplug(slot, getSpecificOrderDevice(slot))) {
				System.out.println("已从第" + slot + "槽位拔除" + devtype+"设备");
			}
		}
		System.out.println("已释放" + num + "个槽位,当前主板已经没有PCI设备");
		System.out.println("---------------------------------------");
		displayFreeSlots();
		System.out.println("---------------------------------------");
	}
	
	
}
