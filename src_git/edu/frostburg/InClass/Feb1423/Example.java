package edu.frostburg.InClass.Feb1423;

public class Example {

	public static void main(String[] args) {
		Example ex = new Example();
		ex.run();
		
		System.out.println();
		
		ex.runExample2();
	}
	
	public void runExample2() {
		EXCat cat = new EXCat();
		EXProgrammer pro = new EXProgrammer();
		
		EXAnimal animal = new EXCat();
		
		EXAnimal[] ans = new EXAnimal[3];
		ans[0] = cat;
		ans[1] = pro;
		ans[2] = animal;
		
		for (EXAnimal a : ans) {
			a.dance();
		}
		
	}
	
	public void run() {
		EXEmployee emp = new EXEmployee();
		EXIntern intern = new EXIntern();
		EXProgrammer prog = new EXProgrammer();
	
		EXEmployee someKindOfEmployee = new EXProgrammer();
		
		emp.work();
		intern.work();
		prog.work(); // polymorphism
		prog.playVideoGames();
		
		someKindOfEmployee.work(); // also polymorphism
//		someKindOfEmployee.playVideoGames();  // does not build
		EXProgrammer tempProgrammer = (EXProgrammer)someKindOfEmployee; 
		tempProgrammer.playVideoGames();
		
		
//		EXEmployee emp2 = new EXManager(); // sadface
		EXManager manager = new EXManager();
		
		EXEmployee[] employees = new EXEmployee[3];
		employees[0] = emp;
		employees[1] = intern;
//		employees[2] = manager; // sadface cryface frog
		employees[2] = prog;
		
		System.out.println("-------------------");
		
		for (EXEmployee e : employees) {
			e.work();
		}
	}

}
