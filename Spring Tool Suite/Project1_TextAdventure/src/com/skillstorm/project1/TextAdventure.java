package com.skillstorm.project1;

import java.util.Scanner;

public class TextAdventure extends Player {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
	
		
		

		Player stanley = new Player("Stanley", (int) 1, (String) "<3 <3 <3", (int) 5);
		Player sarah = new Player("Sarah", (int) 5, (String) "<3 <3 <3", (int) 3);
		Player tyler = new Player("Tyler", (int) 4, (String) "<3 <3 <3", (int) 1);

		System.out.println(
				"Greetings from Candy Land! In a world of candy and sunshine, it sure is a difficult road to the Candy Castle.\n"
						+ "Make your way through Peppermint Forrest, Gumdrop Mountains, and so much more! Be careful to avoid the\n"
						+ "sticky licorice traps laid by mean ol' Lord Licorice or any other inhabitants of Candy Land. Arrive happily"
						+ "\nat Candy Castle and win!");

		System.out.println("");
		System.out.println("Choose your character! Stanley, Sarah, or Tyler.");

		String player = in.next();
		do {
			if (player.equalsIgnoreCase("Stanley") || player.equalsIgnoreCase("Sarah")
					|| player.equalsIgnoreCase("Tyler")) {
				break;
			} else {
				System.out.println("Please choose an existing character.");
				player = in.next();
			}
		} while (true);

		if (player.equalsIgnoreCase("Stanley")) {
			System.out.println(stanley.toString());
		} else if (player.equalsIgnoreCase("Tyler")) {
			System.out.println(tyler.toString());
		} else {
			System.out.println(sarah.toString());
		}

		System.out.println("");

		System.out.println("Time to begin your journey. We begin by the gingerbread tree.\n");

		Scene.promptEnterKey();

/////////////////// SCENE 1 BEGIN /////////////////////////////////
		System.out.println(Scene.scene1A());
		Scene.scene1Result();
		Scene.promptEnterKey();
/////////////////// SCENE 1 END /////////////////////////////////

		System.out.println("");
		System.out.println("And away we go towards the Gumdrop Mountains");
		System.out.println("");
		Scene.promptEnterKey();

/////////////////// SCENE 2 BEGIN /////////////////////////////////
		System.out.println(Scene.scene2A());
		Scene.scene2Result();
		Scene.promptEnterKey();
/////////////////// SCENE 2 END /////////////////////////////////

		System.out.println("");
		System.out.println("Your journey continues.");
		System.out.println("");
		Scene.promptEnterKey();

/////////////////// SCENE 3 BEGIN /////////////////////////////////
		System.out.println(Scene.scene3A());
		Scene.scene3Result();
		Scene.promptEnterKey();
/////////////////// SCENE 3 END /////////////////////////////////

		System.out.println("");
		System.out.println("Your journey continues.");
		System.out.println("");
		Scene.promptEnterKey();

/////////////////// SCENE 4 BEGIN /////////////////////////////////

		System.out.println(Scene.scene4A());
		Scene.scene4Result();
		Scene.promptEnterKey();

/////////////////// SCENE 4 END /////////////////////////////////

		System.out.println("");
		System.out.println("Your journey continues.");
		System.out.println("");
		Scene.promptEnterKey();

/////////////////// SCENE 5 BEGIN /////////////////////////////////

		System.out.println(Scene.scene5A());
		Scene.scene5Result();
		Scene.promptEnterKey();

/////////////////// SCENE 5 END /////////////////////////////////

		System.out.println("");
		System.out.println("Congratulations, " + player
				+ ", you have reached Candy Castle! Eat all the candy you want and have FUN!!!");
		System.out.println("");
		in.close();

	}
}
