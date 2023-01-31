package edu.frostburg.cosc241.Steve;

import edu.frostburg.cosc241.lab.L0000.L0000Review;

public class SKL0000 implements L0000Review {

	@Override
	public String getFavoriteColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long[][] getMultiplicationTable(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] getOdds(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isOdd(int num) {
		if (num % 2 == 1)
			return true;
		return false;
	}

	@Override
	public boolean isPrime(long n) {
		// What do do?
		
		// store factors
		int factors = 0;
		
		// loop
		for(long i = n ; i >= 1; i-=1) {
			if ((n % i) == 0) {
				factors += 1;
			}
		}
		
		if (factors == 2)
			return true;
		return false;
	}

	@Override
	public void printGreeting() {
		System.out.println("Hello world");
	}

	@Override
	public String[] readLinesFromFile(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeVowels(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getAveragePowerFromFile(String arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
