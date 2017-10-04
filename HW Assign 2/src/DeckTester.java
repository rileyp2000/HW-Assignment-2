/**
 * <p></p> 
 * Oct 2, 2017
 * @author Patrick Riley
 */

/**
 * @author rileyp
 *
 */
public class DeckTester {

	/**
	 * @param args
	 *
	 *void
	 */
	public static void main(String[] args) {
		Deck d = new Deck();
		System.out.println(d);
		//System.out.println("\n\n\n");
		//System.out.println(d);
		d.shuffle();
		System.out.println("\n\n" + d);
		
		//System.out.println(d.pick());
		d.selectionSort();
		System.out.println(d);
				
		/*Deck[] test = d.deal(2,3);
		for(Deck de : test)
			System.out.println(de);*/

	}

}
