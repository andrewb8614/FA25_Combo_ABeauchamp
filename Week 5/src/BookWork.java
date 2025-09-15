import java.util.Scanner;

public class BookWork {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
//		int x = 10;
//		if (x > 0) {
//			System.out.println("X is positive");
//		} else if (x < 0) {
//			System.out.println("X is negative");
//		} else {
//			System.out.println("X is 0");
//		}
//
//		if (x % 2 == 0) {
//			System.out.println("X is even");
//		} else {
//			System.out.println("X is odd");
//
//		}
//		System.out.println("Enter a number between 1 and 5");
//		int num = input.nextInt();
//		String word;
//
//		switch (num) {
//		case 1:
//			word = "One";
//			break;
//		case 2:
//			word = "Two";
//			break;
//		case 3:
//			word = "Three";
//			break;
//		case 4:
//			word = "Four";
//			break;
//		case 5:
//			word = "Five";
//			break;
//		default:
//			word = "unknown";
//			break;
//		}
//		System.out.println(word);
//
//		int n = 10; // "The initializer"
//		while (n > 0) { // when we don't know how many "the condition"
//			System.out.println(n);
//			n--; // "The changer"
//		}
//		System.out.println("Blast off!!");
//		// initializer, condition, changer all in one (in the for loop below)
//		for (int i = 0; i < 10; i++) { // also called array loops because we know exactly how many
//			System.out.println(i);
//		}
//
//		for (int i = 0; i < 10; i++) {
//			System.out.println();
//		}

		System.out.println("Enter the number of columns for the times table");
		int cols = input.nextInt();
		System.out.println("Enter the number of rows for the times table");
		int rows = input.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				System.out.printf("%4d", (i * j));
			}
			System.out.println(); // adds a newline after every row
		}

		for (char c = 'A', count = 0; c <= 'z' && count < 10; c++, count++) {

			if (count % 10 == 0)
				System.out.println();
			System.out.print(c + " ");

		}
		System.out.println("Done");

	}

}
