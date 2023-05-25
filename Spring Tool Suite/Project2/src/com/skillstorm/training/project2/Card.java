package com.skillstorm.training.project2;

public class Card {
	private Suit suit;
	private Value value;
   
	public Card(Suit suit, Value value) {
		this.suit = suit;
		this.value = value;
	}

	public Suit getSuit() {
		return suit;
	}

	public Value getRank() {
		return value;
	}

	public int getValue() {
		return value.ordinal() + 2;
	}
	  public String toString(){
	        return "\n"+ value + " of "+ suit;
	    }

	public enum Suit {
		SPADES, HEARTS, DIAMONDS, CLUBS;
	}

	public enum Value {
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;

	}


}