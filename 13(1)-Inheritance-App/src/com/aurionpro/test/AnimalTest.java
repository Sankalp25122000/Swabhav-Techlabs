package com.aurionpro.test;

import com.aurionpro.model.Animal;
import com.aurionpro.model.Cow;
import com.aurionpro.model.Lion;

public class AnimalTest {

	public static void main(String[] args) {
		Animal anim = new Animal("Wild animal ", true);
		System.out.println(anim);
		anim.eat();
		
		Cow cow = new Cow("Domestic Animal ",false);
		System.out.println(cow);
		cow.eat();
		
		Lion lion = new Lion("Wild Animal",true);
		System.out.println(lion);
		lion.eat();

	}

}
