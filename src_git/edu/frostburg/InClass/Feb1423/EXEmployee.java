package edu.frostburg.InClass.Feb1423;

public class EXEmployee implements EXPerson, EXAnimal{
	protected String name;
	protected int id;
	protected long salary;
	
	private int someRandomNumberOnlyEmployeeSees;

	// Austin, these were just things we talked about.  Ask Jonathan.
//	public int examplePub;
//	private int example;
//	/* package private */ int otherExample;
	
	
	public void work() {
		System.out.printf("%s works%n", name);
	}

	@Override
	public void dance() {
		System.out.printf("%s dances%n", name);
	}

	@Override
	public void eat() {
		System.out.printf("%s eats%n", name);
	}
}
