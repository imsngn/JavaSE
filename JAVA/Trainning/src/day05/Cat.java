package day05;

public class Cat extends Animal implements Pet {
	final  String favariteFood = "Óã";

	
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
		System.out.println("ß÷ß÷ß÷µØ»¶½Ð");
	}

	@Override
	public void feed( ) {
		System.out.println("Î¹ß÷ß÷³ÔÓã");
	}
	@Override
	public void feed(String food){
		if(food.equals("Óã")){
			System.out.println("Î¹ß÷ß÷³ÔÓã");
		}
		else{
			System.out.println(getName() + "²»Ï°¹ß³Ô" + food);

		}
	}

	@Override
	public void makeEnjoy() {
		feed();
		System.out.println("ß÷ß÷ºÜ¿ªÐÄ");
		
	}
	
	

	
}