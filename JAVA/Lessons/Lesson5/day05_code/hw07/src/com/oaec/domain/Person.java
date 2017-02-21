package com.oaec.domain;

import java.util.Scanner;

public class Person {
	private String name;
	private int score;
	
	// 构造方法
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
	
	//根据输入的参数不一样，出的拳也不一样
	public void chuQuan(){
		/*if(i == 1){
			System.out.println("剪刀");
		}else if(i == 2){
			System.out.println("石头");
		}else if(i == 3){
			System.out.println("布");
		}else{
			System.out.println("输入数字有误");
		}*/
		System.out.println("请出拳：（1.剪刀 2.石头 3.布）");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		switch (i) {
		case 1:
			System.out.println("你出拳：剪刀");
			break;
		case 2:
			System.out.println("你出拳：石头");
			break;
		case 3:
			System.out.println("你出拳：布");
			break;
		default:
			System.out.println("输入数字有误");
			break;
		}
	}
}
