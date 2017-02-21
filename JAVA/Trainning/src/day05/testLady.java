package day05;
import day05.Dog;

public class testLady {

	public static void main(String[] args) {

		Cat cat = new Cat("喵喵", 20, "黄色");
		Dog dog = new Dog("汪汪", 30, "黑色");
		Lady lady01 = new Lady("王女士", cat);
		Lady lady02 = new Lady("张女士", dog);
		
		lady01.makePetHappy(cat);
		
		lady01.makePetHappy(dog);

		
		lady02.makePetHappy(dog);
		
	
	}

}
