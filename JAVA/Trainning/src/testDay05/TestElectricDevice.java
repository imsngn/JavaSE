package testDay05;

import day05.ElectricDevice;
import day05.Fan;
import day05.Light;
import day05.Person;
import day05.TV;

public class TestElectricDevice {
	public static void main(String[] args) {
		Person owner  = new Person("’≈»˝");
		
		Light light = new Light();
		Fan fan = new Fan();
		TV tv = new TV();
		
		owner.openElectricDevice(light);
		owner.openElectricDevice(light);
		owner.openElectricDevice(tv);
		owner.openElectricDevice(fan);
		
		owner.closeElectricDevice(fan); 
		owner.closeElectricDevice(tv);
		owner.closeElectricDevice(light);
		
		//∂‡Ã¨
		
		ElectricDevice device = new TV();
		owner.openElectricDevice(device);
		owner.closeElectricDevice(device);
		

		device = new Fan();
		owner.openElectricDevice(device);
		owner.closeElectricDevice(device);
	}
	



}
