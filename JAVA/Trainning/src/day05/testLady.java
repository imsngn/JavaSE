package day05;
import day05.Dog;

public class testLady {

	public static void main(String[] args) {

		Cat cat = new Cat("����", 20, "��ɫ");
		Dog dog = new Dog("����", 30, "��ɫ");
		Lady lady01 = new Lady("��Ůʿ", cat);
		Lady lady02 = new Lady("��Ůʿ", dog);
		
		lady01.makePetHappy(cat);
		
		lady01.makePetHappy(dog);

		
		lady02.makePetHappy(dog);
		
	
	}

}
