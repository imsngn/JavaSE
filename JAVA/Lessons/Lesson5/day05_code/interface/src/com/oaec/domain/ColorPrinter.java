package com.oaec.domain;

public class ColorPrinter implements Printer{
	public void print(Student stu){
		System.out.println("彩色打印机，打印"+ stu.toString());
	}
}
