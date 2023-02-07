package edu.frostburg.InClass.Feb0723;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RPG {

	public static void main(String[] args) {
		RPG rpg = new RPG();
		rpg.run();
	}

	String[] lines;
	
	public void run() {
		try {
			readFile();
			// turn lines into Actors
			int heroCount = 0;
			Actor[] heroes = new Actor[4];
			Actor[] monsters = new Actor[1];
			Combat combat;
			
			for (int i =0; i<lines.length; i+=1) {
				String[] data = lines[i].split(",");
				String name = data[0];
				int health = Integer.parseInt(data[1]);
				int power = Integer.parseInt(data[2]);
				int range = Integer.parseInt(data[3]);
				int melee = Integer.parseInt(data[4]);
				int dodge = Integer.parseInt(data[5]);
				int isMonster = Integer.parseInt(data[6]); // 1 if monster, 0 if hero
				Actor theActor = new Actor(health,power,range,melee,dodge,name);
				
				if (isMonster == 1) {
					monsters[0] = theActor;
				} else {
					heroes[heroCount++] = theActor;
				}
			}
			// put them into combat
			combat = new Combat(heroes, monsters);
			
			// start combat
			combat.run();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void readFile() throws FileNotFoundException {
		Scanner in = new Scanner(new File("rpg_characters.csv"));
		
		// TODO: make this part better
		lines = new String[5];
		
		int count = 0;
		while(in.hasNextLine()) {
			lines[count++] = in.nextLine();
		}
	}
}
