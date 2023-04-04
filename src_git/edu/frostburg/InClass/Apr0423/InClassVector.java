package edu.frostburg.InClass.Apr0423;

public class InClassVector<T> {
	protected T[] dat;
	private int count;
	
	@SuppressWarnings("unchecked")
	public InClassVector(int size) {
		dat = (T[])new Object[size];
		count = 0;
	}
	
	public void addLast(T element) {
		if (count == dat.length) {
			resize();
		}
		dat[count++] = element;
	}
	
	public T remove(int index) {
		T element = dat[index];
		
		for (int i=index+1; i<dat.length; i++) {
			dat[i-1] = dat[i];
		}
		count = count - 1;
		
		return element;
	}
	
	public T getFirst() {
		return dat[0];
	}
	
	public InClassVector getCopy() {
		InClassVector v2 = new InClassVector(4);
		for (int i=0; i<count; i++) {
			v2.addLast(dat[i]);   // this doesn't quite work, but I'm not coding it for you!
		}
		
		return this;
	}
	
	@SuppressWarnings("unchecked")
	private void resize() {
		T[] dat2 = (T[])new Object[dat.length * 2];
		for (int i=0; i<count; i++) {
			dat2[i] = dat[i];
		}
		dat = dat2;
	}
}
