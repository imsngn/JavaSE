package day02;

import java.util.ArrayList;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isFactor(int number1, int number2) {
		if ( number2 % number1 == 0) {
			return true;
		}else {
			return false;
		}
	}
	public ArrayList<Integer> generateFactorList(Integer number) {
		int index = 0;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		/*if (number == 1) {
			arrayList.add(1);
		}*/
		for (int i = 1; i <= number/2; i++) {
			if (isFactor(i, number)) {
				arrayList.add(i);
				index++;
			}
		}
		return arrayList;
	}
	public ArrayList<Integer> generateFactorList2(Integer number) {
		int index = 0;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for (int i = 1; i <= number/2; i++) {
			if (isFactor(i, number)) {
				arrayList.add(i);
				index++;
			}
		}
		return arrayList;
	}
	public ArrayList<Integer> generatePrimeFactorList(Integer number) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

		Factor factor = new Factor();
		Prime prime = new Prime();
		arrayList = factor.generateFactorList2(number);
		
		for (Integer integer : arrayList) {
			if (prime.isPrime(integer)) {
				arrayList2.add(integer);
			}
		}
		return arrayList2;
		
	}
}
