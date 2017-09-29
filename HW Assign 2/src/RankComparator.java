import java.util.Comparator;

public class RankComparator implements Comparator<Card> {

	private boolean ascending;

	public RankComparator() {
		ascending = true;
	}

	public RankComparator(boolean a) {
		ascending = a;
	}

	@Override
	public int compare(Card c1, Card c2) {
		if (ascending)
			return c1.getRank() - c2.getRank();
		else
			return -1 * (c1.getRank() - c2.getRank());
	}

}
