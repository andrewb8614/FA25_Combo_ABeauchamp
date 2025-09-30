import java.util.Scanner;

public class BinaryConverter {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number you wish to convert");
		int num = input.nextInt();

		displayBin(num);
	}

	private static void displayBin(int num) {
		if (num > 0) {
			displayBin(num / 2);
			System.out.print(num % 2);
		}
	}

}
