package com.oaec.domain;

public class AccountTest {
	public static void main(String[] args) {
		//����Account ������ʵ��
		
		Account account = new Account(1, "123", "frank", "male", "�Ϻ�", "110", 20000);
		
		//��ʾ�˻�����Ϣ
		System.out.println(account.toString());
		System.out.println(account.hashCode());
		System.out.println(Integer.toHexString(account.hashCode()));
		/*//��������
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
