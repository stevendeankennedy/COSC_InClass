package edu.frostburg.InClass.Mar0723;

import edu.frostburg.util.Utility;

public class Example {

	public static void main(String[] args) {
		Example ex = new Example();
		ex.go();
	}
	
	public void go() {
		InsertionSort sort = new InsertionSort();
		QuickSort qsort = new QuickSort();
		
		int[] dat = Utility.getRandomInts(10000);
		int[] dat2 = dat.clone(); // SHALLOW copy of dat

		// insertion sort
//		Utility.print(dat);
		long timeBeforeIn = System.nanoTime();
		sort.run(dat);
		long timeAfterIn = System.nanoTime();
		System.out.printf("Insertion took %dns%n", timeAfterIn-timeBeforeIn);
//		Utility.print(dat);
		
		// quick sort
//		Utility.print(dat2);
		long timeBeforeQs = System.nanoTime();
		qsort.sort(dat2);
		long timeAfterQs = System.nanoTime();
		System.out.printf("Quicksort took %dns%n", timeAfterQs-timeBeforeQs);
//		Utility.print(dat2);

	}
	
	public void go2() {
		InsertionSort sort = new InsertionSort();

		String[] strdat = new String[] {"Disala", "Noah", "Abbey", "Alex", "Jeremy",
				"Austin", "Jonathan", "Bryce", "Jack", "Aley", "Stephen"};
			
			Utility.print(strdat);
			sort.run(strdat);		
			Utility.print(strdat);
	}

}
