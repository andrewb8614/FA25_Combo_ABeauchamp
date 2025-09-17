import java.util.Scanner;

public class StringsWork {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String word = "bananas";
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
		System.out.println("" + word.charAt(5) + word.charAt(6) + " is the " + (word.indexOf("as", 3) + 1) + " letter"); // how
																															// to
																															// find
																															// the
																															// index
																															// of
																															// something

		System.out.println(word.substring(0, 3)); // I want to start at 0 and go up to but not include 3, prints "ban"
		System.out.println(word.substring(3, 6)); // prints "ana"
		System.out.println(word.substring(3)); // prints everything after "ban"
		System.out.println(word); // prints whole thing "bananas"

		System.out.println(word.substring(0, 3) + "d" + word.substring(3)); // prints bandanas

		String reversed = reverse(word);
		System.out.println(reversed);

		System.out.println("Shall we go?");
		String answer = input.nextLine();
		answer = answer.toLowerCase(); // No matter capitalizaing, answer will work

		if (answer.equals("yes")) { // (answer == "yes") doesn't work because its a string
			System.out.println("Let's GOOOOO");
		} else {
			System.out.println("Boooooo");
		}

		String name1 = "Alan Turing";
		String name2 = "Ada Lovelace";

		int diff = name1.compareTo(name2);

		if (diff < 0) { //Name Sorter by alphabetical order
			System.out.println(name1 + " comes before " + name2);
		} else if (diff > 0) {
			System.out.println(name2 + " comes before " + name1);
		} else {
			System.out.println("The names are the same");
		}
		System.out.println("Enter the hour:");
		int hour = input.nextInt();
		System.out.println("Enter the minute");
		int min = input.nextInt();
		
		String time = timeString(hour,min);
		System.out.println(time);

	}

	private static String timeString(int hour, int min) {
			String ampm;
			if(hour < 12) {
				ampm = "AM";
				if(hour==0) {
					hour = 12;
				}
			}else {
				ampm = "PM";
				hour = hour - 12;
			}
		return String.format("%02d:%02d %s", hour, min, ampm);
	}

	private static String reverse(String word) {
		String r = "";
		for (int i = word.length() - 1; i >= 0; i--) { // need - 1 or youll get an out of bounds error
			r += word.charAt(i);
		}
		return r;
	}

}
