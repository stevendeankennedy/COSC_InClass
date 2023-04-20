package edu.frostburg.InClass.Apr1823;

public class BinTreeExample {

	public static void main(String[] args) {
		BinTreeExample ex = new BinTreeExample();
		EXBinTree tree = ex.makeTree1();
		
		ex.runExample1(tree);
	}
	
	private void runExample1(EXBinTree tree) {
		tree.printPreorder();
	}
	
	// tree from behind steven
	private EXBinTree makeTree2() {
		BiNode n1 = new BiNode(1, null, null);
		n1.left = new BiNode(2, null, null);
		BiNode n3 = new BiNode(3, null, null);
		n1.right = n3;
		
		BiNode n4 = new BiNode(4, null, null);
		BiNode n5 = new BiNode(5, null, null);
		BiNode n6 = new BiNode(6, null, null);
		BiNode n7 = new BiNode(7, null, null);
		
		n3.left = n4;
		n3.right = n7;
		n4.left = n5;
		n4.right = n6;
		
		return new EXBinTree(n1);  // returns the tree we just built
	}
	
	// tree from behind Stephen and Aley
	private EXBinTree makeTree1() {
		BiNode n1 = new BiNode(1, null, null); // A
		BiNode n2 = new BiNode(2, null, null); // B
		BiNode n3 = new BiNode(3, null, null); // C
		BiNode n4 = new BiNode(4, null, null); // D
		BiNode n5 = new BiNode(5, null, null); // E
		BiNode n6 = new BiNode(6, null, null); // F
		BiNode n7 = new BiNode(7, null, null); // G
		BiNode n8 = new BiNode(8, null, null); // H
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		n4.left = n8;
		
		return new EXBinTree(n1);
	}
	
	public EXBinTree makeImbalancedTree1() {
		BiNode n1 = new BiNode(1, null, null); // A
		BiNode n2 = new BiNode(2, null, null); // B
		BiNode n3 = new BiNode(3, null, null); // C
		BiNode nx = new BiNode(-1, null, null); // x
		BiNode ny = new BiNode(-2, null, null); // y
		BiNode nz = new BiNode(-3, null, null); // z

		n3.left = nx;
		n3.right = ny;
		n2.right = nz;
		n1.left = n2;
		n2.left = n3;
		
		return new EXBinTree(n1);
	}
	
	public EXBinTree makeImbalancedTree2() {
		BiNode n1 = new BiNode(1, null, null); // A
		BiNode n2 = new BiNode(2, null, null); // B
		BiNode n3 = new BiNode(3, null, null); // C
		BiNode nx = new BiNode(-1, null, null); // x
		BiNode ny = new BiNode(-2, null, null); // y
		BiNode nz = new BiNode(-3, null, null); // z
		
		n1.right = n2;
		n2.left = n3;
		n3.left = nx;
		n3.right = ny;
		n2.right = nz;
		
		return new EXBinTree(n1);
	}

}
