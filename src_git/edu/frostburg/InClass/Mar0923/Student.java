package edu.frostburg.InClass.Mar0923;

/**
 * OOP <-- important for the exam!
 * @author sdkennedy
 *
 */
public class Student extends Person {

	public Student(String name) {
		super(name);
		System.out.println("more code");
	}

	public void randomStudentThing() {
		System.out.println("#");
	}
	
	public String toString() {
		return "STUDENT: " + name;
	}
	
	public int a() {
		return -1;
	}
}
