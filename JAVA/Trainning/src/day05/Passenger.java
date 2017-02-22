package day05;

public class Passenger extends Person {
	
	private String nationality;
	
	private String targetDestination;
	
	private String startOffPlace;
	
	private Flight flight = new Flight();

	
	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public String getTargetDestination() {
		return targetDestination;
	}


	public void setTargetDestination(String targetDestination) {
		this.targetDestination = targetDestination;
	}


	public String getStartOffPlace() {
		return startOffPlace;
	}


	public void setStartOffPlace(String startOffPlace) {
		this.startOffPlace = startOffPlace;
	}


	public Passenger(String name, Integer age, String gender, String nationality, String targetDestination, String startOffPlace) {
		super(name,age,gender);
		this.nationality = nationality;
		this.targetDestination = targetDestination;
		this.startOffPlace = startOffPlace;
	}
	

	public void takeFlight(Flight flight){
		System.out.print(this.getName() + "���" + flight.getPlane().getType() + "�ɻ���" + flight.getStartOffTime() );
		flight.getPlane().flyTo("�Ϻ�", "����");
		System.out.println("����" + flight.getReachTime() + "����");
	}

}
