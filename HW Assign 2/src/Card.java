/**
 * <p>This is the class that represents a card for hw assignment 2</p> 
 * Sep 27, 2017
 * @author Patrick Riley
 */

public class Card {
	private int suit, rank; 
	   
	   public Card(){
	      suit = 0;
	      rank = 1;
	   }
	   
	   public Card(int s, int r){
	      suit = s;
	      rank = r;
	   }
	   
	   public boolean equals(Object other){
	         if(suit == ((Card)other).suit && rank == ((Card)other).rank)
	            return true;
	         else 
	            return false;
	   }
	   
	   public int compareTo(Card other){
	         if(rank != other.rank)
	            return rank - other.rank;
	          else
	            if(suit - other.suit == 0)
	                  return 0;
	               else 
	                  return suit - other.suit;  
	   }
	   
	   //Getters
	   public int getRank(){
	      return rank;
	      }
	   public int getSuit(){
	      return suit;
	      }   
	      
	   
	   public String toString(){
	     
	      String result = "";
	     
	      switch(rank){      
	         case 1:
	            result = "Ace";
	            break;
	         case 11:
	            result = "Jack";
	            break;
	         case 12:
	            result = "Queen";
	            break;
	         case 13: 
	            result = "King";
	            break;   
	         default: 
	            result = "" + rank;
	            break;
	      }
	   
	      switch(suit){
	         case 0:
	            result += " of Spades";
	            break;
	         case 1:
	            result += " of Hearts";
	            break;   
	         case 2:
	            result += " of Clubs";
	            break;
	         default:
	            result += " of Diamonds";
	            break;
	      }
	      
	      return result;
	   
	   }
	   
	   
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*private String suit;
	private int rank;
	private final String[] SUITS = new String[] {"spades","diamonds","hearts","clubs"}; 
	private final int[] SUITNUM = new int[] {0,1,2,3};
	private final String[] RANKS = new String[] {"two","three","four","five","six","seven","eight","nine","ten","jack","queen","king","ace"};
	private final in
	
	public Card() {
		suit = SUITS[0];
		rank = 0;
	}
	
	public Card(int sui, int ran) {
		if(sui< SUITS.length)
		suit = SUITS[sui];
		else
			suit = 0;
		
		if(ran < RANKS.length)
		rank = ran;
		else
			rank = 0;
	}
	
	public Card(String sui, String ran) {
		if()
		suit = sui;
		rank = RANKS.indexOf(ran.toLowerCase());
	}
	
}*/
