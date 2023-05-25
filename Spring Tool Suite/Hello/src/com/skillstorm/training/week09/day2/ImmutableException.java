package com.skillstorm.training.week09.day2;

public class ImmutableException {
	public static void main(String [] args) {
		Card c = new Card();
		System.out.println(c.getSuit() + "" );
	}

}
// To make it immutable:
// 1. Private final instance properties
// 2. Constructor sets all values
// 3. No setters
// 4. Don't pass around references to mutable properties
// 5. Prevent method overloading

class Card{
	private final String suit; // should use Enum
	private final int value; // note Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King
	
	public Card (){
		this.suit = "Hearts";
		this.value = 15;
	}
	public Card (String suit, int value) {
		this.suit = suit;
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}
	public int getValue() {
		return value;
	}
	
	// instead of returning the value number, return the equivalent name of the cards
	// getters but no setters
}