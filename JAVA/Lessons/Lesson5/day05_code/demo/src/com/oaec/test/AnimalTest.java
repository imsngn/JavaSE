package com.oaec.test;

import com.oaec.demo.Animal;
import com.oaec.demo.Dog;
import com.oaec.demo.Horse;
import com.oaec.demo.Person;

public class AnimalTest {

	public static void main(String[] args) {
		//���� ctrl+shift+o
		// ���Ƕ�� �� Dog�����ñ�ΪAnimal�����ã�
		
		//��̬����ͬ��������в�ͬ��״̬��Ϊ
		// ʵ�� ��̬������������
		//1. Ҫ�� �̳�
		//2. ����Ҫ��д����ķ���
		//3. ���������ָ������Ķ���
		
		/*Animal d = new Dog();
		d.eat();//���õ� ���� Dog�ķ���
		d.rest();
		
		//���Ƕ��� 
		Animal h = new Horse();
		h.eat();//���õ� ���� Horse�ķ���
		h.rest();*/
		
		/*Person p = new Person();
		Animal d = new Dog();
		p.feed(d);
		
		Animal h = new Horse();
		p.feed(h);*/
		
		//����ת�� ����ת��
		Animal d = new Dog();
		//�����ʱ���� Animal���ͣ� ����ʱ ��Dog����  ������Ƕ�̬��
		System.out.println(d.getClass());
		//d.eat();//����׶εĴ��󣬱�������Object������û��eat() �������
		
		//ǿ������ת�� 
		//Horse h = (Horse) d;//ClassCastException����ת���쳣
		//house
		// �ж� d �ǲ��� Horse������ͣ� instanceof
		if(d instanceof Dog ){
			System.out.println("d �� Dog�������");
		}		
	}
}
