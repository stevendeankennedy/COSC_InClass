package edu.frostburg.InClass.Mar0723;

import edu.frostburg.util.Utility;

public class QuickSort {
	public void sort(int[] list) {
		sort(list, 0, list.length-1); // helps kick off the sort
	}
	
	public void sort(int[] list, int l, int r) {
		if (l < r) {
			int partition = partition(list, l, r);
			
			// recursion
			sort(list, l, partition - 1); // qsort left-hand side
			sort(list, partition + 1, r);
		}		
	}
	
	private int partition(int[] list, int l, int r) {
		int pivot = list[l];
		int pivotIndex = r;
		for (int i=r; i>l; i--) {
			if (list[i] > pivot)
				Utility.swap(list, i, pivotIndex--);
		}
		Utility.swap(list, l, pivotIndex);
		
//		// is it working?
//		System.out.println("Pivot: " + pivot);
//		for (int i=l; i<r; i++) {
//			System.out.print(" " + list[i] + " ");
//		}
//		System.out.println();
		
		return l;
	}
}
