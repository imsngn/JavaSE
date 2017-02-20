package day02;

import java.util.ArrayList;

public class MyNumber {

	public  void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ArrayList<Integer> reverseArrayList(ArrayList<Integer> arr) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = arr.size()-1; i >= 0; i--) {
			arrayList.add(arr.get(i));
		}
		return arrayList;
	}
	public ArrayList<Integer> PrintSpecificRangeDigit(int number, int start,int end) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int length = decideLengthOfInterger(number);
		for (int i = 0; i < length; i++) {
			if (i < length -1 ) {
				int element = number%10;
				arrayList.add(element);
				number /= 10;
			}else {
				arrayList.add(number);
			}
		}
		ArrayList<Integer> arrayListReverse = new ArrayList<Integer>();
		ArrayList<Integer> targetList = new ArrayList<Integer>();

		for (int i = arrayList.size()-1; i >= 0; i--) {
			arrayListReverse.add(arrayList.get(i));
		}
		for (int i = start; i <= end; i++) {
			targetList.add(arrayListReverse.get(i-1));
		}
		return targetList;
	}
	public ArrayList<Integer> PrintSpecificRangeDigit(int number) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int length = decideLengthOfInterger(number);
		for (int i = 0; i < length; i++) {
			if (i < length -1 ) {
				int element = number%10;
				arrayList.add(element);
				number /= 10;
			}else {
				arrayList.add(number);
			}
		}
		ArrayList<Integer> arrayListReverse = new ArrayList<Integer>();
		for (int i = arrayList.size()-1; i >= 0; i--) {
			arrayListReverse.add(arrayList.get(i));
		}
		return arrayListReverse;
	}
	public  int decideLengthOfInterger(int number) {
		if (number / 10 == 0 && number % 10 != 0) {
			return 1;
		} else {
			return 1 + decideLengthOfInterger(number / 10);
		}

	}
	public  boolean isEven(int number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public  int sumOfEvenNumber() {
		int sumofeven = 0;
		int i = 1;
		while (i <= 100) {
			if (isEven(i)) {
				sumofeven += i;
			}
			i++;

		}
		return sumofeven;

	}

	public  int sumOfOddNumber() {
		int sumofodd = 0;
		int i = 1;
		while (i <= 100) {
			if (!isEven(i)) {
				sumofodd += i;
			}
			i++;

		}
		return sumofodd;

	}

	public  int sumOfRange(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;

	}

	public  int sumOfRange(int start, int end, int step) {
		int sum = 0;
		for (int i = start; i <= end; i += step) {
			sum += i;

		}
		return sum;
	}

	public  int oddSumOfRange(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			if (!isEven(i)) {
				sum += i;
			}
		}
		return sum;

	}
	public  int evenSumOfRange(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			if (isEven(i)) {
				sum += i;
			}
		}
		return sum;

	}
	
}
