package testDay05;

import java.util.ArrayList;

import day05.Flight;
import day05.Passenger;
import day05.Plane;

public class testPassenger {

	public static void main(String[] args) {
		
		Passenger passenger = new Passenger("陶然", 19, "female", "中国", "美国", "上海");
		
		Plane plane = new Plane("波音");
		
		ArrayList<Passenger> passengersList = new ArrayList<Passenger>();
		passengersList.add(passenger);
		
		Flight flight = new Flight(passenger.getStartOffPlace(), passenger.getTargetDestination(), "2017-09-01", "2017-09-02", plane, passengersList);
		
		
		passenger.takeFlight(flight);
		
	}

}
