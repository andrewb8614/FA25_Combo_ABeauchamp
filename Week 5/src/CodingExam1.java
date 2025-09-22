import java.util.Scanner;

public class CodingExam1 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String message = null;
		int beverageChoice = 0;
		float quotient = 0;
		float sum = 0;
		MessagePrinter(message);
		BeverageSelector(beverageChoice);
		Divider(quotient);
		Accumulator(sum);

	}

	private static void MessagePrinter(String message) { // 2.) message printer
		System.out.println("This is my first programming test");
	}

	private static void BeverageSelector(int beverageChoice) { // 3.) beverage selector
		System.out.println(
				"Please input the number corresponding to the beverage you would like: 1.) Water 2.) Coke 3.) Coffee");
		boolean i = false;
		while (!i) {
			float bevChoice = input.nextInt();
			if (bevChoice == 1) {
				System.out.println("Water");
				i = true;
			} else if (bevChoice == 2) {
				i = true;
				System.out.println("Coke");
				i = true;
			} else if (bevChoice == 3) {
				System.out.println("Coffee");

			} else {
				System.out.println("Please enter a valid number");
			}
		}
	}

	private static void Divider(float quotient) { // 4.) Divider

		boolean i = false;

		System.out.println("Please input a dividend");
		float dividend = input.nextFloat();
		System.out.println("Please input a divisor");
		while (!i) {

			float divisor = input.nextFloat();
			if (divisor != 0) {
				quotient = dividend / divisor;

				System.out.printf("The answer is %.2f when you divide %.2f by %.2f", quotient, dividend, divisor);
				System.out.println();
				i = true;
			} else {
				System.out.println("Cannot divide by zero, please input a valid divisor");
			}
		}
	}

	private static void Accumulator(float sum) { // 5.) Accumulator
		boolean i = false;

		while (!i) {
			System.out.println("Please input a number to be added to the sum, enter 0 to stop");
			float inputNum = input.nextFloat();

			if (inputNum == 0) {
				i = true;
				System.out.println("The sum is " + sum);
			} else {
				sum = inputNum + sum;

			}
		}

	}

}
