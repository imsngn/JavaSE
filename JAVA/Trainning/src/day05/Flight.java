package day05;

import java.util.ArrayList;

public class Flight {
	private String original;
	private String destination;
	private String startOffTime;
	private String reachTime;
	private Plane plane = new Plane();
	private ArrayList<Passenger> passengers = new ArrayList<Passenger>();
	
	public String getOriginal() {
		return original;
	}
	public void setOriginal(String original) {
		this.original = original;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getStartOffTime() {
		return startOffTime;
	}
	public void setStartOffTime(String startOffTime) {
		this.startOffTime = startOffTime;
	}
	public String getReachTime() {
		return reachTime;
	}
	public void setReachTime(String reachTime) {
		this.reachTime = reachTime;
	}
	public Plane getPlane() {
		return plane;
	}
	public void setPlane(Plane plane) {
		this.plane = plane;
	}
	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	
	public Flight() {
		super();
	}
	public Flight(String original, String destination, String startOffTime, String reachTime, Plane plane,
			ArrayList<Passenger> passengers) {
		super();
		this.original = original;
		this.destination = destination;
		this.startOffTime = startOffTime;
		this.reachTime = reachTime;
		this.plane = plane;
		this.passengers = passengers;
	}
	
	

}
