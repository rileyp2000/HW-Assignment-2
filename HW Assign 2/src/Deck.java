/**
 * <p>
 * This class represents a deck of card
 * </p>
 * Sep 29, 2017
 * 
 * @author Patrick Riley
 */

public class Deck {
	private Card[] cards;
	private int topCard;
	private boolean sorted;

	private static final int NUMSUITS = (Card.getSUITS()).length;
	private static final int NUMCARDS = (Card.getRANKS()).length;
	private static final int TOTALCARDS = NUMSUITS * NUMCARDS;

	public Deck() {
		sorted = true;
		cards = createDeck(sorted);
		topCard = cards.length - 1;

	}

	public Deck(boolean s) {
		cards = createDeck(s);
		topCard = cards.length - 1;
		sorted = s;
	}

	public void setCards(Card[] c) {
		cards = c;
	}

	private Card[] createDeck(boolean sorted) { // FIX THIS!@!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		Card[] cards = new Card[52];
		String[] suits = Card.getSUITS();
		String[] ranks = Card.getRANKS();
		int cardCounter = 0;

		for (int i = 0; i < NUMSUITS; i++) {
			for (int j = 0; j < NUMCARDS; j++) {
				cards[cardCounter] = (new Card(suits[i], ranks[j]));
				cardCounter++;
			}
		}

		if (!sorted)
			shuffle();
		topCard = cards.length - 1;

		return cards;

	}

	public void shuffle() {
		Card[] replace = new Card[TOTALCARDS];

		for (int i = 0; i < replace.length - 1; i++) {
			int rand = (int) (Math.random() * TOTALCARDS);
			while (cards[rand] == null)
				rand = (int) (Math.random() * TOTALCARDS);

			Card c = cards[rand];
			replace[i] = cards[rand];
			cards[rand] = null;

		}
		setCards(replace);

	}

	public String toString() {
		String result = "";
		if (topCard == TOTALCARDS - 1) {
			for (int r = 0; r < NUMCARDS; r++) {
				for (int s = 0; s < NUMSUITS; s++)
					result += cards[NUMCARDS * s + r] + "	";
				result += "\n";

			}
		} else {
			for (Card c : cards)
				result += c.toString() + "\n";
		}
		return result;

	}

	public boolean equals(Deck d) {
		if (cards.length != d.cards.length)
			return false;

		for (int i = 0; i < TOTALCARDS; i++) {
			if (cards[i] != d.cards[i])
				return false;
		}

		return true;
	}

}
