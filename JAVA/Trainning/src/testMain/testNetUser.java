package testMain;

import day04.NetUser;

public class testNetUser {
	public static void main(String[] args){
		NetUser user01 = new NetUser("A0001","A0001X");
		System.out.println(user01.toString());
		
		NetUser user02 = new NetUser("A0002","A0002X","A0002@163.com");
		System.out.print(user02.toString());
	}
	
}
