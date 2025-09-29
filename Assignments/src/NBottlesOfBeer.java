import java.util.Scanner;

public class NBottlesOfBeer {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of bottles of beer to start with");
		int bottles = input.nextInt();
		final int bottlesEndStatement = bottles;
		for (int i = bottles; i >= 0; i--) {
			if (bottles != 1 || bottles != 2) {
				System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer");

				System.out.println("Take one down, pass it around, " + (bottles - 1) + " bottles of beer on the wall");
				bottles = bottles - 1;
			}
			if (bottles == 2) {
				System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer");

				System.out.println("Take one down, pass it around, " + (bottles - 1) + " bottle of beer on the wall");
				bottles = bottles - 1;
			}

			if (bottles == 1) {
				System.out.println(bottles + " bottle of beer on the wall, " + bottles + " bottle of beer");

				System.out.println("Take one down, pass it around, " + (bottles - 1) + " bottles of beer on the wall");
				bottles = bottles - 1;
			}
			if (bottles == 0) {
				System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer");

				System.out.println(
						"Go to the store and buy some more, " + bottlesEndStatement + " bottles of beer on the wall");
				break;
			}

		}
	}
}
