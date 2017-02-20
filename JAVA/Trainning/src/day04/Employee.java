package day04;

public class Employee {
	private String name;
	private int age;
	private String sex;
	private String position;
	private double salary;
	
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public String getPosition(){
		return position;
	}
	public void setPosition(String position){
		this.position = position;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
		this.sex = "female";
		this.salary =  5000.0;
	}
	
	public Employee(String name, int age, String position){
		this.name = name;
		this.age = age;
		this.position = position;
		
	}
	
	public Employee(String name, int age, String sex, String position,double salary) {
		this.name = name;
		this.age  = age;
		this.sex  = sex;
		this.position = position;
		this.salary = salary;
		
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", sex=" + sex + ", position=" + position + ", salary="
				+ salary + "]";
	}
	
	
	

}