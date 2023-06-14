package chestysCasino;

import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
import java.time.LocalDate;

public class Game {
	static Scanner in = new Scanner(System.in);
	static Map<String, String> stats = new HashMap<>();

	public static void main(String[] args) throws Exception {

		Deck deck = new Deck();
		Hand playerHand = new Hand();
		Hand playerHand2 = new Hand();
		Hand dealerHand = new Hand();

		Player player = new Player();
		Player dealer = new Player();

		//////////////////// Print previous players to console///////////////////
		readData();
		//////////////////// Introduction ///////////////////
		System.out.println("Welcome to Chesty's Casino! Please enter your name to begin.");
		player.setName(in.nextLine());
		do {
			if (player.getName() == (null)) {
				System.out.println("Please enter your name to begin.");
				player.setName(in.nextLine());
				player.setName(player.getName().substring(0, 1).toUpperCase() + player.getName().substring(1));
				System.out.println("Welcome " + player.getName() + "! Let's begin.");

			} else {
				player.setName(player.getName().substring(0, 1).toUpperCase() + player.getName().substring(1));
				System.out.println("\nWelcome " + player.getName() + "! Let's begin.");
				break;
			}
		} while (true);

		System.out.println("Please add funds to begin");
		player.setBank(in.nextInt());
		System.out.println("Thank you for your deposit! your initial starting balance is: $" + player.getBank());

		//////////////////// Stores name to hash map///////////////////
		{
		stats.put((player.getName()), "Name");
		stats.put("Bank total", String.valueOf(player.getBank()));
//		if (stats.containsValue(player.getName())) {
//			stats.put("Name", (new Player().getName()));
//			stats.put("Bank total", String.valueOf(new Player().getBank()));
//		}
		}
		////////////////////// Game
		////////////////////// Starts//////////////////////////////////////////////////

		System.out.println("Are you ready for your hand? Please type 'Y' or 'N'.");
		String answer = in.next();
		while (answer.equalsIgnoreCase("Y")) {
			do {
				System.out.println("What would you like to bet?");
				player.setBet(in.nextInt());

				if (player.getBet() > player.getBank()) {
					System.out.println("Insufficient funds. You have $" + player.getBank()
							+ " left. If you would like to bet again type 'Bet'. If you would like to deposit more funds, type 'Deposit'.");
					String answer1 = in.next();
					if (answer1.equalsIgnoreCase("Bet")) {
						System.out.println("What would you like to set a bet?");
						player.setBet(in.nextInt());
						break;
					} else if (answer1.equalsIgnoreCase("Deposit")) {
						System.out.println("How much would you like to deposit?");
						player.addFunds(in.nextInt());
						System.out.println("Thank you for your deposit. Your new balance is $" + player.getBank());
						System.out.println("Please set your bet");
						player.setBet(in.nextInt());
						break;
					} else {
						System.out.println("Please enter a valid option");

					}
				}

			} while (player.getBank() <= 0);

			dealHand(deck, playerHand, dealerHand);
			System.out.println("\nYour cards are: " + playerHand);

			System.out.println("Your current hand value is: " + playerHand.handTotal(player.getHand()));
			System.out.println("\nThe dealer is showing" + dealerHand.getCard(0));
			System.out.println(
					"\nHow would you like to proceed? Please choose from the following: [H] hit, [S] stay, [D] double down, [X] split ");
			String move = in.next();
			do {
				if (move.equalsIgnoreCase("H")) {
					playerHand.hit(deck);
					System.out.println("With the hit, your hand is now: " + playerHand.handTotal(player.getHand()));
					while (playerHand.handTotal(player.getHand()) < 21) {
						System.out.println(playerHand);
						System.out.println("Do you want to hit again? Y or N");
						String move2 = in.next();
						if (move2.equalsIgnoreCase("Y")) {
							playerHand.hit(deck);
							System.out.println("Your current hand value is: " + playerHand.handTotal(player.getHand()));
						} else if (move2.equalsIgnoreCase("N"))
							
						break;

					}

				} else if (move.equalsIgnoreCase("D")) {
					player.doubleDown();
					playerHand.hit(deck);
					System.out.println("Your bet is now $ " + player.getBet());
					System.out.println("You get one card.\n");
					System.out.println("Your hand is now " + playerHand);
				} else if (move.equalsIgnoreCase("X")) {
					playerHand.split();
					System.out.println("Your hand is now: " + playerHand);

				} else {
					player.stay();

					continue;
				}
			} while (!move.equalsIgnoreCase("H") && !move.equalsIgnoreCase("D") && !move.equalsIgnoreCase("X")
					&& !move.equalsIgnoreCase("S"));

			int playerTotal = playerHand.handTotal(player.getHand());
			int dealerTotal = dealerHand.handTotal(dealer.getHand());

			while (dealerTotal < 17) {
				dealerHand.hit(deck);
				dealerTotal = dealerHand.handTotal(dealer.getHand());
				if (dealerTotal > 21) {
					dealer.bust();
				}

			}

			if (playerTotal == 21) {
				System.out.println("\nYour hand is " + playerHand + " whith a total of  " + playerTotal);
				System.out.println("\nThe dealer has " + dealerHand + " with a total of " + dealerTotal);

				player.blackJack();
				System.out.println("Blackjack!! You won this hand!");

			}
			if (playerTotal > 21) {
				System.out.println("\nYour hand is " + playerHand + " whith a total of  " + playerTotal);
				System.out.println("\nThe dealer has " + dealerHand + " with a total of " + dealerTotal);
				player.bust();
				System.out.println("You busted! Try again.");
			}
			if ((playerTotal > dealerTotal && playerTotal < 21) || (playerTotal < 21 && dealerTotal > 21)) {

				player.win();
				System.out.println("\nYour hand is " + playerHand + " whith a total of  " + playerTotal);
				System.out.println("\nThe dealer has " + dealerHand + " with a total of " + dealerTotal);
				System.out.println("You won this hand!");
			}
			if (playerTotal == dealerTotal) {
				player.push();
				System.out.println("\nYour hand is " + playerHand + " whith a total of  " + playerTotal);
				System.out.println("\nThe dealer has " + dealerHand + " with a total of " + dealerTotal);
				System.out.println("Draw!");
			}
			if (playerTotal < dealerTotal && dealerTotal < 21) {
				player.loss();
				System.out.println("\nYour hand is " + playerHand + " whith a total of  " + playerTotal);
				System.out.println("\nThe dealer has " + dealerHand + " with a total of " + dealerTotal);
				System.out.println("The dealer won this hand.");
			}

			//////////// END OF GAME ///////////////
			System.out.println("\nYour bank is now $" + player.getBank());
			System.out.println("Would you like to play again? Please enter Y or N.");
			String playAgain = in.next();
			do {
				if (playAgain.equalsIgnoreCase("N")) {
					System.out.println("Goodbye, come play again soon!");
					writeData();
					System.exit(0);
					

				} else if (playAgain.equalsIgnoreCase("Y")) {
					playerHand.returnCardsToDeck(deck);
					playerHand2.returnCardsToDeck(deck);
					dealerHand.returnCardsToDeck(deck);
					deck.reset();
					/////////////////// LOOP BACK TO GAME //////////////////

				} else {
					System.out.println("Please enter Y or N.");
					playAgain = in.next();
				}
			} while (!playAgain.equalsIgnoreCase("y"));

		}
	}

	public static void endOfGame() throws Exception {
		System.out.println("Would you like to play again? Please enter Y or N.");
		String playAgain = in.next();
		do {
			if (playAgain.equalsIgnoreCase("N")) {
				System.out.println("Goodbye, come play again soon!");
				writeData();
				break;

			} else if (playAgain.equalsIgnoreCase("Y")) {

			} else {
				System.out.println("Please enter Y or N.");
				playAgain = in.next();
			}
		} while (!playAgain.equalsIgnoreCase("y"));

	}

	public static void readData() throws Exception {
		/////////////////////// READS PLAYER DATA FROM FILE AND PRINTS TO
		/////////////////////// CONSOLE//////////////////////////////////////
		try (InputStream in = new FileInputStream(new File("PlayerData.txt"))) {
			int b;
			while ((b = in.read()) != -1) {
				System.out.print((char) b);
			}
		}
		System.out.println();

	}

	public static void writeData() throws Exception {
		try (FileWriter out = new FileWriter(new File("PlayerData.txt"))) {
			out.write(stats.toString()); // take in as parameter player object, write the player.toString()

		}

	}

	static class PlayerData {
		static Person p = new Person();
		Player b = new Player();

		public PlayerData() {
			super();
		}

		public PlayerData(String name, int bank) {
			super();
			p.setName(name);
			b.setBank(bank);
		}

		@Override
		public String toString() {
			return p.getName() + ", Bank" + b.getBank() + LocalDate.now();
		}

	}

	public static void dealHand(Deck deck, Hand playerHand, Hand dealerHand) {
		playerHand.deal(deck);
		dealerHand.deal(deck);

		playerHand.deal(deck);
		dealerHand.deal(deck);
	}

	private static void showHand(Hand playerHand) {
		System.out.println("\n" + "Your hand:");
		System.out.println(playerHand.toString());
		System.out.println("Your total hand value is: " + playerHand.handTotal(playerHand.getHand()));
	}

	public static void start() throws Exception {
		String answer = in.next();
		do {
			main(new String[0]);

		} while (answer.equalsIgnoreCase("Y"));
	}
}
