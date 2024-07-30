package com.tutorial.learning.jdk17.sealed.jep397;

import com.tutorial.learning.jdk17.sealed.jep397.JungleAnimal.Land;

public class JungleAnimalMain {
	
	public static void main(String []args) {
		JungleAnimal deerAnimal = new Deer();
		deerAnimal.predict();
		
		// At anonymous classes
		/*
		 * JungleAnimal anonymousJungleAnimal = new JungleAnimal() {
		 * 
		 * public void predict() { } };
		 */
		
		
		Land land = new Lion();
		land.eat();
	}
}

sealed interface JungleAnimal permits Monkey, Snake {
	void predict();
	
	interface Land {
		void eat();
	}
	abstract class Water {
		abstract void eat();	
	}
	record Air() {
		void eat() {
			System.out.println("[Air] EAT");
		}
	}
}

//interface WaterAnimal extends JungleAnimal {}

record Monkey() implements JungleAnimal {

	@Override
	public void predict() {
		System.out.println("[predict] Monkey");
	}
}

/*
 * final class Monkey implements JungleAnimal {
 * 
 * @Override public void predict() { System.out.println("[predict] Monkey"); } }
 */

non-sealed class Snake implements JungleAnimal {

	@Override
	public void predict() {
		System.out.println("[predict] Snake");
	}
}

class Deer extends Snake {
	
	@Override
	public void predict() {
		System.out.println("[predict] Deer");
	}
}


class Lion implements Land {

	@Override
	public void eat() {
		System.out.println("[Lion] EAT");
	}
}