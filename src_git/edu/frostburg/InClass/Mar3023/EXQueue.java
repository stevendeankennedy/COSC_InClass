package edu.frostburg.InClass.Mar3023;

public class EXQueue {
	public static final int DEFAULT_SIZE = 25;
	
	protected int[] data;
	protected int count;
	
	public EXQueue(int[] other) {
		data = new int[other.length];
		
		// make copy of the array (we can't use the original here)
		for (int i=0; i<other.length; i++) {
			data[i] = other[i];
		}
		count = other.length;
	}
	
	public EXQueue(int size) {
		data = new int[size];
	}
	
	public EXQueue() {
		this(DEFAULT_SIZE);
	}
	
	public boolean enq(int e) {
		if (count == data.length)
			return false;
		
		data[count++] = e;
		return true;
	}
	
	public int deq() {
		if (count == 0)
			return -1;
		int element = data[0];
		// every day I'm shufflin'
		for (int i = 1; i < count; i++) {
			data[i-1] = data[i];  // "Left of the thing is gonna get the thing where we're at" - Jonathan 3/30/23
		}
		count = count - 1;
		return element;
	}

	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
