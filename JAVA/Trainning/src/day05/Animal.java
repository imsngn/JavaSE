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
		System.out.println(name + "���ڳ���ϲ����ʳ��");
	}

	public void sleep() {
		System.out.println(name + " ����˯��");
	}

	public void enjoy() {
		System.out.println(name + "���ں��˷�");
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
