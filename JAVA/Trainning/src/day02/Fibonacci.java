package day02;

import java.util.ArrayList;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] createFibList(Integer start, Integer number) {
		int[] array = new int[number];
		for (int i = 0; i < number; i++) {
			if (i == 0) {
				array[i]=start;
			}else if (i == 1) {
				array[i]=++start;
			}else {
				array[i] = array[i-1] + array[i-2];
			}
		}
		return array;
	}

}
