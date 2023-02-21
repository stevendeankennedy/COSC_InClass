package edu.frostburg.InClass.Feb1623.part2;

public class RockSong extends Song {

	public RockSong(String title, String artist, String genre, String year) {
		super(title, artist, genre, year);
	}
	
	public RockSong(String... strings) {
		super(strings[0], strings[1], strings[2], strings[3]);
	}

	@Override
	public void play() {
		System.out.println("LALALALA!!!!!! " + title);
	}
	
}
