package edu.frostburg.InClass.Feb1423;

public class EXProgrammer extends EXEmployee {

	@Override
	public void work() {
		System.out.printf("%s programs!%n", name);
	}
	
	public void playVideoGames() {
		System.out.printf("%s plays a game%n", name);
	}
}
