package edu.frostburg.InClass.Mar0923;

public class Person implements ExampleInterface, ExampleInterface2 {
	/* Fields! */
	protected String name;
	
	
	/* -- no more Fields */
	public Person(String name) {
		this.name = name;
	}

	public String toString() {
		return "This is a PERSON: " + name;
	}
	@Override
	public int a() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void c() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void x() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void y() {
		// TODO Auto-generated method stub
		
	}
}
