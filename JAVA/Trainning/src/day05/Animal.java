package day05;

public class Animal {
	private String name;
	private Double weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public void eat() {
		System.out.println(name + "正在吃它喜欢的食物");
	}

	public void sleep() {
		System.out.println(name + " 正在睡觉");
	}

	public void enjoy() {
		System.out.println(name + "现在很兴奋");
	}

	public Animal() {
		super();
	}

	public Animal(String name, Double weight) {
		this.name = name;
		this.weight = weight;
	}

	public Animal(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		Class animalClass = this.getClass();

		return animalClass.getSimpleName() + " [name=" + getName() + ", weight=" + getWeight() + "]";
	}

}
