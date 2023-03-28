package edu.frostburg.InClass.Mar2823;

public class Stack {
	public static final int DEFAULT_SIZE = 25;
	
	private int[] data; // our stack goes here
	private int count;
	
	// --------------------------------------
	
	public Stack(int size) {
		this.data = new int[size];
		count = 0;
	}
	
	public Stack() {
		this(DEFAULT_SIZE);
	}
	
	// -------------------------------------------------
	
	public boolean push(int element) {
		// defense
		if (count >= data.length) {  // preventing out of bounds exception
			return false;
		}
		
		data[count++] = element;
		return true;
	}
	
	public int pop() {
		// defense
		if (count == 0)
			return -1;
		
		return data[--count];
	}
}
