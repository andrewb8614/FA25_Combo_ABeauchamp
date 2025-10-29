import java.util.Iterator;
import java.util.Random;

public class Deck {

	private Card[] cards;

	public Deck(int n) {
		this.cards = new Card[n];
	}

	public Deck() {
		this.cards = new Card[52];
		int index = 0;

		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards[index] = new Card(rank, suit);
				index++;
			}
		}

	}

	
	
	public Deck subDeck(int low, int high) { // grabs whole chunk of pile you won instead of taking one card at a time
		Deck sub = new Deck (high-low+1);
		for (int i = 0; i < sub.cards.length; i++) {
			sub.cards[i] = this.cards[low+i];
			
		}
		return sub;
	}
	
	public void insertionSort() {
		for (int i = 1; i < cards.length; i++) {
			for (int j = i; (j > 0) && (cards[j].compareTo(cards[j - 1]) < 0); j--) {
				swap(j, j - 1);
			}
		}

	}

	public void selectionSort() {
		for (int i = 0; i < cards.length-1; i++) {

			int bigIndex = 0;
			for (int j = 1; j < cards.length-i; j++) {
				if (cards[j].compareTo(cards[bigIndex])>0)bigIndex = j;
				
			}
			swap( bigIndex, cards.length - i - 1);
		}
	}

	public void bubbleSort() {
		for (int i = 0; i < cards.length; i++) {
			for (int j = 1; j < cards.length - i; j++) {
				if (cards[j - 1].compareTo(cards[j]) > 0) {
					swap(j - 1, j);

				}
			}
		}
	}

	public Card[] getCards() {
		return cards;
	}

	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			swap(i, randomInt(i, cards.length));

			// choose a random num between i and length - 1
			// swap the ith card and the randomly chosen card
		}
	}

	private static int randomInt(int low, int high) {
		Random rand = new Random();
		int num = rand.nextInt(high - low) + low;

		// inc

		// return a random number between low and high
		// including both (high - low ) something else also
		return num;
	}

	private void swap(int i, int j) {
		Card temp = cards[i];
		cards[i] = cards[j];
		cards[j] = temp;
	}

	public void printCards() {

		int n = 0;

		for (Card card : cards) {

			if (n % 13 == 0 && n != 0)
				System.out.println();
			System.out.print(card + ", ");
			n++;
		}

	}
}

// if I want a num 50-100
// high = 100
// low = 50
//(high - low) + low = (100-50)+50
