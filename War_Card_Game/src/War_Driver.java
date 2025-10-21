
public class War_Driver {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		deck.printCards();
		//deck.bubbleSort();
		
		//deck.insertionSort();
		System.out.println("\n");
		deck.selectionSort();
		System.out.println("\n");
		deck.printCards();

	}

	private static int binSearch(Card[] cards, Card target) { // think of this like the guessing game guess a num 1-10,
																// you guess 5, num is higher, now you discard all the
																// nums 5 and below, low becomes mid
		int low = 0;
		int high = cards.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			int comp = cards[mid].compareTo(target);
			if (comp == 0)
				return mid;
			else if (comp < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
			System.out.println(low + ", " + high);
		}

		return -1;
	}

	private static int search(Card[] cards, Card target) {
		for (int i = 0; i < cards.length; i++) {
			if (cards[i].equals(target))
				return i;
		}
		return -1;
	}

}


