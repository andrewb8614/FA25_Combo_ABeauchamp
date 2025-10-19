//Andrew Beauchamp

import java.util.Scanner;

public class Triangles {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num = 0;

		int i = 0;
		boolean continueLoop = true;

		do { // triangle creation loop
			do { // input num loop

				System.out.println("Please enter a number from 1 to 50");
				num = input.nextInt();
				if (num <= 50 && num > 0) {
					i++;

				} else {
					System.out.println("invalid number");

				}
			} while (i == 0);

			System.out.println("Enter a fill character");
			char fillChar = input.next().charAt(0);
			for (int j = 0; j != num + 1; j++) { // rows

				for (int h = j; h != num + 1; h++) { // initial spacing
					System.out.print(" ");
				}

				for (int k = j; k != 0; k--) { // Characters + spacing
					System.out.print(" " + fillChar);

				}
				System.out.println(); // line break / new row

			}
			System.out.println("Would you like to print another triangle? Press y for yes and any other key for no");
			String loopCheck = input.next();
			if (loopCheck.charAt(0) != 'y')
				continueLoop = false;

			i = 0; // resetting the variable values
			num = 0;

		} while (continueLoop == true);
		System.out.println("Have a good day!");
	}

}
