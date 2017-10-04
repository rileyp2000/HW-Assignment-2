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

	/**
	 * 
	 * @param s
	 *            if sorted or not
	 */
	public Deck(boolean s) {
		cards = createDeck(s);
		topCard = cards.length - 1;
		sorted = s;
	}

	/**
	 * 
	 * @param c
	 *            array of cards
	 */
	public void setCards(Card[] c) {
		cards = c;
	}

	/**
	 * 
	 * @param sorted
	 *            if sorted or not
	 * @return array of cards that represent a deck
	 */
	private Card[] createDeck(boolean sorted) {
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

	/**
	 * <p>
	 * This shuffles the deck
	 * </p>
	 */
	public void shuffle() {
		Card[] replace = new Card[TOTALCARDS];

		for (int i = 0; i < TOTALCARDS; i++) {
			int rand = (int) (Math.random() * TOTALCARDS);
			while (cards[rand] == null)
				rand = (int) (Math.random() * TOTALCARDS);

			Card c = cards[rand];
			replace[i] = cards[rand];
			cards[rand] = null;

		}
		setCards(replace);
		sorted = false;

	}

	/**
	 * <p>
	 * Converts deck to String
	 * </p>
	 */
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

	/**
	 * 
	 * @param d
	 *            A deck to compare to
	 * @return boolean If the decks are equal
	 */
	public boolean equals(Deck d) {
		if (cards.length != d.cards.length)
			return false;

		for (int i = 0; i < TOTALCARDS; i++) {
			if (cards[i] != d.cards[i])
				return false;
		}

		return true;
	}

	/**
	 * 
	 * @param numHands
	 *            number of desired hands
	 * @param numCards
	 *            number of desired cards in each hand
	 * @return Deck[] the hands represented as deck arrays
	 */
	public Deck[] deal(int numHands, int numCards) {
		Deck[] ret = new Deck[numHands];

		if (numHands * numCards <= TOTALCARDS) {
			for (int i = 0; i < numHands; i++) {
				Card[] hand = new Card[numCards];
				ret[i] = new Deck();
				int indexControl = 0;
				for (int c = topCard; c > topCard - numCards; c--) {
					hand[indexControl] = cards[c];
					cards[c] = null;
					indexControl++;
				}
				topCard = topCard - numCards;
				ret[i].setCards(hand);
				ret[i].topCard = ret[i].cards.length - 1;
			}
			return ret;
		} else
			return null;

	}

	/**
	 * 
	 * @return Card a randomly picked card from the deck
	 */
	public Card pick() {
		int numCards = cards.length - 1;
		int randCard = 0;

		do {
			randCard = (int) (Math.random() * numCards);
		} while (cards[randCard] == null);

		return cards[randCard];
	}

	/**
	 * <p>
	 * Sorts the deck according to the selection sort algorithm. Taken from the
	 * Skylit website student files
	 * </p>
	 */
	public void selectionSort() {
		for (int n = cards.length; n > 1; n--) {

			int max = 0;
			for (int i = 1; i < n; i++) {
				if (cards[i].compareTo(cards[max]) > 0)
					max = i;
			}

			Card temp = cards[max];
			cards[max] = cards[n - 1];
			cards[n - 1] = temp;
		}
	}

	public static void sort(Card[] a) {
		int n = a.length;
		Card[] temp = new Card[n];
		recursiveSort(a, 0, n - 1, temp);
	}

	// Recursive helper method: sorts a[from], ..., a[to]
	private static void recursiveSort(Card[] a, int from, int to, Card[] temp) {
		if (to - from < 2) // Base case: 1 or 2 elements
		{
			if (to > from && a[to].compareTo(a[from]) < 0) {
				// swap a[to] and a[from]
				Card aTemp = a[to];
				a[to] = a[from];
				a[from] = aTemp;
			}
		} else // Recursive case
		{
			int middle = (from + to) / 2;
			recursiveSort(a, from, middle, temp);
			recursiveSort(a, middle + 1, to, temp);
			merge(a, from, middle, to, temp);
		}
	}

	// Merges a[from] ... a[middle] and a[middle+1] ... a[to]
	// into one sorted array a[from] ... a[to]
	private static void merge(Card[] a, int from, int middle, int to, Card[] temp) {
		int i = from, j = middle + 1, k = from;

		// While both arrays have elements left unprocessed:
		while (i <= middle && j <= to) {
			if (a[i].compareTo(a[j]) < 0) {
				temp[k] = a[i]; // Or simply temp[k] = a[i++];
				i++;
			} else {
				temp[k] = a[j];
				j++;
			}
			k++;
		}

		// Copy the tail of the first half, if any, into temp:
		while (i <= middle) {
			temp[k] = a[i]; // Or simply temp[k++] = a[i++]
			i++;
			k++;
		}

		// Copy the tail of the second half, if any, into temp:
		while (j <= to) {
			temp[k] = a[j]; // Or simply temp[k++] = a[j++]
			j++;
			k++;
		}

		// Copy temp back into a
		for (k = from; k <= to; k++)
			a[k] = temp[k];
	}

}
