package edu.frostburg.InClass.Apr1823;

public class EXBinTree {
	
	protected BiNode root;
	
	protected int count;
	
	public EXBinTree(BiNode root) {
		this.root = root;
	}
	
	public void printPreorder() {
		printPreorder(root);
		System.out.println("!  Yay!");
	}
	
	private void printPreorder(BiNode root) {
		if (root == null) {
//			System.out.println("null!");
			return;
		}
		// visit
		System.out.print(root.getData() + " ");
		// go left
		printPreorder(root.left);
		// go right
		printPreorder(root.right);
	}
}
