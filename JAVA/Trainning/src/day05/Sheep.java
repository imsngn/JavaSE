package day05;

public class Sheep extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " ³Ô²Ý");
	}

	public Sheep(String name) {
		super(name);
	}
}
