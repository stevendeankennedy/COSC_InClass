package edu.frostburg.InClass.Feb2123;

/**
 * Recursive examples done in class for 2/21
 */

public class Example {

	public static void main(String[] args) {
		Example inClass = new Example();
		
//		System.out.println(inClass.pow(2,3));
		System.out.println(inClass.factIterative(20));
		System.out.println(inClass.fact(20));
		
		int[] nums = new int[] {5, 11, 10, 25, 3, 7, 8};
		System.out.println(inClass.smallest(nums));
	}
	
	/**
	 * Returns the smallest number in an array of numbers
	 * @param nums the array of nums
	 * @return the smallest
	 */
	public int smallest(int[] nums) {
		// we need a smallest number
		int small = Integer.MAX_VALUE;
		// we need to iterate through the array
		return smallest(nums, 0, small);  // pass nums, then we start at 0, with small
	}
	
	/**
	 * Helper method for finding the smallest recursively.
	 * @param nums
	 * @param i
	 * @return the smallest number recursively
	 */
	private int smallest(int[] nums, int i, int small) {
		if (i == nums.length - 1) {
			return small;
		}		
		int maybeSmallest = nums[i] < small ? nums[i] : small;
		return smallest(nums, ++i, maybeSmallest); // ++i means increment, then read i
	}
	
	public long pow(long base, long exp) {
		// base
		if (exp == 0)
			return 1;
//		System.out.print(base + " * ");
		// recursive
		return base * pow(base, exp - 1);
	}
	
	// factorial, recursively
	// e.g. 5! = 5 * 4 * 3 * 2 * 1
	public long fact(int n) {
		// base case
		if (n == 1) {
			return 1;
		} 
		// recursive
		return n * fact(n - 1);
	}
	
	/**
	 * Returns factorial(n), but done iteratively.
	 */
	public long factIterative(int n) {
		long result = 1; // init to 1, because we are doing multiplication
		for (int i = n; i > 0; i-=1) {
//			System.out.println(i); // i is always the right number
			result = result * i;
		}
		return result;
	}
}
