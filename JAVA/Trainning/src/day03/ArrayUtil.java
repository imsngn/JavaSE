package day03;



public class ArrayUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {7,3,4,9,3,2,6,10,16,12,4};
		for (int i = 0; i < (selectOrderArray(array)).length; i++) {
			
			System.out.print(array[i]+" ");
			
		}
		System.out.println();
		
		for (int i = 0; i < (bubbleOrderArray(array)).length; i++) {
			
			System.out.print(array[i]+" ");
			
		}
		System.out.println();
	}
	public static int maxOfArray (int[] array) {
		int maximum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maximum) {
				maximum = array[i];
			}
		}
		return maximum;
	}
	
	public static int minOfArray (int[] array) {
		int minimum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > minimum) {
				minimum = array[i];
			}
		}
		return minimum;
	}
	//Selective order
	public static int[] selectOrderArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int swap = array[i];
					array[i] = array[j];
					array[j] = swap;
				}
			}
		}
		return array;
	}
	
	//Bubble order order
	public static int[] bubbleOrderArray(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j] > array[j+1]) {
					int swap = array[j];
					array[j] = array[j+1];
					array[j+1] = swap;
				}
			}
		}
		return array;
	}
// java default sort and order	
//	Arrays.binarySearch(a, key);

	public static int[] mergeArray (int[] array1, int[] array2) {
		int length = array1.length + array2.length;
		int[] mergedArray = new int[length];
		for (int i = 0; i < array1.length; i++) {
			mergedArray[i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) {
			mergedArray[array1.length + i] = array2[i];
		}
		
		return mergedArray;
		
	}
}
