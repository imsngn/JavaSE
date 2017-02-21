package com.oaec.domain;

import java.util.Random;
import java.util.Scanner;

public class Computer {
	private String name;
	private int score;

	// 构造方法
	public Computer() {
	}

	public Computer(String name) {
		this.name = name;
	}

	public Computer(String name, int score) {
		/* this.name= name; */
		this(name);
		this.score = score;
	}

	// getters and setters

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	// 根据输入的参数不一样，出的拳也不一样
	public void chuQuan() {

		// java.util.Random 类
		Random random = new Random();
		// 产生0-3的随机数 不要0
		int i = random.nextInt(3) + 1;
		//System.out.println(i);
		// 产生 随机数
		switch (i) {
		case 1:
			System.out.println(name + "出拳：剪刀");
			break;
		case 2:
			System.out.println(name + "出拳：石头");
			break;
		case 3:
			System.out.println(name + "出拳：布");
			break;
		default:
			System.out.println("输入数字有误");
			break;
		}
	}
}
