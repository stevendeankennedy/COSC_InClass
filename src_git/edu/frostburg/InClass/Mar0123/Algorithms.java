package edu.frostburg.InClass.Mar0123;

public class Algorithms {

	public static void main(String[] args) {
		Algorithms example = new Algorithms();
//		example.runLinear(9000);
//		example.runQuadratic(100);
//		example.runConstant(999999);
//		example.otherConstant(999);
		example.runPolynomial(10);
		
	}
	

	// O(1)
	public void otherConstant(int n) {
		int count = 0; //1
		
		count = count + 1; //1
		count = count + 1; //1
		count = count + 1; //1
		
		System.out.print("Constant:" + count);
	}
	
	// O(1)
	public void runConstant(int n) {
		int count = 1;
		System.out.println("Constant:" + count);
	}
	
	public void runLinear(int n) {
		int count = 0;  // 1 work unit
		
		for (int i=0; i<n;i++) {  // n work units
			count += 1; // 1 work unit  <- secretly 1 * n
		}
		
		System.out.println("Linear" + count);
	}
	
	public void runQuadratic(int n) {
		int count = 0;  // 1 work
		
		for (int i=0; i<n; i++) { // n
			for (int j=0; j<n; j++) { // n
				count += 1; // 1 <=== 1 * n * n work
			}
		}
		
		System.out.println("Quadratic:" + count);
	}
	
	// 2n^3 + 3n + 3
	public void runPolynomial(int n) {
		int count = 0;
		
		// triple nested loop
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				for (int k=0; k<n;k++) {
//					count++;
//					count++;
					count += 2;
				}
			}
		}
		
		for (int i=0; i<n;i++) {
			count+=3;
		}
		
		count += 3;
		
		
		System.out.println("2n^3 + 3n + 3: " + count);
	}

}
