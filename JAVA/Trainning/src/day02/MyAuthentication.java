package day02;

import java.awt.print.Printable;
import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

public class MyAuthentication {
	private String userString = "jim";
	private String passWord = "123456";
	private int accountError=0;
	private int passError=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void logon() {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("please input your account name: ");
		String userInputString = inputScanner.nextLine();
		if (userInputString.equals(userString)) {
			authentication();
		}else {
			accountError++;
			if (accountError == 3) {
				System.out.println("you have tried so many times with wrong userid.");
			}else {
				logon();
			}
			
			
		}
	}
	public void authentication() {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Password: ");
		String userInputString = inputScanner.nextLine();
		if (userInputString.equals(passWord)) {
			System.out.println("login successul, Welcom.");
		}else {
			passError++;
			if (passError == 3) {
				System.out.println("you have tried so many times with wrong password.");
				System.exit(1);
			}else {
				authentication();
			}
		
		}
	}

}
