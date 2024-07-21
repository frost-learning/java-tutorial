package com.tutorial.learning.jdk16.record.jep395;

public class TStudent {

	private final Integer rollNo;

	private final String name;

	private final String className;

	public TStudent(Integer rollNo, String name, String className) {
		this.rollNo = rollNo;
		this.name = name;
		this.className = className;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public String getClassName() {
		return className;
	}
}
