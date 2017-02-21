package day05;


public class Lady {
	private String name;
	
	private Animal pet;

	public Lady(String name, Animal pet) {
		super();
		this.name = name;
		this.pet = pet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getPet() {
		return pet;
	}

	public void setPet(Animal pet) {
		this.pet = pet;
	}
	
	
	public void makePetHappy(Animal pet){
		
		if (this.pet.getClass().getSimpleName().equals(pet.getClass().getSimpleName())) {
			if (pet instanceof Cat) {
				Cat cat = (Cat)pet;
				System.out.print(getName());
				cat.makeEnjoy();
			}
			if (pet instanceof Dog) {
				Dog dog = (Dog)pet;
				System.out.print(getName());

				dog.makeEnjoy();
			}		
		}else {
			System.out.println(getName() + "没有养这个 " + pet);
		}
		
		
	}
	
	
	
	
	
	
}
