package day05;

public class Wolf extends Animal {

	@Override
	public void eat(){
		System.out.println(getName() + " ���ڳ���");
	}
	
	
	
	
	public Wolf(String name){
		super(name);
	}
}
