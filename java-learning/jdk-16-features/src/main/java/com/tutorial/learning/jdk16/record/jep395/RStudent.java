package com.tutorial.learning.jdk16.record.jep395;

public record RStudent(Integer rollNo, String name, String className) {

	public RStudent withClassName(String className) {
		return new RStudent(rollNo, name, className);
	}
}
