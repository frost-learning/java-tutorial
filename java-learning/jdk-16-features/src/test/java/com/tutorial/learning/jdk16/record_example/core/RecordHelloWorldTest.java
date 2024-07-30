package com.tutorial.learning.jdk16.record_example.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tutorial.learning.jdk16.record_example.nested.ClassWithNestedRecord;

public class RecordHelloWorldTest {
	
	@Test
	void test_RecordStaticComponents() {
		RecordHelloWorld recordHelloWorld = new RecordHelloWorld();
		assertEquals("Hello", RecordHelloWorld.HELLO);
		assertEquals("World", recordHelloWorld.WORLD);
	}
	
	@Test
	void test_ClassWithNestedRecord() {
		ClassWithNestedRecord.RecordHelloWorld recordHelloWorld = new ClassWithNestedRecord.RecordHelloWorld();
		assertEquals("Hello", RecordHelloWorld.HELLO);
		//assertEquals("World", recordHelloWorld.WORLD);
		// assertEquals("World", recordHelloWorld.CONSTANT_WORLD);
	}
}
