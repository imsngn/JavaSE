package com.oaec.test;

//final 还可以修饰类 表示该类不能被继承
//String类是final类
public final class Animal {
	 final static int age = 3;//final修饰字段
	
	//final 可以修饰方法  表示该方法不能被重写
	 public final void m(){
		
	}
	public static void main(String[] args) {
		String s = null;
		Animal a = new Animal();
		System.out.println(a.age);
		
		//a.age=5;// 加上final的属性 值不能被修改
	}
}
