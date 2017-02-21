package day05;

public class testMaster {

	public static void main(String[] args) {
		
		Animal[] pet = new Animal[2];
		
		pet[0] = new Dog("旺财 ",2,"黄色");
		pet[1] = new Cat("小花",5,"白色");
		
		String[] petsFood = new String[2];
		petsFood[0] = "骨头";
		petsFood[1] = "鱼";
		
		Food petFood  = new Food(petsFood);
		
		Master master = new Master(pet);
		master.setPetFoods(petFood);
		
		master.feed(pet);
		
		
		
	}

}
