package edu.frostburg.InClass.Apr1823;

/**
 * Node class for binary trees.
 * @author sdkennedy
 *
 */
public class BiNode {
	private int data;
	BiNode left;
	BiNode right;
	
	public BiNode(int data, BiNode left, BiNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int d) {
		data = d;
	}
}
