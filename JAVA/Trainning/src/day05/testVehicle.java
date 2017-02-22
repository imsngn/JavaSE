package day05;

public class testVehicle {
	public static void main(String[] args) {
		Vehicle vehicle = new Trunk();
		vehicle.run();
		
		vehicle = new Saloon();
		vehicle.run();
		
		vehicle = new Tractor();
		vehicle.run();
		
	}
}
