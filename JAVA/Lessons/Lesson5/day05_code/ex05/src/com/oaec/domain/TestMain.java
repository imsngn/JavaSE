package com.oaec.domain;

public class TestMain {
	public static void main(String[] args) {
		Center c = new Center();
		// nullPointerException ��ָ���쳣
		// ���÷��������� Ϊ null
		Printer p = new LaserPrinter();
		//Cannot instantiate the type Printer
		// instance ʵ��
		c.setP(p );
		
		Student stu = new Student("jack", 35);
		c.print(stu);
	}
}	
