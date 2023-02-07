package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class InheritanceTest {

	public static void main(String[] args) {
//		Boy boy1 = new Boy();
//		boy1.read();
//		boy1.eats();
		// case1();
		// case2();
		// case3();
		case4();

	}

	private static void case4() {
		Object x;
		x = 100;
		System.out.println(x.getClass());

	}

	private static void case3() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());

	}

	private static void atThePark(Man man) {
		man.play();

	}

	private static void case2() {
		Man man = new Boy();
		man.eats();
		man.play();

	}

	private static void case1() {
		Boy boy = new Boy();
		boy.read();
		boy.eats();
		boy.play();

		Kid kid = new Kid();
		kid.eats();
		kid.play();
		System.out.println();

	}

}
