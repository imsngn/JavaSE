package day05;

public class Sheep extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " �Բ�");
	}

	public Sheep(String name) {
		super(name);
	}
}
