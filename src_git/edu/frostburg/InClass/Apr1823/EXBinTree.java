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
		
	/**
	 * Take the 1
	 * 	       2
	 *        3
	 * Shape and make it
	 *          2
	 *        3   1
	 */
	public void rotateRight() {
		BiNode tmp = root;
		root = root.left;
		tmp.left = root.right;
		root.right = tmp;
	}
		
	/**
	 * Take the 1
	 * 	          2
	 *           3
	 * Shape and make it
	 *          3
	 *        1   2
	 */
	public void rotateRL() {
		// the R	
		BiNode temp = root.right;  // 2
		root.right = temp.left;  // 3
		temp.left = root.right.right; // y
		root.right.right = temp; // 2
		
		// L
		rotateLeft();
	}
	
	public void rotateLeft() {	
		BiNode tmp = root; //1
		root = root.right; //3
		tmp.right = root.left; //x
		root.left = tmp; //1
	}
}
