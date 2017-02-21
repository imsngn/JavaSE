package com.oaec.domain;

public abstract class Printer {
	
	// 这里没有必须写方法体,父类方法体怎么实现，和最终的结果没有关系
	// 这里 把方法体去掉，只做方法的声明即可，实现交给子类
	// 方法要做成 抽象方法 方法的声明 加上 abstract 修饰符
	// 包含抽象方法的类 是抽象类，该类也要加上abstract 修饰符，抽象类 不一定有抽象方法
	
	// 子类继承了抽象父类， 一定要实现，重写父类的抽象方法
	// 抽象类不能实例化 
	// Animal 交通工具
	public abstract void print(Student stu);
	
	// 抽象类里面可以包含已经实现的方法
	public void m(){
		
	}
}
