package edu.frostburg.cosc241.Steve;

import edu.frostburg.cosc241.tester.L0000Test;

public class SKLab0000Driver {

	public static void main(String[] args) {
		SKL0000 lab = new SKL0000();
		L0000Test test = new L0000Test("Steve", "today", lab);
		test.run();
		
		runProgram();
	}
	
	public static void runReturnExample() {
		int x = getAnInt();
	}
	
	public static int getAnInt() {
		return 999;
	}
	
	public static void runProgram() {
		SKL0000 lab = new SKL0000();
		
		int num = 11;
		boolean isOdd = lab.isOdd(num);
		
		if (isOdd)
			System.out.println(num + " is odd");
		else
			System.out.println(num + " is even");
		
		long maybePrime = 5;
		boolean isPrime = lab.isPrime(maybePrime);
		if (isPrime)
			System.out.println(maybePrime + " is prime");
		else
			System.out.println(maybePrime + " is NOT prime");
	}

}
