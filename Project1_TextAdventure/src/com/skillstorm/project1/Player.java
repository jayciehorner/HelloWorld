package com.skillstorm.project1;

public class Player {
	private String name;
	private int smarts;
	//private static String happiness;
	private int sweetTooth;

//	String result1 = scene1Result();
	public Player() {

	}

	public Player(String name, int smarts, String happiness, int sweetTooth) {
		this.name = name;
		this.smarts = smarts;
		Scene.happiness = happiness;
		this.sweetTooth = sweetTooth;
	}

	@Override
	public String toString() {
		return "You have chosen " + this.name + ". Character stats: " + "\n" + "Smarts: " + this.smarts + "\n"
				+ "Happiness: " + Scene.happiness + "\n" + "Sweet Tooth: " + this.sweetTooth;

	}


}
