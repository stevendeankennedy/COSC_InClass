package edu.frostburg.InClass.Feb23;

public class BinarySearch {
	
	public static void main(String... args) {
//		int[] list = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
		// make a huge list
		int[] list= new int[10000];
		for (int i=0; i<list.length; i++) {
			list[i] = i*2;
		}
		int target = 5063;
		
		BinarySearch algo = new BinarySearch();
		int index = algo.search(list, 0, list.length-1, target);
		
		if (index == -1) {
			System.err.println("Not found :(");
		} else {
			System.out.printf("Found %d at index %d%n", target, index);
		}
	}
	
	/**
	 * Perform a binary search, recursively, on list, looking for target.
	 * 
	 * @param list List to search
	 * @param l left border of list
	 * @param r right border of list
	 * @param target index of what we are finding, returns -1 if not found
	 */
	public int search(int[] list, int l, int r, int target) {
		// get middle
		int mid = (l + r) / 2; // we can't just get len/2 because we aren't going to split the list
		
		// "Don't cross the streams!" - Hilarious 80's movie character
		if (l > r || r < l) {
			return -1;
		}
		
		// compare target to middle
		if (list[mid] == target) {
			// if ==, done
			return mid;

		} else if(list[mid] > target) {
			//   if <, redefine list to be the left part
			return search(list, l, mid-1, target); // change the right-hand border

		} else if(list[mid] < target){ // has to be right or not found
			//   if >, redefine list to be the right part
			return search(list, mid+1, r, target);

		}
		//   search with new list	
		return -1;
	}
}
