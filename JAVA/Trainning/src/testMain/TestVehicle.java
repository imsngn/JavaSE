package testMain;

import day03.Vehicle;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle(80, 50.2);
		vehicle.speedUp();
		vehicle.speedUp();
		vehicle.speedUp();
		vehicle.speedUp();
		vehicle.speedUp();
		vehicle.speedUp();
		vehicle.speedDown();
		vehicle.speedDown();
		vehicle.speedDown();
		vehicle.speedUp();
		vehicle.speedUp();
		vehicle.speedUp();
		vehicle.speedUp();
		vehicle.speedUp();
		
		double speed = vehicle.getSpeed();
		double size = vehicle.getSize();
		System.out.println("vehicle's speed is "+speed + " size is "+ size);
		
		System.out.println(vehicle.toString());

	}

}
