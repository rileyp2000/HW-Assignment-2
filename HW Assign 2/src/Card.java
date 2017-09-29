/**
 * <p>
 * This is the class that represents a card for hw assignment 2
 * </p>
 * Sep 27, 2017
 * 
 * @author Patrick Riley
 */

public class Card {

	private String suit;
	private String rank;
	private final String[] SUITS = new String[] { "Spades", "Diamonds", "Hearts", "Clubs" };
	private final int[] SUITNUM = new int[] { 0, 1, 2, 3 };
	private final String[] RANKS = new String[] { "ERROR", "ERROR", "Two", "Three", "Four", "Five", "Six", "Seven",
			"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace" };
	

	public Card() {
		suit = SUITS[0];
		rank = RANKS[0];
	}
	
	/**
	 * 
	 * @param sui Suit represented as an Integer between 0 and 3 inclusive
	 * @param ran Rank represented as an int between 2 and 14 inclusive
	 */
	public Card(int sui, int ran) {
		if (sui < SUITS.length)
			suit = SUITS[sui];
		else
			suit = SUITS[0];

		if (ran < RANKS.length)
			rank = RANKS[ran];
		else
			rank = RANKS[0];
	}
	
	/**
	 * 
	 * @param sui Suit represented as a String 
	 * @param ran Rank represented as a String
	 */
	public Card(String sui, String ran) {
		suit = findSuit(sui);
		rank = findRank(ran);
	}
	
	/**
	 * 
	 * @param sui Suit represented as a String
	 * @param ran Rank represented as an int between 2 and 14 inclusive
	 */
	public Card(String sui, int ran) {
		suit = findSuit(sui);
		if (ran < RANKS.length)
			rank = RANKS[ran];
		else
			rank = RANKS[0];
	}
	
	/**
	 * 
	 * @param sui Suit represented as an Integer between 0 and 3 inclusive
	 * @param ran Rank represented as a String
	 */
	public Card(int sui, String ran) {
		if (sui < SUITS.length)
			suit = SUITS[sui];
		else
			suit = SUITS[0];
		rank = findRank(ran);
	}
	
	

	// Private helper methods
	private String findRank(String rank) {
		for (String s : RANKS) {
			if (s.toLowerCase().equals(rank.toLowerCase()))
				return s;
		}
		return RANKS[2];
	}

	private String findSuit(String suit) {
		for (String s : SUITS)
			if (s.toLowerCase().equals(suit.toLowerCase()))
				return s;
		return SUITS[0];
	}

}
