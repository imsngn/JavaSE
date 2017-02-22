package day05;

public class Dog extends Animal implements Pet {

	final String favariteFood = "骨头";

	private String furColor;

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	public Dog(String name, double weight, String furcolor) {
		super(name, weight);
		this.furColor = furcolor;
	}

	public void enjoy() {
		System.out.println("高兴地汪汪叫");
	}

	@Override
	public void feed() {
		System.out.println("给狗喂肉骨头");
	}

	@Override
	public void makeEnjoy() {
		feed();
		System.out.println("狗狗喂饱了，高兴");
	}

	@Override
	public void feed(String food) {
		// TODO Auto-generated method stub
		if (food.equals("骨头")) {
			System.out.println("给" + getName() + "喂肉骨头");
		} else {
			System.out.println(getName() + "不习惯吃" + food);

		}
	}

}
