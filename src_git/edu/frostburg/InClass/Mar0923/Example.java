package edu.frostburg.InClass.Mar0923;

public class Example {

	public static void main(String[] args) {
		Example ex = new Example();
		ex.run();
		ex.printLetters(10, 'A');
		ex.printLettersR(10);
		
		ex.printLettersR2(10);
		
		ex.run2();
	}
	
	public void run2() {
		Student s = new Student("1");
		Person p = new Student("2");
		ExampleInterface i = new Student("3");
		
		s.randomStudentThing();
//		p.randomStudentThing();
		System.out.println(s);
		System.out.println(p);
		System.out.println(i);
	}
	
	public void run() {
		Student s = new Student("Example Student"); // <- instantiates object
		
		ExampleInterface exI = new Student("2");
		ExampleInterface ex2 = new Employee("example");
		
		System.out.println(s);
		
		System.out.println(exI.a());
		System.out.println(ex2.a());
	}
	
	public void printLettersR(int n) {
		printLettersR(n,'A');
		System.out.println();
	}
	
	public void printLettersR(int n, char ch) {
		// base
		if (n == 0) {
			return;
		}
		
		System.out.print(ch + " ");
		printLettersR(n-1, (char)(ch + 1));
	}
	
	public void printLettersR2(int n) {
		printLettersR2(n,'A');
		System.out.println();
	}
	
	private void printLettersR2(int n, char ch) {
		// base
		if (n == 0) {
			return;
		}
		
		printLettersR2(n-1, (char)(ch + 1));
		System.out.print(ch + " ");

	}
	
	// iterative version
	public void printLetters(int n, char ch) {
		for (int i=0; i<n; i++) {
			System.out.print((char)(ch+i) + " ");
		}
		System.out.println();
	}

}
