/**
 * <p>This is the class that represents a card for hw assignment 2</p> 
 * Sep 27, 2017
 * @author Patrick Riley
 */

public class Card {
	private String suit;
	private int rank;
	private final String[] SUITS = new String[] {"Spades","Diamonds","Hearts","Clubs"}; 
	private final int[] SUITNUM = new int[] {0,1,2,3};
	private final String[] RANKS = new String[] {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
	
	public Card() {
		suit = SUITS[0];
		rank = 0;
	}
	
	public Card(int sui, int ran) {
		if(sui< SUITS.length)
		suit = sui;
		if(ran < RANKS.length)
		rank = ran;
	}
	
	public Card(String sui, String ran) {
		suit = sui;
		rank = ran;
	}
	
}
