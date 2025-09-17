import java.util.Scanner;

public class Doubloon {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a word and I will tell you if it is a doubloon");
		String word = input.next();
		word = word.toLowerCase();
		boolean isDub = isDoubloon(word);
		
		if(isDub) {
			System.out.println("It's a Doubloon");
		}else {
			System.out.println("NO go");
		}
		
		
	}

	private static boolean isDoubloon(String word) { // a
		int len = word.length(); // shorthand for writing word.length every time
		for (int i = 0; i <len; i++) {
			int count = 0;
			char letter = word.charAt(i);
			for(int j = 0; j < len; j++) {
				if (word.charAt(j)== letter) { //a(count++)  b  b  a (count++)
					count++;
					
				}
			}
			if(count != 2) {
				return false;
			}
		}
		
		
		return true;
	}

}
