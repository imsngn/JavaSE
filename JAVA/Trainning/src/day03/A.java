package day03;

public class A {
	private int v = 100;
	
	public String guessValue(int number){
		Order result = new Order();
		return result.compare(number, v);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
