package edu.frostburg.InClass.Feb0723;

/**
 * Combat class for COSC 241 RPG.
 * 
 * A bunch of heroes gather to fight some monsters.
 * 
 * Runs combat automatically.
 * 
 * @author sdkennedy
 *
 */
public class Combat {
	Actor[] heroes;
	Actor[] monsters;
	
	public Combat(Actor[] heroes, Actor[] monsters) {
		super();
		this.heroes = heroes;
		this.monsters = monsters;
	}
	
	/**
	 * Automatically fight.
	 */
	public void run() {
		for (int i=0; i<heroes.length; i+=1) {
			System.out.println(heroes[i].getName());
		}
		
		for (int i=0; i<monsters.length; i+=1) {
			System.out.println(monsters[i].getName());
		}
	}
}
