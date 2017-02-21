package com.oaec.domain;

public class Center {
	private Printer p;
	
	
	
	public Printer getP() {
		return p;
	}



	public void setP(Printer p) {
		this.p = p;
	}



	public void print(Student stu){
		System.out.println(p);
		p.print(stu);
	}
}
