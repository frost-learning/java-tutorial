package com.tutorial.learning.jdk17.sealed.jep397;

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
	}
}

sealed interface JungleAnimal permits Monkey, Snake {
	void predict();
}

final class Monkey implements JungleAnimal {

	@Override
	public void predict() {
		System.out.println("[predict] Monkey");
	}
}

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
