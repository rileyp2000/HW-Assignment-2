/**
 * <p>This is the class that represents a card for hw assignment 2</p> 
 * Sep 27, 2017
 * @author Patrick Riley
 */

public class Card {
	
	private String suit;
	private String rank;
	private final String[] SUITS = new String[] {"spades","diamonds","hearts","clubs"}; 
	private final int[] SUITNUM = new int[] {0,1,2,3};
	private final String[] RANKS = new String[] {"ERROR","ERROR","two","three","four","five","six","seven","eight","nine","ten","jack","queen","king","ace"};
	private final in
	
	public Card() {
		suit = SUITS[0];
		rank = RANKS[0];
	}
	
	public Card(int sui, int ran) {
		if(sui< SUITS.length)
		suit = SUITS[sui];
		else
			suit = SUITS[0];
		
		if(ran < RANKS.length)
		rank = RANKS[ran];
		else
			rank = RANKS[0];
	}
	
	public Card(String sui, String ran) {
		suit = findSuit(sui);
		rank = findRank(ran);
	}
	
	
	
	//Private helper methods
	private String findRank(String rank){
		for(String s: RANKS){
			if(s.equals(rank))
				return s;
		}
		return RANKS[2];
	}

	private String findSuit(String suit){
		for(String s: SUITS)
			if(s.equals(suit))
				return s;
		return SUITS[0];
	}
	
}

