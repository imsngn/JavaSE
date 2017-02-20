package day02;

import java.security.AllPermission;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.InitialContext;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 1;
//		int sum = 0;
//		while (i <= 100) {
//			sum += i;
//			i++;
//		}
//		System.out.println("sum is " + sum);
		
		
//		Factorial fac = new Factorial();
//		int facvalue = fac.getFacResult(10);
//		System.out.println("fac is " + facvalue);
//		int facvalue2 = fac.getFacResult2(10);
//		System.out.println("fac2 is " + facvalue2);

		
		int number_ = getOneInterger();
		MyNumber mynumber = new MyNumber();
		int length = mynumber.decideLengthOfInterger(number_);
		System.out.println("length is " + length);
		
		
//		int sumofeven = num.sumOfEvenNumber();
//		int sumofodd = num.sumOfOddNumber();
				
//		System.out.println("sum of even number is " + sumofeven);
//		System.out.println("sum of odd number is " + sumofodd);
		System.out.println("The sum of 1 .. 50 is " + mynumber.sumOfRange(1, 50));
		System.out.println("The sum of odd number of  100 .. 200 is " + mynumber.oddSumOfRange(100, 200));
		System.out.println("The sum of integers, not times 4 and not times 7 is " + timesNot4Not7(1, 300));
		
		
		System.out.println("the average money per day is " + appleMoney());
		
		
		System.out.println("The current value is " + getCurrentValue());
		
		
		System.out.println("the year " + getWhichYear() + " shall reach 200000 persons");
		
		
		
	
		DaffodiNumber DN = new DaffodiNumber();
		int[] DaffodiNumber = DN.getAllDaffodiNumber(100, 99999);
		System.out.print("all Daffodinumber are ");
		for (int j = 0; j < DaffodiNumber.length; j++) {
			if (DaffodiNumber[j] != 0) {
				System.out.print(" " + DaffodiNumber[j]);

			}

		}
		
		
		System.out.println("");
		System.out.print("all Daffodinumber caluted by arraylist are ");

		ArrayList<Integer> al = new ArrayList<Integer>();
		al = DN.getAllDaffodiNumber2(100, 99999);
		for (Integer integer : al) {
			
			System.out.print(" "+integer);
		}
		
		
		//1+2!+3!+..+n!
		int startFacNumber = getOneInterger();
		int endFacNumber = getOneInterger();
		int facResult = sumFactorialOfRange(startFacNumber,endFacNumber);
		System.out.println("sum of fac from "+ startFacNumber  + " and 	"+endFacNumber + "is "+ facResult);
		
		
		// lastDigitOfPower();
		ArrayList<Integer> arrayList = last3DigitOfPower();
		System.out.println();
		for (Integer integer : arrayList) {
			System.out.print(integer);
		}
		System.out.println();
		
		//celsius to Fahrenheit
		Temperature temperature = new Temperature();
		ArrayList<Double> celsiusList = temperature.createTemperatureTable(0, 250, 20);
		ArrayList<Double> fahrenlist = temperature.cel2FahTable(0, 250, 20);
		for (int i = 0; i < celsiusList.size(); i++) {
			System.out.printf("%.2f ---------------------> %.2f\n", celsiusList.get(i),fahrenlist.get(i));
		}
		
		
		
		// addition a + aa  + aaa+ ...
		int addition = addition();
		System.out.println("The final result is" + addition);
		
		
		//1/2 +  2/3 + 3/5 + 5/8 + ...
		double sumOfFib =  sumOfFib(1,2, 20);
		System.out.println();
		System.out.printf(" sumOfFib is %.3f", sumOfFib);
		sumOfFib =  sumOfFib(1,3,20);
		System.out.printf(" sumOfFib is %.3f", sumOfFib);

		//落球
		double sum = 0;
		int times = 0;
		for (double i = 100; ; i=i/2) {
			times++;
			if (times == 1 ) {
				sum += 100;
			}else {
				sum += 2*i;
			}
			if (times == 5) {
				System.out.println("till 5th times, ball go through totally "+ sum + " meters");
				System.out.println("ball for the 5th times will jump "+ i/2  +" metes");
				break;
			}
		}
		
		// 1+2!+3!+..6!
		
		
		
		//完数
		int number = getOneInterger();
		System.out.println("all complete number within number are :");

		for (int i = 1; i < number; i++) {
			if (isCompleteNumber(i)) {
				System.out.print(i);
				System.out.println();
			}
		}
		
		//公约数 公倍数
		
		int firstNumber = Shopping.getOneInterger("please input first number: ");
		int secondNumber = Shopping.getOneInterger("Please input second number: " );
		Factor factorList = new Factor();
		
		ArrayList<Integer> firstFactorList = factorList.generateFactorList(firstNumber);
		ArrayList<Integer> secondFactorList = factorList.generateFactorList(secondNumber);
		
		MyArray myarray = new MyArray();
		ArrayList<Integer> mergedFactorList = myarray.concatArray(firstFactorList, secondFactorList);
		
		System.out.println("最大公约数"+": "+MyArray.maximumElement(mergedFactorList));
		
		for (int i = secondNumber; ; i++) {
			if (i % firstNumber == 0 && i % secondNumber == 0) {
				System.out.println("最小公倍数: " + i);
				break;

			}
		}
		
		//第一天的桃子
		int pechNumber = peachNumber();
		System.out.println("the number on 1st day is "+peachNumber());
		System.out.println("the number on 1st day is "+peachNumberRecursive(1));
		
		//海滩上至少多少桃子
		int beachNumber = peachNumberRecursive2();
		System.out.println("the number of peaches on the beach is "+peachNumberRecursive2());
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d %d %d %d %d %d   throw 1\n", beachNumber,(beachNumber-1)/5,(beachNumber-1)/5,(beachNumber-1)/5,(beachNumber-1)/5,(beachNumber-1)/5);
			beachNumber = (beachNumber -1)*4/5;

		}
		
		
		
		// print 90 = 2*3*3*5
		int num = getOneInterger();
		printPrimeFactors(num);
		
		
		// prime numbers between a range
		ArrayList<Integer> primeArrayList = new ArrayList<Integer>();
		
		Integer start = getOneInterger();
		Integer end = getOneInterger();
		System.out.println("prime number between " + start +" "+ end );
		primeArrayList = PrimeNumOfRange(start,end);
		for (Integer integer : primeArrayList) {
			System.out.print(integer+" ");
		}
		
/*
		*
		**
		***
		****
*/
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
/*		
		*
		**
		***
		****
		***
		**
		*
*/
		for(int i = 0; i<4;i++) {
			for (int j = 1; j <= i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 6; i>3;i--) {
			for (int j = 1; j <= i-3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
/*		
	     *
	    **
	   ***
	  ****
	 *****		
*/
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	//	打印菱形
		
/*	     *
	    **
	   ***
	  ****
	 *****
	 **** 
	 ***  
	 **   
	 *  */
		
		//先打印上面5行
		for (int i=0;i<6;i++) {
			//打印空格
			for (int j=0;j<5-i;j++) {
				System.out.print(" ");
			}
			//打印*
			for (int k=0;k<i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		//打印下面4行
		for (int i=0;i<4;i++) {
			//打印*
			for (int k = 0; k <4-i ; k++) {
				System.out.print("*");
			}
			//打印空格
			for (int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		
		}
		
	//shopping
	Shopping myShopping = new Shopping();
	myShopping.shoppingPrompt();
	myShopping.itemPay();
	// authentication jim 
		MyAuthentication authentication = new MyAuthentication();
		authentication.logon();
	
		
		
	//FlipFlop
		for(int i=1;i<101;i++){
			if (i%3 == 0 && i%5 != 0) {
				System.out.print("Flip");
			}else if (i%3 !=0 && i%5 ==0) {
				System.out.print("Flop");
			}else if (i%3 ==0 && i%5 ==0) {
				System.out.print("FlipFlop");
			}else {
				System.out.print(i);
			}
		}
		
	//鸡兔
		for (int i = 0;i<35 ; i++) {
			for (int j = 35-i; j>0; j--) {
				if (i*2+j*4 == 94 && i+j ==35) {
					System.out.println();
					System.out.println("there are "+i+" chickens and "+j+" rabbits");
				}
			}
			
		}
	//马克思
		
		for (int i = 1; i < 30; i++) {
			for (int j = 80-2*i; j >0 ; j--) {
				for (int k = i+10; k >0; k--) {
					if (i+j+k == 30 && 3*i+2*j+k == 50) {
						System.out.println(i+" "+j+" "+k);
					}
				}
			}
		}
		
	//九九
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.println();
		}
		
	//百钱
		for (int j = 0; j < 100; j++) {
			for (int i = (200-8*j)/14; i >0 ; i--) {
				if ((200-8*j)%14 != 0) {
					continue;
				}
				for (int k = 100-j-i; k >0; k--) {
					if (i+j+k == 100 && 15*i+9*j+k ==300) {
						System.out.println(i+" "+j+ " "+k);
					}
				}
			}
		}
	}
	
	
	
	public static int sumFactorialOfRange(int start, int end) {
	
		int sum = 0;
		Factorial myFactorial = new Factorial();
		
		for (int i = start; i <= end; i++) {
			sum += myFactorial.getFacResult(i);
		}
		return sum;
	}
	
	public static ArrayList<Integer> PrimeNumOfRange (Integer start, Integer end) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Prime prime =new Prime();
		for (int i = start; i < end; i++) {
			if (prime.isPrime(i)) {
				arrayList.add(i);
			}
		}
		return arrayList;
	}
	
	public static void printPrimeFactors(int number) {
		Factor factor = new Factor();
		Prime myPrime = new Prime();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList = factor.generatePrimeFactorList(number);
		
		int mul=1;
		for (Integer integer : arrayList) {
			mul = mul * integer;
		}
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

		while (number/mul != 1) {
			int temp = number/mul;
			if (myPrime.isPrime(temp)) {
				arrayList.add(temp);
				mul = mul * temp;
			}else {
				arrayList2 = factor.generatePrimeFactorList(temp);
				for (Integer integer : arrayList2) {
					System.out.println("interger is "+integer);
					arrayList.add(integer);
					mul = mul * integer;
				}
				
			}
			
		}
		ArrayList<Integer> sortArrayList = new ArrayList<Integer>();
		//ArrayList<Integer> uniqArrayList = new ArrayList<Integer>();
		MyArray myArray= new MyArray();
		sortArrayList = myArray.sortArrayList(arrayList);
		//uniqArrayList = myArray.UniqArrayList(sortArrayList);
		System.out.printf(number+"=");
		for (int i = 0; i < sortArrayList.size(); i++) {
			System.out.print(sortArrayList.get(i));
			if (i < sortArrayList.size()-1) {
			System.out.print("*");
			}
		}
	}
	
	public static int  peachNumber() {
		//根据第10天的桃子的数量反推前边九天的数量
		int sum =1; //第十天 1个桃子
		for (int i = 0; i < 9; i++) {
			sum = (sum+1)*2;
		}
		return sum;
	}
	
	//递归求值
	public static int peachNumberRecursive(int day) {
		if (day == 10) {
			return 1;
		}else {
			return (peachNumberRecursive(day+1) + 1 ) *2;
		}
	}

	public static int peachNumberRecursive2() {
		for (int i = 6; ; i=i+5) {
			int left = i;
			int times = 0;
			for (int j = 0; j <= 3; j++) {
				left = (left-1) * 4/5;
				if ((left-1)%5 != 0) {
					break;
				}else {
					times++;
					if (times == 4) {
						return i;
						
					}
				}
			}
		}
	}
	

	public static boolean isCompleteNumber(Integer number) {
		Factor factor = new Factor();
		ArrayList<Integer> factorList = new ArrayList<Integer>();
		factorList=factor.generateFactorList(number);
		Integer sum = 0;
		for (Integer integer : factorList) {
			sum += integer;
		}
		if (sum.equals(number)) {
			return true;
		}else {
			return false;
		}
	}
	public static double sumOfFib(int start1,int start2, int number) {
		Fibonacci fibonacci = new Fibonacci();
		int [] array1 = new int[number];
		int [] array2 = new int[number];

		array1 = fibonacci.createFibList(start1, number);
		array2 = fibonacci.createFibList(start2, number);
		double sum =0;
		for (int i = 0; i < number; i++) {
			sum += (double)array1[i]/array2[i];
		}
		return sum;
	}
	public static ArrayList<Integer> last3DigitOfPower() {
		ArrayList<Integer> arrayList;
		MyNumber mynum = new MyNumber();
		int number = 0;
		number = getOneInterger();
		int power = getOneInterger();
		int result = (int)Math.pow(number, power);
		int length = mynum.decideLengthOfInterger(result);
		if (length >= 3) {
			arrayList= mynum.PrintSpecificRangeDigit(result,length-2,length);
			return arrayList;
		}else {
			arrayList= mynum.PrintSpecificRangeDigit(result);
			for (int i = 0; i < 2; i++) {
				arrayList.add(0);
			}
			return mynum.reverseArrayList(arrayList);
		}
	//	return mynum.reverseArrayList(arrayList);
		//return arrayList;
	}

	

	public static int timesNot4Not7(int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			if (i % 4 != 0 && i % 7 != 0) {
				sum += i;
			}
		}
		return sum;
	}

	
	public static double appleMoney() {
		double money = 2.4;
		double sum = 0;
		double number = 0;
		double average;
		int days;
		for (days = 1; number < 129; days++) {
			number = Math.pow(2, days);
			if (number >= 129) {
				days--;
				break;
			}
			sum += money * number;
//			System.out.println(days + "day buy " + number + " apples, spend " + sum + " money");
		}
		average = sum / days;
		return average;
	}

	public static int getCurrentValue() {
		int sum = 0;
		int i;
		for (i = 1; i <= 10; i++) {
			sum += i;
			if (sum > 20) {
				break;
			}
		}
		return i;
	}

	public static int getWhichYear() {
		int year = 2006;
		double initial = 80000;
		float rate = 0.25f;
		double target = 200000;
		int number = 0;
		while (initial < target) {
			number++;
			initial = initial * (1 + rate);

		}
		return year + number;

	}

	

	public static void lastDigitOfPower() {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Please one interger here: ");
			int number = input.nextInt();
			System.out.println("Please input the power value: ");
			int power = input.nextInt();
			int sum = 1;
			for (int i = 1; i <= power; i++) {
				sum = sum * number;
			}
			System.out.println("the last three digits are " + sum / 100 % 10 + " " + sum / 10 % 10 + " " + sum % 10);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("input not correct");
		} finally {
			input.close();
		}
	}

	
	public static int getOneInterger() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a interger here :");
		try {
			int number = input.nextInt();
			return number;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("invalid input");
		} 
		return 1;
	}
	
	public static int addition() {
		int num = getOneInterger();
		int times = getOneInterger();
		int sum = 0;
		for (int i = 0; i < times; i++) {
			for (int j = 0; j <= i;j++)
				sum += num * Math.pow(10, j);
		}
		return (int)sum;
	
	}
}
