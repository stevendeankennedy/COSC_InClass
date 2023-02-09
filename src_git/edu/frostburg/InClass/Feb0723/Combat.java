package edu.frostburg.InClass.Feb0723;

import java.util.Random;
import java.util.Scanner;

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
	Scanner kbd; // TBH, this is probably not the best place for the scanner
	Random dice;

	boolean isRunning;
	String result;
	
	public Combat(Actor[] heroes, Actor[] monsters) {
		super();
		this.heroes = heroes;
		this.monsters = monsters;
		
		kbd = new Scanner(System.in);
		dice = new Random();
		isRunning = true;
		result = "nothing";
	}
	
	/**
	 * Automatically fight.
	 */
	public void run() {
		
		String cmd = "";
		int turn = 0; // currently it is actor 0's turn
//		boolean isHero = false;
		
		// print what's going on on in the game simulation
		
		while (isRunning) {
			// if hero, get input
			if (turn < heroes.length) { // heroes are going
				cmd = getCommand();
				runCommand(cmd, heroes[turn]);
				turn += 1;
			} else { // monster turn
				int target = dice.nextInt(heroes.length);
				int monsCmd = dice.nextInt(2) + 1;
				runCommand(Integer.toString(monsCmd), monsters[0], heroes[target]);
				turn = 0;
			}
			checkGameState();
		}
		

		System.out.println("Game over! You " + result + "!");
//		for (int i=0; i<heroes.length; i+=1) {
//			System.out.println(heroes[i].getName() + "'s turn");
//			
//		}
//		
//		for (int i=0; i<monsters.length; i+=1) {
//			System.out.println(monsters[i].getName());
//		}
	}
	
	private String getCommand() {
		printMenu();
		System.out.print("command? >");
		return kbd.nextLine();
	}
	
	private void printMenu() {
		System.out.println("1) Melee");
		System.out.println("2) Ranged");
	}
	
	private void runCommand(String cmd, Actor hero) {
		Actor target = monsters[0]; // TODO: turn 0 into a random target
		runCommand(cmd, hero, target);
	}
	
	private void runCommand(String cmd, Actor hero, Actor target) {
		char num = cmd.charAt(0);
		int damage = 0;
		
		switch(num) {
		case '1': // melee
			// attacker
			// pow * meleePow = damage
			damage = getDamage(hero, hero.meleePow);
			attack(hero, target, damage);
			
			break;
		case '2': // ranged
			damage = getDamage(hero, hero.rangedPow);
			attack(hero, target, damage);
			
			break;
		default:
			System.out.println("I don't recognize the command: " + cmd);
		}
	}
	
	private int getDamage(Actor hero, int power) {
		int damage = hero.power * power;
		return damage;
	}
	
	private void attack(Actor attacker, Actor defender, int damage) {
		int roll = dice.nextInt(100);
		if (roll > defender.dodge) {
			// hit!
			defender.health -= damage;
			System.out.printf("%s hits %s for %d damage!%n", attacker.name, defender.name, damage);
			System.out.printf("%s has %d health remaining%n", defender.name, defender.health);
		} else {
			System.out.printf("%s misses!%n", attacker.name);
		}
	}
	
	private void checkGameState() {
	
		if (monsters[0].health <= 0) {
			isRunning = false;
			result = "win";
		} else if (getSurvivorCount() == 0){
			isRunning = false;
			result = "lose";
		}
	}
	
	private int getSurvivorCount() {
		int count = 0;
		for (int i=0; i<heroes.length; i+=1) {
			if (heroes[i].health > 0) {
				count += 1;
			}
		}
		return count;
	}
}
