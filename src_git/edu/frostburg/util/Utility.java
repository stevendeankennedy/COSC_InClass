package edu.frostburg.util;

import java.util.Random;

public class Utility {
	public static final int INT_BOUND = 100;
	
	/**
	 * Make an array of random integers.
	 * @param size how many ints we want
	 * @return the array
	 */
	public static int[] getRandomInts(int size) {
		Random r = new Random();
		
		int[] arr = new int[size];
		for (int i=0; i < size; i++) {
			arr[i] = r.nextInt(INT_BOUND);
		}
		
		return arr;
	}
	
	// print array
	
	public static void print(int[] array ) {
		for(int n : array) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	public static void print(Object[] array ) {
		for(Object n : array) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	public static void swap(int[] array, int i, int j) {
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}
	
	public static void swap(Object[] array, int i, int j) {
		Object temp = array[j];
		array[j] = array[i];
		array[i] = temp;
	}
}
