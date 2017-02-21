package com.oaec.test;

import com.oaec.demo.Animal;
import com.oaec.demo.Dog;
import com.oaec.demo.Horse;
import com.oaec.demo.Person;

public class AnimalTest {

	public static void main(String[] args) {
		//导包 ctrl+shift+o
		// 狗是动物？ 将 Dog的引用变为Animal的引用？
		
		//多态：不同的子类具有不同的状态行为
		// 实现 多态的三个条件：
		//1. 要有 继承
		//2. 子类要重写父类的方法
		//3. 父类的引用指向子类的对象
		
		/*Animal d = new Dog();
		d.eat();//调用的 子类 Dog的方法
		d.rest();
		
		//马是动物 
		Animal h = new Horse();
		h.eat();//调用的 子类 Horse的方法
		h.rest();*/
		
		/*Person p = new Person();
		Animal d = new Dog();
		p.feed(d);
		
		Animal h = new Horse();
		p.feed(h);*/
		
		//向上转型 向下转型
		Animal d = new Dog();
		//编译的时候是 Animal类型， 运行时 是Dog类型  这个就是动态绑定
		System.out.println(d.getClass());
		//d.eat();//编译阶段的错误，编译类型Object，里面没有eat() 这个方法
		
		//强制类型转换 
		//Horse h = (Horse) d;//ClassCastException类型转换异常
		//house
		// 判断 d 是不是 Horse这个类型？ instanceof
		if(d instanceof Dog ){
			System.out.println("d 是 Dog这个类型");
		}		
	}
}
