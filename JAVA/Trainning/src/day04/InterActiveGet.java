package day04;

import java.util.Scanner;

public class InterActiveGet {
	public static int getOneInterger(String prompt) {
		Scanner input = new Scanner(System.in);
		System.out.println(prompt);
		try {
			int number = input.nextInt();
			return number;
		} catch (Exception e) {
			System.out.println("invalid input");
		} 
		return 1;
	}
	
	public static String getOneInputString(String prompt){
		Scanner input = new Scanner(System.in);
		System.out.println(prompt);
		try{
			String str = input.nextLine();
			return str;
		}
		catch (Exception e) {
			System.out.println("invalid input");
		} 
		return "abc";
		
	}
}
