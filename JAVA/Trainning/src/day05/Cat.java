package day05;

public class Cat extends Animal implements Pet {
	final  String favariteFood = "��";

	
	private String eyeColor;

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	
	
	public Cat(String name, double weight, String eyecolor){
		super(name,weight);
		this.eyeColor = eyecolor;
		
	}

	@Override
	public void enjoy() {
		System.out.println("�������ػ���");
	}

	@Override
	public void feed( ) {
		System.out.println("ι��������");
	}
	@Override
	public void feed(String food){
		if(food.equals("��")){
			System.out.println("ι��������");
		}
		else{
			System.out.println(getName() + "��ϰ�߳�" + food);

		}
	}

	@Override
	public void makeEnjoy() {
		feed();
		System.out.println("�����ܿ���");
		
	}
	
	

	
}