package day03;

public class MyDogTestDrive {
	public static void main(String[] args) {
		MyDog dog = new MyDog();
		dog.bark();
	}
	public  void testDog() {
		MyDog dog = new MyDog();
		dog.bark();
	}
	

}

class MyDog {
	String name;
	String furColor;
	int age;

	public void bark() {
		System.out.println("ÍôÍôÍô");
	}
}
