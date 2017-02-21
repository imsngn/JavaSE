package day05;
import day05.Animal;
import day02.InterActiveGet;
public class Master {
	private Animal[] pets;
	private Food petFoods=null;


	public Food getPetFoods() {
		return petFoods;
	}

	public void setPetFoods(Food petFoods) {
		this.petFoods = petFoods;
	}

	public Animal[] getPets() {
		if (pets != null && pets.length > 0) {
			return pets;
		}
		return null;
	}

	public void setPets(Animal[] pets) {
		this.pets = pets;
	}
	
	
	public Master(Animal[] pets) {
		super();
		this.pets = pets;
	}

	public String displayPetFood() {
		String str = "";
		for (int i = 0; i < petFoods.getPetFoodStrings().length; i++) {
			 str =  str + (petFoods.getPetFoodStrings())[i] +  " , ";
		}
		return str;
	}
	public void feed(Animal[] pets) {
		for (int i = 0; i < pets.length; i++) {
			if(pets[i] instanceof Cat){
				String food = InterActiveGet.getOneString("现有宠物粮食："+ displayPetFood() + "请给" + pets[i].getName() + " 喂食: " );
				Cat cat = (Cat)pets[i];
				cat.feed(food);
			}
			else if (pets[i] instanceof Dog) {
				String food = InterActiveGet.getOneString("现有宠物粮食："+ displayPetFood() + "请给" + pets[i].getName() + " 喂食: " );
				Dog dog = (Dog)pets[i];
				dog.feed(food);
			}
			
		}
		
	}
	

}
