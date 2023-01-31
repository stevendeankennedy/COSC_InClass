package edu.frostburg.InClass.Jan3123;
/**
 * ABC - Always Be Commenting, please.
 * @author sdkennedy
 *
 */
public class SKCalculator {
	// Your name goes here
	private String myName; // like this
	
	// results go here
	private double accumulator;
	
	/* Calculator stuff here --------------- */
	
	/**
	 * Adds a to the accumulated amount
	 * @param a a double to add
	 */
	public void add(double a) {
		accumulator += a;
	}
	
	/**
	 * Adds two values and stores them
	 * @param a first double
	 * @param b second double
	 */
	public void add(double a, double b) {
		accumulator = a + b;
	}
	
	public void subtract(double a, double b) {
		accumulator = a - b;
	}
	
	public void printResult() {
		System.out.println(accumulator);
	}
	
	/* 
	 * Access fields below ----------
	 * 
	 * */
	
	public double getAccumulator() {
		return accumulator;
	}

	public void setAccumulator(double accumulator) {
		this.accumulator = accumulator;
	}

	public String getMyName() {
		return myName;
	}
	
	public void setMyName(String name) {
		myName = name;
	}
}
