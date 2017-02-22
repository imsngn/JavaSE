package day05;

import java.util.ArrayList;
import java.util.Arrays;

public class PciDevice {
	private static ArrayList<String>  allTypes = new ArrayList<>(Arrays.asList("����","����","�Կ�","���ƽ����","ǧ������","�߱������������","��⿨"));
	private String type;
	private int deviceOrder;
	
	

	public int getDeviceOrder() {
		return deviceOrder;
	}

	public void setDeviceOrder(int deviceOrder) {
		this.deviceOrder = deviceOrder;
	}

	public PciDevice() {
		super();
	}

	public PciDevice(String type) {
		super();
		this.type = type;
	}

	public static ArrayList<String> getAlltypes() {
		return allTypes;
	}



	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

	
}
