package com.oaec.demo;

public class Person {
	//has-a 
	private Dog dog;
	
	//person ����һ������ ι��
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
