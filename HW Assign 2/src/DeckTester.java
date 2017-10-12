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
	 *            void
	 */
	public static void main(String[] args) {
		// Deck d = new Deck();
		// System.out.println(d);
		//
		// //System.out.println("\n\n\n");
		// //System.out.println(d);
		// d.shuffle();
		// System.out.println("\n\nShuffled: \n" + d);
		//
		// System.out.println("Picked Card: " + d.pick());
		//
		// d.selectionSort();
		// System.out.println("Selection Sort: \n" + d);
		//
		// d.shuffle();
		//
		// d.mergeSort();
		// System.out.println("MergeSort: \n" + d + "\n\n\n");
		//
		// Deck[] test = d.deal(2,3);
		// for(Deck de : test)
		// System.out.println(de);

		// ********************SEAN TESTS*******************//
		Deck d1 = new Deck();
		// Test equals
		// Deck d2 = new Deck();
		// System.out.println(d1.equals(d2));
		System.out.println(d1);

		// Test shuffle
		d1.shuffle();
		System.out.println(d1);

		System.out.println(d1.pick());
		System.out.println(d1.pick());
		System.out.println(d1.pick());

		/*
		 * Test deal Deck[] goFish = d1.deal(5, 5); System.out.println(goFish[0]);
		 * System.out.println(goFish[1]); System.out.println(goFish[2]);
		 * 
		 * 
		 * /* // Test shuffle and sorts for a smaller deck goFish[2].selectionSort();
		 * System.out.println(goFish[2]); // goFish[2].shuffle();
		 * System.out.println(goFish[2].pick()); System.out.println(goFish[2].pick());
		 * System.out.println(goFish[2].pick()); System.out.println(goFish[2]);
		 * goFish[2].mergeSort(); System.out.println(goFish[2]);
		 * 
		 * 
		 * /* Test pick System.out.println(d1); System.out.println(d1.pick());
		 * System.out.println(d1); System.out.println(d1.pick());
		 */

	}

}
