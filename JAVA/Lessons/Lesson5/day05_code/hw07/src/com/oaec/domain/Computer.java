package com.oaec.domain;

import java.util.Random;
import java.util.Scanner;

public class Computer {
	private String name;
	private int score;

	// ���췽��
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

	// ��������Ĳ�����һ��������ȭҲ��һ��
	public void chuQuan() {

		// java.util.Random ��
		Random random = new Random();
		// ����0-3������� ��Ҫ0
		int i = random.nextInt(3) + 1;
		//System.out.println(i);
		// ���� �����
		switch (i) {
		case 1:
			System.out.println(name + "��ȭ������");
			break;
		case 2:
			System.out.println(name + "��ȭ��ʯͷ");
			break;
		case 3:
			System.out.println(name + "��ȭ����");
			break;
		default:
			System.out.println("������������");
			break;
		}
	}
}
