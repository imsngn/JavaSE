package com.oaec.domain;

public class BlackPrinter implements Printer{
	
	
	public void print(Student stu){
		System.out.println("ºÚ°×´òÓ¡»ú£¬´òÓ¡"+ stu.toString());
	}
}
