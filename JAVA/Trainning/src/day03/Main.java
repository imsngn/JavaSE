package day03;

import day02.Fibonacci;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print {7,3,4,9,3,2,6,10,16,12,4} Maxisum and Minimun value
		int[] array = {7,3,4,9,3,2,6,10,16,12,4};
		System.out.println("the maximum value is " + ArrayUtil.maxOfArray(array));
		System.out.println("the minimux value is " + ArrayUtil.minOfArray(array));
		
		//merge two array
		int[] array1 = {7,12,4,9,6,3,9};
		int[] array2 = {2,6,3,54,2,56,21,33};
		int[] mergedArray = ArrayUtil.mergeArray(array1, array2);
		System.out.println("The merged array is");
		for (int i = 0; i < mergedArray.length; i++) {
			System.out.print(mergedArray[i]+",");
		}
		System.out.println();
		
		// 1 1 2 3 5 8 13 ... print 1~20 
		Fibonacci fibList = new Fibonacci();
		int[] myfibList = fibList.createFibList(1, 20);
		for (int i = 0; i < myfibList.length; i++) {
			System.out.print(myfibList[i]+",");
		}
	
	}

}
