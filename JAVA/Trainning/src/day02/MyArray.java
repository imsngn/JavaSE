package day02;

import java.util.ArrayList;

public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int maximumElement(ArrayList<Integer> array) {
		int max=0;
		for (Integer integer : array) {
			if (max < integer) {
				max = integer;
			}
		}
		return max;
	}
	public ArrayList<Integer> concatArray(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2 ){
		ArrayList<Integer> mergedArrayList = new ArrayList<Integer>();
		for (Integer integer : arrayList1) {
			mergedArrayList.add(integer);
		}
		for (Integer integer : arrayList2) {
			mergedArrayList.add(integer);

		}
		return mergedArrayList;
	}
	public ArrayList<Integer> sortArrayList(ArrayList<Integer> arrayList){
		Integer swap=0;
		
		for (int i = 0; i < arrayList.size()-1; i++) {
			for (int j = 0; j < arrayList.size()-i-1; j++) {
				if (arrayList.get(j) > arrayList.get(j+1)) {
					swap = arrayList.get(j);
					arrayList.set(j, arrayList.get(j+1));
					arrayList.set(j+1,swap);
				}
			}
		}
		return arrayList;
	}
	public ArrayList<Integer> UniqArrayList(ArrayList<Integer> arrayList){
		int index = 0;
		Integer swp =0;
		int size = arrayList.size();
		ArrayList<Integer> uniqArrayList = new ArrayList<Integer>();
		for (int i = 0; i < size-1; i++) {
			if (!arrayList.get(i).equals(arrayList.get(i+1))) {
				swp = arrayList.get(i);
				uniqArrayList.add(swp);
			}else {
				continue;
			}
		}
		swp = arrayList.get(size-1);
		uniqArrayList.add(swp);
			

			
		return uniqArrayList;
	}
}
