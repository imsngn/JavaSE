package day02;

import java.util.ArrayList;

public class DaffodiNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public  int[] getAllDaffodiNumber(int start, int end) {
		int[] Daffodinumber = new int[100];
		int index = 0;
		for (int i = start; i < end; i++) {
			if (isDaffodiNumber(i)) {
				Daffodinumber[index] = i;
				index++;
			}
		}
		return Daffodinumber;
	}
	public  ArrayList<Integer> getAllDaffodiNumber2(int start, int end) {
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		for (int i = start; i < end; i++) {
			if (isDaffodiNumber(i)) {
				myArrayList.add(i);
			}
		}
		return myArrayList;
	}
	public static boolean isDaffodiNumber(int number) {
		MyNumber num = new MyNumber();
		int length = num.decideLengthOfInterger(number);
		int[] list = new int[length];
		int number2 = number;
		for (int i = 0; i < length; i++) {
			if (num.decideLengthOfInterger(number2) > 1) {
				list[i] = number2 % 10;
				number2 = number2/10;
			}else if (num.decideLengthOfInterger(number2) == 1) {
				list[i] = number2;
			}
		
		}
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum +=  (int)Math.pow(list[i], length);
		}
		if (sum == number) {
			return true;
		}
//		if (Math.pow(number / 100, 3) + Math.pow(number / 10 % 10, 3) + Math.pow(number % 10, 3) == number) {
//			return true;
//		}

		return false;
	}

}
