package edu.frostburg.InClass.Apr1123;

/**
 * Linked List class example
 * @author sdkennedy et al
 *
 */
public class EXLinkedList {
	
	EXNode head; // always points to the first element in the list
	int count;
	
	static class EXNode {
		int data;
		EXNode next; // this is the arrow from our diagram
		
		EXNode(int data) {
			this.data = data;
		}
	}
	
	public EXLinkedList() {
		head = null;
		count = 0;
	}
	
	/**
	 * Appends element e (to the end of the list)
	 * @param e
	 */
	public void addLast(int e) {
		if (count == 0) { // there are various ways to see if the list is empty
			addFirst(e);
		} else {
			EXNode v = head;  // visitor is looking at the head of the list
			while(v.next != null) {
				v = v.next;
			} // at the end of this loop, v will be pointing at the last node
			EXNode nd = new EXNode(e);
			v.next = nd;
			count += 1;
		}
	}
	
	/**
	 * Adds an element to the front of the list
	 * @param e the element to add
	 */
	public void addFirst(int e) {
		if (head == null) {
			// make the node
			EXNode nd = new EXNode(e);
			head = nd;
		} else {
			// we have more elements, so need to update next, too
			EXNode nd = new EXNode(e);
//			nd.next = head.next; // oopsie!
			nd.next = head;
			head = nd;
		}
		count = count + 1;
	}
	
	
	// TODO: Adding at the front and at the back
	/**
	 * Adds an element to an arbitrary position in the list.
	 * @param e element to add
	 * @param i position for where to add
	 */
	public void add(int e, int newpos) {
		if (newpos >= count) {
			System.err.println("Cannot add " + e + " at out of bounds index.");
			return;
		} else { // we have a list, lets insert the element
			// make the node
			EXNode x = new EXNode(e);
			// find the position
			EXNode current = head;  // visitor
			int i = 0;
			while (i < newpos-1) {
				current = current.next;
				i += 1;
			} // he is pointing at i-1, aka right in front of the position
			// update (make sure these references are updated in the right order)
			x.next = current.next;
			current.next = x;
			count += 1;
		}
	}
}
