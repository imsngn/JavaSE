package com.oaec.domain;

public class LaserPrinter implements Printer {

	public void print(Student stu){
		System.out.println("激光打印机，打印"+ stu.toString());
	}
}
