package edu.frostburg.InClass.Mar3023;

import edu.frostburg.util.Utility;

public class InsertionSort {

	public static void main(String[] args) {
//		runInsertionExample();
//		runTest();
		runTest2();
	}
	
	public static void runTest2() {
		int[] list = Utility.getRandomInts(10);
		InsertionSort ins = new InsertionSort();
		Utility.print(list);
		list = ins.qsort(list);
		Utility.print(list);
	}
	
	public static void runTest() {
		EXQueue q = new EXQueue();
		for (int i=0; i<5; i++) {
			q.enq(i);
		}
		System.out.println("count" + q.count);

		for (int i=0; i<6; i++) {
			System.out.println("dequeue: " + q.deq());
		}
		System.out.println("count" + q.count);
	}
	
	public static void runInsertionExample() {
		int[] randInts = Utility.getRandomInts(10);
		System.out.print("Before:\t");
		Utility.print(randInts);
		InsertionSort ins = new InsertionSort();
		System.out.print("After:\t");
		ins.sort(randInts);
		Utility.print(randInts);
		
	}

	public int[] qsort(int[] list) {
		// get q (and a new list)
		EXQueue q = new EXQueue(list);
		int[] list2 = new int[list.length];
		// for whole q:
		int c = q.getCount();
		int list2count = 0;
		for (int i=0; i < c; i++) {
			//	x = deq
			int x = q.deq();
			//  insert(x)
			
			list2[list2count++] = x;
			for (int j=list2count-1; j>0; j--) { 
				if (list2[j-1] > list2[j]) {
					Utility.swap(list2, j-1, j);
				}
			}
		}
		return list2;
	}
	
	public void sort(int[] list) {
		// for each number (starting from right)
		for (int i=list.length-1; i>=0; i--) {
			// insert!
			for (int j=list.length-1; j>=0; j--) {
				if (list[i] > list[j]) {
					Utility.swap(list, i, j);
				}
			}
//			Utility.print(list);
			//	compare to item on left, through sorted portion
			//  mov everything compared to the right		
			}
		//  complete insert
	}
}
