package testDay05;

import java.util.ArrayList;

import day05.Flight;
import day05.Passenger;
import day05.Plane;

public class testPassenger {

	public static void main(String[] args) {
		
		Passenger passenger = new Passenger("��Ȼ", 19, "female", "�й�", "����", "�Ϻ�");
		
		Plane plane = new Plane("����");
		
		ArrayList<Passenger> passengersList = new ArrayList<Passenger>();
		passengersList.add(passenger);
		
		Flight flight = new Flight(passenger.getStartOffPlace(), passenger.getTargetDestination(), "2017-09-01", "2017-09-02", plane, passengersList);
		
		
		passenger.takeFlight(flight);
		
	}

}
