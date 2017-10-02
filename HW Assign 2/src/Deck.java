/**
 * <p>This class represents a deck of card</p> 
 * Sep 29, 2017
 * @author Patrick Riley
 */

public class Deck {
	private Card[] cards;
	private int topCard;
	private boolean sorted;
	
	
	public Deck() {
		sorted = true;
		cards = createDeck(sorted);
		topCard = cards.length -1;
		
	}
	
	public Deck(boolean s) {
		cards = createDeck(s);
		topCard = cards.length -1;
		sorted = s;
	}

	private Card[] createDeck(boolean sorted) { //FIX THIS!@!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		Card[] cards = new Card[52];
		String[] suits = Card.getSUITS();
		String[] ranks = Card.getRANKS();
		int cardCounter = 0;
		
		for(int i = 0; i < Card.getSUITS().length; i ++) {
			for(int j = 9; j < Card.getRANKS().length; j++) {
				cards[cardCounter] = (new Card(suits[i], ranks[j]));
				cardCounter++;
			}
		}
		
		if(sorted)
			return cards;
		else
			return shuffle(cards);
				
				
	}
	
	
}
