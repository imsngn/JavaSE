package testMain;

import day03.A;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		String compare = a.guessValue(100);
		System.out.println(compare);
		compare = a.guessValue(90);
		System.out.println(compare);
		compare = a.guessValue(101);
		System.out.println(compare);
	}

}
