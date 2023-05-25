package com.skillstorm.training.project2;
import java.util.Scanner;
public class Game {
	public static void main(String[] args) {

		Introduction.introduction();
		
		
		
		
		
		
		//////////// END OF GAME ///////////////
		Introduction.endOfGame();

	}
 
}


class Introduction{
	static Scanner in = new Scanner(System.in);
	
	public static void introduction() {
		System.out.println("Welcome to Chesty's Casino! Please enter your name to begin.");
		String name = in.next();
		do {
			if (name.equalsIgnoreCase(null)) {
				System.out.println("Please enter your name to begin.");
				name = in.next();
				
			} else {
				System.out.println("Welcome " + name.substring(0, 1).toUpperCase() + name.substring(1) + "! Let's begin.");
				break;
			}
		} while (true);
	}
	public static void endOfGame() {
		System.out.println("Would you like to play again? Please enter Y or N.");
		String playAgain = in.next();
		do {
			if (playAgain.equalsIgnoreCase("N")) {
				System.out.println("Goodbye, come play again soon!");
				break;
				
			} else if (playAgain.equalsIgnoreCase("Y")) {
				Deck.shuffle();
				/////////////////// LOOP BACK TO GAME //////////////////
				
			} else {
				System.out.println("Please enter Y or N.");
				playAgain = in.next();
			}
		} while (true);
	}
	}
