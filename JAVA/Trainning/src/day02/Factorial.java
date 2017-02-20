package day02;

public class Factorial {
	private int facResult = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public  int getFacResult( int number ) {
		fac(number);
		return facResult;
	}
	public  int getFacResult2( int number ) {
		facRecursive(number);
		return facResult;
	}
	
	private  void fac(int n) {
		int fac = 1;
		int i = 1;
		while (i <= n) {
			fac = fac * i;
			i++;
		}
		facResult = fac;
	}

	private  int facRecursive(int number) {
		if (number == 0) {
			facResult = 1;
		} else if (number == 1) {
			facResult = 1;
		} else {
			facResult = number * facRecursive(number - 1);

		}
		return facResult;
	}

}
