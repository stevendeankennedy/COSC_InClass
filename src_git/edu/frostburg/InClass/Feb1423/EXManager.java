package edu.frostburg.InClass.Feb1423;

public class EXManager /* not extending Employee even though this causes problems */ {
	protected String name;
	protected int id;
	protected long salary;
	
	public void work() {
		System.out.printf("%s woiks%n", name);
	}
}
