package com.skillstorm.training.project2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;

public class Deck extends Card{
	
	public Deck(Suit suit, Value value) {
		super(suit, value);
		// TODO Auto-generated constructor stub
	}
	private Random random;
	// ArrayList<Card> cards;
	ArrayList<Card> pulledCards;
	private static List<Card> cards = new ArrayList<Card>();

	public void reset() {
		pulledCards.clear();
		cards.clear();
		// Creating all possible cards
		for (Suit s : Suit.values()) {
			for (Value r : Value.values()) {
				Card c = new Card(s, r);
				cards.add(c);
			}

		}

	}

	public void CardsDeck() {
		random = new Random();
		pulledCards = new ArrayList<Card>();
		cards = new ArrayList<Card>(Suit.values().length * Value.values().length);
		reset();

	}

	/**
	 * get a random card, removing it from the pack
	 * 
	 * @return
	 */
	public Card pullRandom() {
		if (cards.isEmpty())
			return null;

		Card res = cards.remove(randInt(0, cards.size() - 1));
		if (res != null)
			pulledCards.add(res);
		return res;
	}

	/**
	 * Get a random cards, leaves it inside the pack
	 * 
	 * @return
	 */
	public Card getRandom() {
		if (cards.isEmpty())
			return null;

		Card res = cards.get(randInt(0, cards.size() - 1));
		return res;
	}

	/**
	 * Returns a pseudo-random number between min and max, inclusive. The difference
	 * between min and max can be at most <code>Integer.MAX_VALUE - 1</code>.
	 *
	 * @param min Minimum value
	 * @param max Maximum value. Must be greater than min.
	 * @return Integer between min and max, inclusive.
	 * @see java.util.Random#nextInt(int)
	 */
	public int randInt(int min, int max) {
		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = random.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	public boolean isEmpty() {
		return cards.isEmpty();
	}
	//////////// Get help with shuffle... Collection versus arrayList
	public static void shuffle() {
	    Collections.shuffle(cards); 
	}
	
	//////////////
}
