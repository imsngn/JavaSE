package testDay05;

import day05.Animal;
import day05.Sheep;
import day05.Wolf;

public class testAnimal {

	public static void main(String[] args) {
		Animal a1 = new Animal("��֪������Ķ���");
		a1.eat();
		a1.sleep();
		
		Sheep sheep = new Sheep("������");
		sheep.eat();
		sheep.sleep();
		sheep.setWeight(25.0);
		System.out.println(sheep.toString());
		
		
		Wolf wolf = new Wolf("һֻ����Զ������ ");
		wolf.eat();
		wolf.sleep();
		
		wolf.setWeight(50.0);
		System.out.println(wolf.toString());

		
		
	}

}
