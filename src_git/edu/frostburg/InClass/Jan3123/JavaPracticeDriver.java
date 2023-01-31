package edu.frostburg.InClass.Jan3123;

public class JavaPracticeDriver {

	public static void main(String[] args) {
		runExample();
	}
	
	public static void runExample() {
		SKCalculator calc = new SKCalculator();
		
		calc.add(5.0);
		calc.add(5.0);
		calc.add(21.1);
		calc.printResult();
		
		calc.add(2.0, 3.5);
		calc.printResult();
		
		calc.subtract(20000.1111, 0.1111);
		calc.printResult();
	}

}
