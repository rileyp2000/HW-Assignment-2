/**
 * <p>This is a tester for the deck class</p> 
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
		System.out.println("\n\nShuffled: \n" + d);
		
		System.out.println("Picked Card: " + d.pick());
	
		d.selectionSort();
		System.out.println("Selection Sort: \n" + d);
		
		d.shuffle();
		
		d.mergeSort();
		System.out.println("MergeSort: \n" + d + "\n\n\n");
				
		Deck[] test = d.deal(2,3);
		for(Deck de : test)
			System.out.println(de);

	}

}
