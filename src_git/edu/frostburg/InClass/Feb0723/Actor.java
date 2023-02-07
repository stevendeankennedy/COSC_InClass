package edu.frostburg.InClass.Feb0723;

public class Actor {
	int health;
	int power;
	int rangedPow;
	int meleePow;
	int dodge;
	
	String name;

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getRangedPow() {
		return rangedPow;
	}

	public void setRangedPow(int rangedPow) {
		this.rangedPow = rangedPow;
	}

	public int getMeleePow() {
		return meleePow;
	}

	public void setMeleePow(int meleePow) {
		this.meleePow = meleePow;
	}

	public int getDodge() {
		return dodge;
	}

	public void setDodge(int dodge) {
		this.dodge = dodge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Actor(int health, int power, int rangedPow, int meleePow, int dodge, String name) {
		super();
		this.health = health;
		this.power = power;
		this.rangedPow = rangedPow;
		this.meleePow = meleePow;
		this.dodge = dodge;
		this.name = name;
	}
	
	
}
