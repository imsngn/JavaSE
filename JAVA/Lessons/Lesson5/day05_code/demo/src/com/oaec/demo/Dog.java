package com.oaec.demo;

// �� �� ����  ������֮���һ�ֹ�ϵ is-a��ʲôʲô��ʲô�����Ӽ���
// �� ���� ��  ���  has-a 
public class Dog extends Animal {
	//alt+shift+s
	//�һ� -> properties->java compiler ѡ1.7
	@Override
	public void eat() {
		System.out.println("�Թ�ͷ");
	}
	
	@Override
	public void rest() {
		System.out.println("����˯");
	}
	
}
