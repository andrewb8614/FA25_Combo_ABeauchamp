import java.util.Scanner;

public class StringSorting {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("How many strings?");
		int arraySize = input.nextInt(); // gets number of strings from user
		arraySize++; // Inputing a string length i was only taking i-1 elements. arraySize+1 in the
						// for loop created an out of bounds error. This seemed to work.

		String[] inputStrings = new String[arraySize]; // creates array of the given size

		System.out.println("please enter the strings you wish to sort alphabetically");

		for (int i = 0; i < arraySize; i++) // gathers the elements of the array
			inputStrings[i] = input.nextLine(); // assigns said elements to an index

		AlphabeticalBubbleSort(inputStrings);

		System.out.println("Alphabetical Order: ");

		for (String outputStrings : inputStrings) {
			System.out.print(outputStrings);
		}
		System.out.println();

		System.out.println("Reverse Alphabetical Order: ");
		ReverseAlphabeticalBubbleSort(inputStrings);

		for (String outputStrings : inputStrings) {
			System.out.print(outputStrings);
		}
	}

	private static void ReverseAlphabeticalBubbleSort(String[] inputStrings) {
		int arraySize = inputStrings.length;
		for (int i = 0; i < arraySize - 1; i++) // Insert i'th record
			for (int j = 1; j < arraySize - i; j++)
				if (inputStrings[j - 1].compareTo(inputStrings[j]) < 0) {
					String temp = inputStrings[j - 1];
					inputStrings[j - 1] = inputStrings[j];
					inputStrings[j] = temp;
				}

	}

	private static void AlphabeticalBubbleSort(String[] inputStrings) {
		int arraySize = inputStrings.length;
		for (int i = 0; i < arraySize - 1; i++) // Insert i'th record
			for (int j = 1; j < arraySize - i; j++)
				if (inputStrings[j - 1].compareTo(inputStrings[j]) > 0) {
					String temp = inputStrings[j - 1];
					inputStrings[j - 1] = inputStrings[j];
					inputStrings[j] = temp;
				}

	}

}
