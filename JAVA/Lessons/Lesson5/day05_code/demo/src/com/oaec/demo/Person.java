package com.oaec.demo;

public class Person {
	//has-a 
	private Dog dog;
	
	//person 具有一个方法 喂狗
	/*public void feed(Dog d){
		d.eat();
	}
	
	public void feed(Horse h){
		h.eat();
	}*/
	public void feed(Animal a){
		a.eat();
	}
	
}
