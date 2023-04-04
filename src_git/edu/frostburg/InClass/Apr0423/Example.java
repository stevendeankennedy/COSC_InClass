package edu.frostburg.InClass.Apr0423;

public class Example {

	public static void main(String[] args) {
		Example ex = new Example();
		ex.runFirstGenericExample(4);
	}

	private void runFirstGenericExample(int size) {
		InClassVector<Slime> vect = new InClassVector<>(size);
		
		Slime a = new Slime();
		Slime b = new Slime();
		Slime c = new Slime();
		
		vect.addLast(a);
		vect.addLast(b);
		vect.addLast(c);
		vect.addLast(new Slime());
//		vect.addLast(new String());
		
		Slime x = vect.getFirst();
		x.getSlimeWord();
	}

}
