package edu.frostburg.InClass.Apr2523;

public class Example {

	public static void main(String[] args) {
		Example ex = new Example();
//		ex.runTest1();
		ex.runBoardTest();
	}
	
	/**
	 * Board example.
	 */
	private void runBoardTest() {
		char[] list = new char[] {'G', 'A', 'X', 'C', 'F', 'B', 'Q', 'E'};
		TheBST bst = new TheBST();
		for (int i=0; i<list.length; i++) {
			bst.add(list[i]);
		}
		
		bst.printTree();
	}
	
	private void runTest1() {
		TheBST bst = new TheBST();
		bst.add('X');
		bst.add('N');
		bst.add('C');
		bst.add('C');
		bst.add('Z');
		bst.add('Y');
	}

}
