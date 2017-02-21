package com.oaec.domain;

import java.util.Scanner;

public class Game {
	
	private Person person;
	private Computer computer;
	//初始化两名选手 调用Person的构造方法
	
	
	public void init(){
		person = new Person();//
		computer = new Computer();
		
		System.out.println("*************************");
		System.out.println("** 猜拳 开始 **");
		System.out.println("*************************");
		System.out.println("出拳规则：1.剪刀 2.石头 3.布");
		System.out.println("请选择对方的角色：（1.刘备 2.孙权 3.曹操）");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		if(i == 1){
			computer.setName("刘备");
		}else if(i == 2){
			computer.setName("孙权");
		}else if(i == 3){
			computer.setName("曹操");
		}else{
			System.out.println("输入数字有误");
		}
		
		System.out.println("请输入你的名字");
		//从键盘输入字符串
		String personName = input.next();
		person.setName(personName);
		
		System.out.println(person.getName() +"\tvs\t"+computer.getName()+"\t对战");
	}
	
	public void start(){
		System.out.println("要开始吗？(y/n)");
		Scanner input = new Scanner(System.in);
		String res = input.next();//拿到输入的y或者是n
		//判断传入的字符串
		if(res.equals("y")){
			person.chuQuan();
			computer.chuQuan();
			//开始比较
			
			//输出结果
		}else{
			return;
		}
	}
	
	private void showResult(){
		
	}
}
