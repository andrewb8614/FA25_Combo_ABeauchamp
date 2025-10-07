import java.util.Scanner;

public class N_Bottles {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many bottles?");
		int bottles = input.nextInt();

		BoB(bottles);

	}

	private static void BoB(int bottles) {
		if (bottles == 0) {
			System.out.println("No bottles left to grab");
			
		}
		else if (bottles == 1) {
			System.out.println("One bottle of beer on the wall " 
					+ "one bottle of beer " 
					+ "take one down pass it around "
					+ "no bottles of beer on the wall");
			BoB(bottles - 1);
		}

		else if (bottles == 2) {
			System.out.println("Two bottles of beer on the wall " 
					+ "Two bottles of beer "
					+ "take one down pass it around " 
					+ "one bottle of beer on the wall");
			BoB(bottles - 1);
		}
		else {System.out.println(bottles + " bottles of beer on the wall " 
				+ bottles + " bottles of beer "
				+ "take one down pass it around " 
				+ bottles + " bottles of beer on the wall");

		BoB(bottles - 1);
		}
	}

}
