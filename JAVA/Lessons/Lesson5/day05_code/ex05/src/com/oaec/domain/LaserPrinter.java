package com.oaec.domain;

public class LaserPrinter extends Printer {

	public void print(Student stu){
		System.out.println("激光打印机，打印"+ stu.toString());
	}
}
