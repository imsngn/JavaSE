package testMain;

import day04.BankAccount;

public class TestBankAccount {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b1 = new BankAccount("abcdefg001","123456","Hello1","female","Shanghai","123456",1000.0);
		BankAccount b2 = new BankAccount("abcdefg002","123456","Hello2","male","Shanghai","123457",1200.0);
		System.out.println(b1.deposit(1111.0).toString());
		System.out.println(b1.withDrawal(111.0).toString());
		System.out.println(b1.getBalance());
		System.out.println(b1.withDrawal(2000.1).toString());
		System.out.println(b1.withDrawal(1999.9).toString());


	}

}
