package day05;

public class Dog extends Animal implements Pet {

	final String favariteFood = "��ͷ";

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
		System.out.println("���˵�������");
	}

	@Override
	public void feed() {
		System.out.println("����ι���ͷ");
	}

	@Override
	public void makeEnjoy() {
		feed();
		System.out.println("����ι���ˣ�����");
	}

	@Override
	public void feed(String food) {
		// TODO Auto-generated method stub
		if (food.equals("��ͷ")) {
			System.out.println("��" + getName() + "ι���ͷ");
		} else {
			System.out.println(getName() + "��ϰ�߳�" + food);

		}
	}

}
