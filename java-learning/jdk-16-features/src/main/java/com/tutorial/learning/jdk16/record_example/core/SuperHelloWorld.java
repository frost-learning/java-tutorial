package com.tutorial.learning.jdk16.record_example.core;

public class SuperHelloWorld {
	static {
		System.out.println("Super Static Block 1");
	}
	
	{
		System.out.println("Super Default Block 1");
	}
	
	{
		System.out.println("Super Default Block 2");
	}
	
	static {
		System.out.println("Super Static Block 2");
	}
}
