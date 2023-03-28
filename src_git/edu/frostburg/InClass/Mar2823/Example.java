package edu.frostburg.InClass.Mar2823;

public class Example {

	public static void main(String[] args) {
		Example ex = new Example();
//		ex.runStackTest();
		String exp = "95-22+-";
		int result = ex.evaluate(exp);
		System.out.printf("%s = %d%n", exp, result, args);
	}
	
	/**
	 * Evaluates an expression that is in postfix notation.
	 * @param expression a postfix string (aka "57*2+")
	 * @return result of expression
	 */
	public int evaluate(String expression) {
		// How to do this?
		// Get a stack
		Stack stack = new Stack(7);
		// Read the expression string, char by char
		for (int i=0; i<expression.length(); i++) {			
			//		if it is a number
			//			push it
			char ch = expression.charAt(i);
			if (Character.isDigit(ch)) {
				int d = Character.digit(ch, 10); // <- the 10 is the base (i.e. decimal)			
				stack.push(d);
			//		if it is an operator
			//			pop second
			//			pop first
			//			perform that operation on first and second
			//			push the result
			} else if (ch == '+'){
				int second = stack.pop();
				int first = stack.pop();
				int result = first + second;
				stack.push(result);
			} else if (ch == '-') {
				int second = stack.pop();
				int first = stack.pop();
				int result = first - second;
				stack.push(result);
			}
		}

		return stack.pop();
	}
	
	public void runStackTest() {
		Stack s = new Stack(4);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		for (int i=0; i<5; i++) {
			System.out.println(s.pop());
		}
	}

}
