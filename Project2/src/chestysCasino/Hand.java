package chestysCasino;
import java.util.ArrayList;
import java.util.List;
public class Hand {

	private List<Card> hand = new ArrayList<>();
	private Hand hand2;
	public ArrayList<Card> getHand() {
		return (ArrayList<Card>) hand;
	}

	public Hand(List<Card> list) {
		this.hand = list;

	}

	public Hand() {
		hand = new ArrayList<Card>();
	}

	public boolean hit(Deck deck) {
		Card i = deck.draw();
		return hand.add(i);

	}

	public void stay() {
		// move to next hand in order
	}

	public Hand split() {
//		hand = (ArrayList<Card>) hand.subList(0, 1);
		hand2 = new Hand(hand.subList(1, 2));
		hand = hand.subList(0, 1);
		return hand2;
		
		//arrayList.get().atIndex()
		
		// sublist from index and to index
		// create new hand[] with each card
		// if cards at index 0 and 1 == new card[]
	}

	public Card getCard(int index) {
		return this.hand.get(index);
	}
	

//	public int calculateTotalHandValue(ArrayList<Card> playerHand) {
//		if (hand == null) {
//			return 0;
//		}
//		int x;
//		int sum = 0;
//		int aces = 0;
//		if (hasAce(playerHand)) {
//			for (int i = 0; i < hand.size(); i++) {
//				if (hand.get(i).getValue() != Value.ACE) {
//					x = Card.toInt(hand.get(i).getRank());
//					sum += x;
//				} else {
//					aces++;
//				}
//
//			}
//			if (21 - sum >= 10 && aces >= 1) {
//				sum += 10;
//				aces--;
//			} else {
//				sum += 1 * aces;
//			}
//		} else {
//			for (int i = 0; i < hand.size(); i++) {
//				x = Card.toInt(hand.get(i).getRank());
//				sum += x;
//			}
//		}
//
//		return sum;
//	}

	public int handTotal(ArrayList<Card> playerHand) {
		int sum = 0;
		int x;
		int aces = 0;
		
		
		for(int i = 0; i < hand.size(); i++) {
				x = Card.toInt(hand.get(i).getRank());
				sum += x;
				if(x == 11) {
					aces++;
				}	
		}
		
		if(sum > 21 && aces > 0) {
			while(aces > 0 && sum > 21)
				aces--;
			sum -= 10;
		}

		return sum;
	}

//	public boolean hasAce(ArrayList<Card> hand) {
//		int x;
//		if(hand == null) {
//			return false;
//		}
//		for (int i = 0; i < hand.size(); i++) {
//			x = Card.toInt(hand.get(i).getRank());
//			if (x == 1) {
//				return true;
//			}
//			
//		}
//
//		return false;
//	}



	public void resetHand() {
		hand.clear();

	}


	public void deal(Deck deck) {
		hand.add(deck.draw());

	}
	public void returnCardsToDeck(Deck deck) {
    	while ( !hand.isEmpty() ) {
    		deck.addCard(hand.remove(0));
    	}
    }

	@Override
	public String toString() {
		if(hand2 == null) {
			return hand + "";
		}else {
		return hand + " hand2= " + hand2;
		}
	}
	

}