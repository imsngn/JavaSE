package com.oaec.domain;

// 声明接口 不能用class关键字，是interface关键字
// 接口里面的方法都是抽象方法（都是公开的），不能实例化
public interface IAble {
	// 定义静态常量 默认有static public final
	int i = 3;
	void m();//默认有public修饰符
}
