package edu.frostburg.InClass.Apr1123;

/**
 * Linked Queue class example.
 * 
 * 	* One problem for the future: In this Queue, clients can access LL methods directly,
 * 		breaking the Queue entirely.
 * 
 * @author sdkennedy and friends
 */
public class EXQueue extends EXLinkedList {
	// TODO: We need to add tail updates to methods
	EXNode tail;  // always points to the last element
	
	// TODO: override addLast to be more efficient (since we have a tail reference)
	@Override
	public void addLast(int e) {
		if (count == 0) {
			EXNode nd = new EXNode(e);
			head = nd;
			tail = nd;
			count = 1;
		} else {
			// make new node
			EXNode nd = new EXNode(e);
			// we will use the tail reference, and add it there
			// add it
			tail.next = nd;
			tail = nd;
			count += 1;
		}
	}
	
	public void enq(int e) {
		addLast(e);
	}
	
	public int deq() {
		return remFirst();
	}
}
