package testMain;

import day04.MyTime;

public class testMyTime {
	
	public static void main(String[] args){
		MyTime watch01 = new MyTime(18,48,01);
		System.out.println(watch01.toString());
		System.out.println(watch01.addHour(3).toString());
		System.out.println(watch01.addHour(6).toString());
		System.out.println(watch01.addHour(50).toString());
		System.out.println(watch01.addMinute(6).toString());
		System.out.println(watch01.addMinute(6).toString());
		System.out.println(watch01.addSecond(20).toString());
		System.out.println(watch01.subSecond(3622).toString());
		System.out.println(watch01.subMinute(61).toString());
		System.out.println(watch01.subMinute(240).toString());
		System.out.println(watch01.subMinute(722).toString());
		watch01.subHour(73).display();
		watch01.subHour(2).display();
		watch01.subHour(12).display();
		watch01.addMinute(50).display();
		watch01.addSecond(1801).display();
		watch01.subSecond(1802).display();
	}
	

}
