package edu.frostburg.InClass.Apr0623;

import edu.frostburg.util.Utility;

public class SortedVector {

	private static final int DEFAULT_SIZE = 10;
	
	private int[] data;
	private int count;
	
	public SortedVector(int size) {
		data = new int[size];
		count = 0;
	}
	
	public SortedVector() {
		this(DEFAULT_SIZE);
	}

	public static void main(String[] args) {
		runTest();
	}

	private static void runTest() {
		SortedVector v = new SortedVector(4);
		v.add(30);
		v.add(20);
		v.add(10);
		v.add(15);
		
		System.out.println(v);
		v.remove(1);
		System.out.println(v);
		v.remove(2);
		System.out.println(v);
		v.remove(0);
		v.remove(0);
		v.remove(0);
		System.out.println(v);
		
		System.out.println("Test end");
	}

	public void add(int element) {
		// 1-find where it should go
		int pos = findPosition(element);
		// 2-move everything else down
		shift(pos);
		// 3-insert
		data[pos] = element;
		count = count + 1;
	}
	
	private void shift(int left) {
		if (count < 1) {
			return;
		}
		for (int i=count; i>left; i--) {
			data[i] = data[i-1];
		}
	}
	
	private int findPosition(int element) {
		int loc = 0;
		for (int i=0; i<count; i++) {
			if (element > data[i]) {
				loc = loc + 1;
			}
		}
		return loc;
	}
	
	/**
	 * Removes a particular element and returns it.
	 * @param index
	 * @return returns the element or -1 if the vector is empty
	 */
	private int remove(int index) {
		if (count == 0)
			return -1;
		// get element
		int element = data[index];
		// starting from that element's pos, move everything else left <--
		for (int i=index+1; i<count; i++) {
			data[i-1] = data[i];
		}
		// decrement count
		count -= 1;
		return element;
	}
	
	@Override
	public String toString() {
		String something = new String();
		
		for (int i=0; i<count; i++) {
			something = something + data[i] + " ";
		}
		
		return something;
	}
}
