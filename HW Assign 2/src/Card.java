/**
 * <p>
 * This is the class that represents a card for hw assignment 2
 * </p>
 * @date Sep 27, 2017
 * 
 * @author Patrick Riley
 */

public class Card implements Comparable<Card>{

	private String suit;
	private String rank;
	private static final String[] SUITS = new String[] { "Clubs", "Diamonds", "Hearts", "Spades"};
	private static final String[] RANKS = new String[] {"Two", "Three", "Four", "Five", "Six", "Seven",
			"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace" };
	

	public Card() {
		suit = SUITS[0];
		rank = RANKS[2];
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

		if (ran != 0 && ran != 1)
			rank = RANKS[ran-2];
		else
			throw new IllegalArgumentException("Invalid Number passed in");
	}
	
	/**
	 * 
	 * @param sui Suit represented as a String 
	 * @param ran Rank represented as a String
	 */
	public Card(String sui, String ran) {
		suit = SUITS[findSuit(sui)];
		rank = RANKS[findRank(ran)];
	}
	
	/**
	 * 
	 * @param sui Suit represented as a String
	 * @param ran Rank represented as an int between 2 and 14 inclusive
	 */
	public Card(String sui, int ran) {
		
		suit = SUITS[findSuit(sui)];
		
		if (ran != 0 && ran != 1)
			rank = RANKS[ran-2];
		else
			throw new IllegalArgumentException("Invalid Number passed in");	}
	
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
		
		rank = RANKS[findRank(ran)];
	}
	
	//Getters 
	/**
	 * 
	 * @return Suit 
	 */
	public String getSuit() {
		return suit;
	}
	
	/**
	 * 
	 * @return suit
	 */
	public int getSuitInt(){
		return findSuit(suit);
	}
	
	/**
	 * 
	 * @return Rank
	 */
	public int getRank() {
		return findRank(rank);
	}
	
	/**
	 * 
	 * @return rank
	 */
	public String getRankStr(){
		return rank;
	}
	
	/**
	 * @return the sUITS
	 */
	public static String[] getSUITS() {
		return SUITS;
	}

	/**
	 * @return the rANKS
	 */
	public static String[] getRANKS() {
		return RANKS;
	}

	// Private helper methods
	private int findRank(String rank) {
		for (int i = 0; i < RANKS.length; i++) {
			if (RANKS[i].toLowerCase().equals(rank.toLowerCase()))
				return i;
		}
		return 0;
	}

	private int findSuit(String suit) {
		for (int i = 0; i < SUITS.length; i++)
			if (SUITS[i].toLowerCase().equals(suit.toLowerCase()))
				return i;
		return 0;
	}
	
	//Methods
	/**
	 * @return returns card in formula rank of suit
	 */
	public String toString(){
		return rank + " of " + suit;
	}
	
	/**
	 * @return if cards are equal based on suit and rank
	 * @param other another card 
	 */
	public boolean equals(Object other){
		if(other != null)
			return suit.equals(((Card)other).getSuit()) && rank.equals(((Card)other).getRankStr());
		else
			return false;
	}
	
	/**
	 * 
	 * @param c another card
	 * @return difference in rank between the cards
	 */
	public int compareTo(Card c){
		return getRank() - c.getRank();
	}
	
	
}
