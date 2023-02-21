package edu.frostburg.InClass.Feb1623.part2;

public class Song {
	protected String title;
	protected String artist;
	protected String genre;
	protected String year;
	
	public Song(String title, String artist, String genre, String year) {
		super();
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.year = year;
	}

	public void play() {
		System.out.println("la la la! " + title);
	}
	
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", genre=" + genre + ", year=" + year + "]";
	}
	
	
}
