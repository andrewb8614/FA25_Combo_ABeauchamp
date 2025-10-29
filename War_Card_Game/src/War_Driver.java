
public class War_Driver {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		
		
		Pile p1 = new Pile();
		p1.addDeck(deck.subDeck(0, 25));
		
		Pile p2 = new Pile();
		p2.addDeck(deck.subDeck(26, 51));
		Pile center = null;
		int diff =-1;

		while(!p1.isEmpty() && !p2.isEmpty()) {
			
			
			if (diff != 0) {
				 center = new Pile();
			}
			
			
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			
			System.out.println(c1 + " " + c2);
			
			center.addCard(c1);
			center.addCard(c2);
			
			 diff = c1.getRank() - c2.getRank();
			
			if (diff >0) {
				
				System.out.println(" player 1");
				for (int i = 0; i < center.size(); i++ ) {
					p1.addCard(center.popCard());

				}
				
			}
			else if (diff <0) {
				System.out.println(" player 2");
				for (int i = 0; i < center.size(); i++) {
					p2.addCard(center.popCard());

				}
			}else {
				System.out.println("war");
				
				for(int i = 0; i<3; i++) {
					if(!p2.isEmpty() && !p1.isEmpty()) {
						center.addCard(p1.popCard());
						center.addCard(p2.popCard());
					}
						
						
					
				}
				
			}

		}
		
		
		if(p2.isEmpty())System.out.println("Player one wins");
		else System.out.println("Player two wins");
//		deck.printCards();
//		//deck.bubbleSort();
//		
//		//deck.insertionSort();
//		System.out.println("\n");
//		deck.selectionSort();
//		System.out.println("\n");
//		deck.printCards();

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
