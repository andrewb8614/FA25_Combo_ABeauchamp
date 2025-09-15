import java.util.Scanner;

public class BookWork {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int x = 10;
		if (x > 0) {
			System.out.println("X is positive");
		} else if (x < 0) {
			System.out.println("X is negative");
		} else {
			System.out.println("X is 0");
		}

		if (x % 2 == 0) {
			System.out.println("X is even");
		} else {
			System.out.println("X is odd");

		}
		System.out.println("Enter a number between 1 and 5");
		int num = input.nextInt();
		String word;

		switch (num) {
		case 1:
			word = "One";
			break;
		case 2:
			word = "Two";
			break;
		case 3:
			word = "Three";
			break;
		case 4:
			word = "Four";
			break;
		case 5:
			word = "Five";
			break;
		default:
			word = "unknown";
			break;
		}
		System.out.println(word);

		int n = 10;
		while (n > 0) { // when we don't know how many
			System.out.println(n);
			n--;
		}
		System.out.println("Blast off");

		for (int i = 0; i < 10; i++) { // also called array loops because we know exactly how many
			System.out.println(i);
		}

	}

}
