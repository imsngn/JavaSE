package com.oaec.domain;

import java.util.Scanner;

public class Game {
	
	private Person person;
	private Computer computer;
	//��ʼ������ѡ�� ����Person�Ĺ��췽��
	
	
	public void init(){
		person = new Person();//
		computer = new Computer();
		
		System.out.println("*************************");
		System.out.println("** ��ȭ ��ʼ **");
		System.out.println("*************************");
		System.out.println("��ȭ����1.���� 2.ʯͷ 3.��");
		System.out.println("��ѡ��Է��Ľ�ɫ����1.���� 2.��Ȩ 3.�ܲ٣�");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		if(i == 1){
			computer.setName("����");
		}else if(i == 2){
			computer.setName("��Ȩ");
		}else if(i == 3){
			computer.setName("�ܲ�");
		}else{
			System.out.println("������������");
		}
		
		System.out.println("�������������");
		//�Ӽ��������ַ���
		String personName = input.next();
		person.setName(personName);
		
		System.out.println(person.getName() +"\tvs\t"+computer.getName()+"\t��ս");
	}
	
	public void start(){
		System.out.println("Ҫ��ʼ��(y/n)");
		Scanner input = new Scanner(System.in);
		String res = input.next();//�õ������y������n
		//�жϴ�����ַ���
		if(res.equals("y")){
			person.chuQuan();
			computer.chuQuan();
			//��ʼ�Ƚ�
			
			//������
		}else{
			return;
		}
	}
	
	private void showResult(){
		
	}
}
