package edu.frostburg.InClass.Feb1623;

public class Person {
	public static final String DEFAULT_NAME = "No name";
	public static int numberOfPeople = 0;
	
	protected String name;
	
	public Person() {
//		name = DEFAULT_NAME;
//		numberOfPeople += 1;
		this(DEFAULT_NAME);
	}
	
	public Person(String name) {
		this.name = name;
		numberOfPeople += 1;
	}
	
	// getters and setters aka accessors and mutators
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
