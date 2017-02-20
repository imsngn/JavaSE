package testMain;

import day03.MyDogTestDrive;
import day03.Student;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MyDogTestDrive dog = new MyDogTestDrive();
		//dog.testDog();
		
		Student a = new Student("Jack",1,10000,21,"male");
		Student b = new Student("John",3,10012,22,"male");
		Student c = new Student("Christina",2,20020,20,"female");
		
		
		Student d = new Student();
		d.setName("Tom");
		d.setClass(4);
		d.setId(30040);
		d.setAge(19);
		d.setSex("Male");
		
		
		a.study();
		String info = a.toString();
		System.out.println(info);
		
		b.study();
		System.out.println(b.toString());
		
		c.study();
		System.out.println(c.toString());
		
		d.study();
		System.out.println(d.toString());
	}

}
