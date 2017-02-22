package testDay05;


import java.util.ArrayList;

import day05.MotherBoard;
import day05.PciDevice;

public class testMotherBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PciDevice device01 = new PciDevice("网卡");
		PciDevice device02 = new PciDevice("声卡");
		device01.setDeviceOrder(1);
		device02.setDeviceOrder(2);
		
		
		ArrayList<PciDevice> devices = new ArrayList<PciDevice>();
		devices.add(device01);
		devices.add(device02);
		MotherBoard mBoard = new MotherBoard(5,devices);

	
		mBoard.displayCurrentDeviceOnSlots();
		
		String decision = day02.InterActiveGet.getOneString("开始添加PCI设备吗？ Y/N");
		if (decision.equals("Y") || decision.equals("y")) {
			mBoard.bulkPlugDevices();
		}
		else{
			mBoard.displayCurrentDeviceOnSlots();
		}
		
		decision = day02.InterActiveGet.getOneString("开始删除PCI设备吗？  Y/N");
		if (decision.equals("Y") || decision.equals("y")) {
			mBoard.bulkUnPlugDevices();
		}
		else{
			mBoard.displayCurrentDeviceOnSlots();
		}
	}

}
