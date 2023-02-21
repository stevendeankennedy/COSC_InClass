package edu.frostburg.InClass.Feb1623;

public class Example {

	public static void main(String[] args) {
		Example ex = new Example();
		
		ex.runFirst();
	}
	
	public void runFirst() {
		Employee p = new StudentEmployee("Aley");
		
		System.out.println(p);
		
		p.getPaid(1000);
	}

}
