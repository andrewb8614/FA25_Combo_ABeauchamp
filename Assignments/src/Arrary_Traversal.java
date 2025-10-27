import java.util.Scanner;

public class Arrary_Traversal {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(
				"Enter a set of positive integers you wish to reverse. Press enter after each number. Enter -1 to stop");

		int[] numberArray = new int[100];

		for (int i = 0; i < 101; i++) {

			System.out.println("Enter a num");

			int num = input.nextInt();
			numberArray[i] = num;

			if (num < 0 && num != -1)
				System.out.println("numbers must be positive");
			if (num == -1)
				break;

		}

		int index = 99;
		for (int i = 0; i < 100; i++) {
			if (numberArray[i] == -1) {
				index = i - 1;

				break;

			}

		}

		for (int i = index; i >= 0; i--)
			System.out.println(numberArray[i]);

	}


}
