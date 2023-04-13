package edu.frostburg.InClass.Apr1123;

public class Example {

	public static void main(String[] args) {
		EXLinkedList list = new EXLinkedList();
		Example test = new Example();
//		test.runTest1(list);
//		test.runTest2(new EXLinkedList());
		test.runTest3(new EXLinkedList());
	}
	
	public void runTest1(EXLinkedList example) {
		example.addFirst(5);
		example.addFirst(4);
		example.addFirst(3);
		
		example.addLast(96);
		example.addLast(97);
	}
	
	public void runTest2(EXLinkedList example) {
		example.addLast(5);
		example.addLast(4);
		example.addLast(3);
	}
	
	public void runTest3(EXLinkedList example) {
		for (int i=1; i<=6; i++) {
			example.addLast(i);
		}
		
		// insert in the middle
		example.add(99, 3);
		example.add(999, 7);
	}

}
