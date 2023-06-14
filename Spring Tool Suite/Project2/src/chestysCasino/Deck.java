package chestysCasino;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import chestysCasino.Card.Suit;
import chestysCasino.Card.Value;

public class Deck{
	
	@Override
	public String toString() {
		return "Deck= " + deck + ", random= " + random + ", pulledCards= " + pulledCards;
	}
	private ArrayList<Card> deck;

	  public Deck() {
	        this.deck = new ArrayList<Card>(); 
	        for (Suit cardSuit : Suit.values()) {
	            for (Value cardValue : Value.values()) {                   
	                this.deck.add(new Card(cardSuit, cardValue));  	
	            }
	        }
	        shuffle();
	    }
	private Random random;
	ArrayList<Card> pulledCards;
	private static List<Card> cards = new ArrayList<Card>();

	public void reset() {
		cards.clear();
		// Creating all possible cards
		for (Suit s : Suit.values()) {
			for (Value r : Value.values()) {
				Card c = new Card(s, r);
				cards.add(c);
			}

		}

	}

	public void cardsDeck() {
		random = new Random();
		pulledCards = new ArrayList<Card>();
		cards = new ArrayList<Card>(Suit.values().length * Value.values().length);
		reset();

	}

	public Card pullRandom() {
		if (cards.isEmpty())
			return null;
		Card res = cards.remove(randInt(0, cards.size() - 1));
		if (res != null)
			pulledCards.add(res);
		return res;
	}

	public Card getRandom() {
		if (cards.isEmpty())
			return null;

		Card res = cards.get(randInt(0, cards.size() - 1));
		return res;
	}

	public int randInt(int min, int max) {
		int randomNum = random.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	public boolean isEmpty() {
		return cards.isEmpty();
	}
	 public void shuffle() {
	        ArrayList<Card> tempDeck = new ArrayList<Card>();               
	        Random random = new Random();                                   
	        int randomCardIndex = 0;                                        
	        int noOfCards = this.deck.size();                                                
	        for (int i = 0; i < noOfCards; i++) {
	            randomCardIndex = random.nextInt((this.deck.size()-1 - 0) + 1) + 0;
	            tempDeck.add(this.deck.remove(randomCardIndex));               
	        }
	       this.deck = tempDeck;
	    }

	public ArrayList<Card> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<Card> deck) {
		this.deck = deck;
	}
	 public Card draw() {
	        return deck.remove(0);
	    }
	 
	 public void addCard(Card addCard) {
		 this.deck.add(addCard);
	 }
	
}