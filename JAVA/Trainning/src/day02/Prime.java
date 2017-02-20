package day02;

import java.util.ArrayList;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isPrime(int number){
		Factor myfactor = new Factor();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList = myfactor.generateFactorList(number);
		if (arrayList.size() == 1) {
			return true;
		}else {
			return false;
		}
	}
}
