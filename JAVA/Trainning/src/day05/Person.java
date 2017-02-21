package day05;

public class Person {
	
	private String name;
	private int age;
	private String gender;
	
	
	
	public String getName(){
		return this.name;
	}
	
	public void  setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Person(){
		super();
	}
	public Person(String name, int age, String gender){
		this.name = name;
		this.age =age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

}
