package testMain;

import day03.Cat;
import day03.CatLoverWithTwoCats;

public class TestCat {
	public static void main(String[] args) {
		Cat c01 =new Cat("小黑",2,"black");
		Cat c02 = new Cat("小白 ",5,"white");
		
		CatLoverWithTwoCats xiaoHong = new CatLoverWithTwoCats(c01,c02);
		xiaoHong.queryCat("小红","小黑");
		xiaoHong.queryCat("小红","小白 ");
		xiaoHong.queryCat("小红","小黄");



	}

}
