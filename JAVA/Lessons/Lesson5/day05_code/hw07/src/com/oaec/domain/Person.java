package com.oaec.domain;

import java.util.Scanner;

public class Person {
	private String name;
	private int score;
	
	// ���췽��
	public Person(){}
	public Person(String name){
		this.name= name;
	}
	public Person(String name,int score){
		/*this.name= name;*/
		this(name);
		this.score = score;
	}
	//getters and setters
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setScore(int score){
		this.score = score;
	}
	public int getScore(){
		return score;
	}
	
	//��������Ĳ�����һ��������ȭҲ��һ��
	public void chuQuan(){
		/*if(i == 1){
			System.out.println("����");
		}else if(i == 2){
			System.out.println("ʯͷ");
		}else if(i == 3){
			System.out.println("��");
		}else{
			System.out.println("������������");
		}*/
		System.out.println("���ȭ����1.���� 2.ʯͷ 3.����");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		switch (i) {
		case 1:
			System.out.println("���ȭ������");
			break;
		case 2:
			System.out.println("���ȭ��ʯͷ");
			break;
		case 3:
			System.out.println("���ȭ����");
			break;
		default:
			System.out.println("������������");
			break;
		}
	}
}
