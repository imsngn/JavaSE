package day05;

public class Employee extends Person {
	
	private String position;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	
	public  Employee(String name, int age, String gender, String postion) {
		super(name,age,gender);
		this.position = postion;
	}
	@Override
	public String toString() {
		return "Employee [name=" + getName() + " age " + getAge() + " gender " + getGender() + " position=" + position + "]";
	}
	
	

}
