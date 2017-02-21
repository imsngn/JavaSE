package com.oaec.domain;

public class TestMain {
	public static void main(String[] args) {
		Center c = new Center();
		// nullPointerException 空指针异常
		// 调用方法的引用 为 null
		Printer p = new LaserPrinter();
		//Cannot instantiate the type Printer
		// instance 实例
		c.setP(p );
		
		Student stu = new Student("jack", 35);
		c.print(stu);
	}
}	
