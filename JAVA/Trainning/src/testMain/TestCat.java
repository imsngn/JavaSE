package testMain;

import day03.Cat;
import day03.CatLoverWithTwoCats;

public class TestCat {
	public static void main(String[] args) {
		Cat c01 =new Cat("С��",2,"black");
		Cat c02 = new Cat("С�� ",5,"white");
		
		CatLoverWithTwoCats xiaoHong = new CatLoverWithTwoCats(c01,c02);
		xiaoHong.queryCat("С��","С��");
		xiaoHong.queryCat("С��","С�� ");
		xiaoHong.queryCat("С��","С��");



	}

}
