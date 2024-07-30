package com.tutorial.learning.jdk16.record_example.core;

public class HelloWorld extends SuperHelloWorld {
	
	private final String text;
	
	public HelloWorld() {
		//this("Hello World");
		this.text = "Assign Hello World";
		System.out.println("Default constructor");
	}
	
	public HelloWorld(String text) {
		System.out.println("Parameter constructor");
		this.text = text;
	}
	
	// Static initializer or Static Block
	static {
		System.out.println("Static Block 1");
	}
	
	{
		System.out.println("Default Block 1");
	}
	
	{
		System.out.println("Default Block 2");
	}

	// Static initializer or Static Block
	static {
		System.out.println("Static Block 2");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		HelloWorld helloWorld = new HelloWorld();
		System.out.println(helloWorld.text);
		//HelloWorld helloWorld2 = new HelloWorld("Verify Hello World");
		System.out.println("END");
		System.out.println();
	}

}
