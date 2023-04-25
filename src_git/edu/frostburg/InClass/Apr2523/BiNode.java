package edu.frostburg.InClass.Apr2523;

public class BiNode {
	private char dat;
	BiNode left;
	BiNode right;
	
	public BiNode(char dat) {
		this(dat, null, null);
	}
	
	public BiNode(char dat, BiNode left, BiNode right) {
		this.dat = dat;
		this.left = left;
		this.right = right;
	}

	public char getDat() {
		return dat;
	}

	public void setDat(char dat) {
		this.dat = dat;
	}
}
