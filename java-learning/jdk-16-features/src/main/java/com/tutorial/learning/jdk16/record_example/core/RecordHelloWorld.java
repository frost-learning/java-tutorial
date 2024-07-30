package com.tutorial.learning.jdk16.record_example.core;

// The Canonical Constructor of a Record Class
public record RecordHelloWorld(String text) {
	
	static final String HELLO = "Hello";
	
	static String WORLD = "World";
	
	// Static initializer or Static Block
	static {
		System.out.println("[record] Static Block 1");
	}
	
	// Static initializer or Static Block
	static {
		System.out.println("[record] Static Block 2");
	}
	
	// Compact Constructors
	public RecordHelloWorld() {
		this("[record] Default Hello World");
		System.out.println("[record] Default constructor");
	}

	// Compact Constructors
	public RecordHelloWorld(String text) {
		this.text = text;
		System.out.println("[record] Parameter constructor");
	}
	
	public static void main(String []args) {
		System.out.println("[record] main method");
		RecordHelloWorld recordHelloWorld = new RecordHelloWorld();
		//RecordHelloWorld recordHelloWorld = new RecordHelloWorld("Parameter Hello World");
		System.out.println(recordHelloWorld.text);
		
		System.out.println("END");
	}
}
