package com.oaec.demo;

// 狗 是 动物  类与类之间的一种关系 is-a（什么什么是什么，真子集）
// 人 养了 狗  组合  has-a 
public class Dog extends Animal {
	//alt+shift+s
	//右击 -> properties->java compiler 选1.7
	@Override
	public void eat() {
		System.out.println("吃骨头");
	}
	
	@Override
	public void rest() {
		System.out.println("爬着睡");
	}
	
}
