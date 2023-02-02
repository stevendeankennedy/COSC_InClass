package edu.frostburg.InClass.Feb0223;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaReview {

	public static void main(String[] args) {
//		runLoopExample(10);
		
//		runArrayExample(10);
		
//		runScannerExample1();
		runScannerExample2();
	}
	
	public static void runScannerExample2() {
		try {
			Scanner in = new Scanner(new File("L0000zzz.in"));
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.err.println("error");
		}
	}
	
	public static void runScannerExample1() {
		Scanner in = new Scanner(System.in);
		
		
		while (in.hasNext()) {
//			System.out.print("You typed: " + in.next());
			String inString = in.next();
		}
	}
	
	public static void runArrayExample(int size) {
		int[] cheapVersion = {9,8,7,6,5,4};
		printArray(cheapVersion);
		
		// "int array realVersion GETS new int of size size"
		int[] realVersion = new int[size]; // = is ASSIGNMENT
		printArray(realVersion);
		
		int x = 9;
	}
	
	public static void printArray(int[] theArray) {
		for (int i = 0; i < theArray.length; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	
	}
	
	/**
	 * Loop something n times
	 * @param n
	 */
	public static void runLoopExample(int n) {
		System.out.println("for loop");
		for (int i=0; i<n; i+=1) {
			System.out.println(i);
		}
		

		
		System.out.println("While loop");
		int count = n;
//		for (/* nothing */; count > 0; /* nothing */) {
//			
//		}
		while (count > 0) {
			System.out.println(count);
			count = count - 1;
		}
		
		count = n;
		do {
			System.out.println(count);
			count -= 1;
		} while (count > 0);
	}

}
