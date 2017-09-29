import java.util.Comparator;
/**
 * <p>This is a rank comparator </p>
 * @author rileyp
 *
 */
public class RankComparator implements Comparator<Card> {

	private boolean ascending;

	public RankComparator() {
		ascending = true;
	}
	
	/**
	 * 
	 * @param a if order is ascending or not
	 */
	public RankComparator(boolean a) {
		ascending = a;
	}
	
	
	/**
	 * @param c1 A card
	 * @param c2 another card
	 * 
	 * @return c1's rank - c2's rank
	 */
	@Override
	public int compare(Card c1, Card c2) {
		if (ascending)
			return c1.getRank() - c2.getRank();
		else
			return -1 * (c1.getRank() - c2.getRank());
	}

}
