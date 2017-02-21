package com.oaec.test;

import com.oaec.domain.A;
import com.oaec.domain.IAbility;
import com.oaec.domain.IAble;

public class Test1 {
	public static void main(String[] args) {
		IAble a = new A();
		IAbility ab = (IAbility)a;
	}
}
