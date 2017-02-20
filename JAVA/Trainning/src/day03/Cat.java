package day03;

public class Cat {
	private String name;
	private int age;
	private String color;
	
	public Cat(){
	
	}
	public String getCatName() {
		return name;
	}
	public int getCatAge() {
		return age;
	}
	public String getCatColor(){
		return color;
	}
	public Cat(String n, int a, String c) {
		name = n;
		age = a;
		color =c;
	}
	public String toString() {
		return name + " " + age + " " + color;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
