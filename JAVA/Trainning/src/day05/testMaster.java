package day05;

public class testMaster {

	public static void main(String[] args) {
		
		Animal[] pet = new Animal[2];
		
		pet[0] = new Dog("���� ",2,"��ɫ");
		pet[1] = new Cat("С��",5,"��ɫ");
		
		String[] petsFood = new String[2];
		petsFood[0] = "��ͷ";
		petsFood[1] = "��";
		
		Food petFood  = new Food(petsFood);
		
		Master master = new Master(pet);
		master.setPetFoods(petFood);
		
		master.feed(pet);
		
		
		
	}

}
