package edu.frostburg.InClass.Feb1623;

public class StudentEmployee extends Student implements Employee {

//	protected String name; // shadowing
	
	public StudentEmployee(String name) {
		super(name);
		super.name = name;
	}

	@Override
	public void getPaid(int dollars) {
		System.out.printf("%s gets paid $%d dollars!", name, dollars);
	}

}
