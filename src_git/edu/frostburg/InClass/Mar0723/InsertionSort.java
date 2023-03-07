package edu.frostburg.InClass.Mar0723;

import edu.frostburg.util.Utility;

public class InsertionSort {
	
	public void run(String[] dat) {
		
		for (int i=0; i<dat.length; i++) {
			for (int j=i; j>0; j--) {
				if(dat[j].compareTo(dat[j-1]) < 0) {
					Utility.swap(dat, j, j-1);
				}
			}
		}
	}
	
	public void run(int[] dat) {
//		System.out.println("Insertion sort go!");
		// check each element left to right ->
		for (int i=0; i<dat.length; i++) {
			//	insert that element
			for (int j=i; j>0; j--) {
				//	while moving left <- :
				// 	compare two parts of data
				//	if out of order, swap those two data
				if(dat[j] < dat[j-1]) {
					Utility.swap(dat, j, j-1);
				}
			}

		}
	}
}
