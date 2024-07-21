package com.tutorial.learning.jdk16.record.jep395;

public class StudentMain {

	public static void main(String[] args) {
		TStudent tStudent = new TStudent(1, "ABC", "Nursery");
		System.out.println(tStudent);
		
		RStudent rStudent = new RStudent(1, "ABC", "Nursery");
		System.out.println(rStudent);
		
		RStudent fStudent = rStudent.withClassName("First");
		System.out.println(fStudent);
	}
}
