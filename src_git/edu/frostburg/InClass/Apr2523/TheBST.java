package edu.frostburg.InClass.Apr2523;

/**
 * In class implementation example of a Binary Search Tree.
 * 
 * @author sdkennedy + friends
 *
 */
public class TheBST {
	private int count;
	private BiNode root;
	
	public TheBST() {
		root = null;
		count = 0;
	}
	
	/**
	 * Adds an element to the tree.
	 * @param element
	 */
	public void add(char element) {
		if (count == 0) { // empty tree
			// when empty, just make a new root
			root = makeNode(element);
		} else {
			add(root, element);
		}
	}
	
	/**
	 * Helper method for adding.
	 * @param root
	 * @param element
	 */
	private void add(BiNode root, char element) {
		// compare root value to element, then recursively add
		if (element <= root.getDat()) {
			if (root.left == null) {
				root.left = makeNode(element);
			} else {
				add(root.left, element);
			}
		} else { // greater than
			if (root.right == null) {
				root.right = makeNode(element);
			} else {
				add(root.right, element);
			}
		}
	}
	
	/**
	 * Helper method for making nodes.  Will also increment count.
	 * @param element
	 * @return
	 */
	private BiNode makeNode(char element) {
		count = count + 1;
		return new BiNode(element);
	}
	
	public void printTree() {
		printTree(root, "");
	}
	
	private void printTree(BiNode root, String tab) {
		if (root == null) {
			System.out.println(tab + "-");
			return;
		}
		// visit
		System.out.println(tab + root.getDat());
		printTree(root.left, tab + " ");
		printTree(root.right, tab + " ");
	}
}
