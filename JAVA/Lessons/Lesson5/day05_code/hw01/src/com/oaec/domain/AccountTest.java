package com.oaec.domain;

public class AccountTest {
	public static void main(String[] args) {
		//创建Account 这个类的实例
		
		Account account = new Account(1, "123", "frank", "male", "上海", "110", 20000);
		
		//显示账户的信息
		System.out.println(account.toString());
		System.out.println(account.hashCode());
		System.out.println(Integer.toHexString(account.hashCode()));
		/*//设置密码
		account.setPassword("321");
		System.out.println(account.toString());
		
		account.setBalance(-1);
		System.out.println(account.toString());
		
		account.cunQian(1000);
		System.out.println(account.getBalance());
		
		account.quQian(2000);
		System.out.println(account.getBalance());
		
		account.quQian(500);
		System.out.println(account.getBalance());*/
		System.out.println(account.getClass());
	}
	
}
