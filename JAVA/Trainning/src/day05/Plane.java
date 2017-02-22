package day05;

public class Plane implements Flyable{
	private String type;
	
	
	

	public Plane(String type) {
		super();
		this.type = type;
	}




	public String getType() {
		return type;
	}




	public Plane() {
		super();
	}




	public void setType(String type) {
		this.type = type;
	}




	@Override
	public void flyTo(String orig, String dest) {
		System.out.print("´Ó" + orig + "·ÉÍù" + dest);
	}
}
