package com.tutorial.learning.jdk16.record_example.nested;

public class ClassWithNestedRecord {
	
	static class NonPublicStaticClass {}
	
	public static class PublicStaticClass {}
	
	class NonPublicClass {}
	
	public class PublicClass {}
	
	// The Canonical Constructor of a Record Class
	public record RecordHelloWorld(String text) {
		
		public static final String HELLO = "Hello";
		
		// static final String HELLO = "Hello";
		
		static String WORLD = "World";
		
		static final String CONSTANT_WORLD = "World";
		
		// Static initializer or Static Block
		static {
			System.out.println("[nested-record] Static Block 1");
		}
		
		// Static initializer or Static Block
		static {
			System.out.println("[nested-record] Static Block 2");
		}
		
		// Compact Constructors
		public RecordHelloWorld() {
			this("[nested-record] Default Hello World");
			System.out.println("[nested-record] Default constructor");
		}

		// Compact Constructors
		public RecordHelloWorld(String text) {
			this.text = text;
			System.out.println("[nested-record] Parameter constructor");
		}
		
	}
	
	public static void main(String []args) {
		System.out.println("[nested-record] main method");
		RecordHelloWorld recordHelloWorld = new RecordHelloWorld();
		//RecordHelloWorld recordHelloWorld = new RecordHelloWorld("Parameter Hello World");
		System.out.println(recordHelloWorld.text);
		
		System.out.println("END");
	}
}
