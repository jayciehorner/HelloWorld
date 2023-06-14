package chestysCasino;
import java.util.ArrayList;


public class Player extends Person{
	private int bet = 0;
	private int bank = 0;
//	private Hand hands;
//	private int deposit = 0; 
//	private ArrayList<Card> hand;
	
	public Player() {
		
	}
	
	public void addFunds(int x) {
		bank += x;
	}
	
//	public void cashOut() {
//		bank = 0;
//	}
	
	public void win() {
		bank += bet;
		bet = 0;
	}
	
	public void loss() {
		bank -= bet;
		bet = 0;
	}
	
	public void blackJack() {
		bank += bet * 1.5;
		//changed from (3/2) to 1.5
		bet = 0;
	}
	
	public void bust() {
		bank -= bet;
		bet = 0;
	}
	
	public void push() {
		bet = 0;
	}
	
	public void doubleDown() {
		bet *= 2;
		//players.
		//pulls one card
		//so deck.next();
		//bet = 0;
	}
	public int getBank() {
		return bank;
	}
	public void setBank(int bank) {
		this.bank = bank;
	}
	public int getBet() {
		return bet;
	}
	public void setBet(int bet) {
		this.bet = bet;
	}
	
	
	public void insurance() {
		
		//if(dealer.hasAce)
		//create hasAce method
		//both for this and calculateHandValue method in Hand class
		//dealer showing ace
		//pays 2/1
		//half players bet
		//new bet?
	}


}