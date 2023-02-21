package edu.frostburg.InClass.Feb1623.part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example {
	public static void main(String... args) {
		Example ex = new Example();
//		ex.run();
		
		ex.run2();
	}
	
	public void run2() {
		RockSong s = new RockSong("hello");
		
		System.out.println(s);
	}
	
	public void run() {
		Song[] songs = new Song[1994];
		
		try {
			Scanner in = new Scanner(new File("Spotify-2000.csv"));
			int i = 0;
			in.nextLine();  // skip header in csv
			while (in.hasNextLine()) {
				String[] stuff = in.nextLine().split(",");
				Song aSong;
				if (stuff[3].contains("rock")) {
					aSong = new RockSong(stuff[1],stuff[2],stuff[3], stuff[4]);
				} else {
					aSong = new Song(stuff[1], stuff[2], stuff[3], stuff[4]);
				}
				songs[i++] = aSong; // i++ reads i and then increments it
				
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		for (Song s : songs) {
			System.out.println(s);
			if (s instanceof RockSong) {
				System.out.println("LET'S ROCK AND ROLLLLLLL!!!!");
			}
			s.play(); // polymorphism... (basically why instanceof is not common)
		}
	}
	
//	private void extraBonusExampleForTip() {
//		String[] s = new String[1000];
//		main("a", "b", "c");
//	}
}
