package com.oaec.test;

//final ������������ ��ʾ���಻�ܱ��̳�
//String����final��
public final class Animal {
	 final static int age = 3;//final�����ֶ�
	
	//final �������η���  ��ʾ�÷������ܱ���д
	 public final void m(){
		
	}
	public static void main(String[] args) {
		String s = null;
		Animal a = new Animal();
		System.out.println(a.age);
		
		//a.age=5;// ����final������ ֵ���ܱ��޸�
	}
}
