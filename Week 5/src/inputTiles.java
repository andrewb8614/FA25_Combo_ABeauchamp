import java.util.Scanner;

public class inputTiles {

	
	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter 7 letters");
		String sevenLetters = input.next();
		System.out.println("input a word you wish to spell");
		String word1 = input.next();
	
		sevenLetters = sevenLetters.toLowerCase();
		boolean canSpell = canSpell(sevenLetters, word1);
		
		
		
		
		
		if(canSpell) {
			System.out.println("You can spell it");
		}else {
			System.out.println("You can't");
		}
		
		
	}

	private static boolean canSpell(String tiles, String word) { // a
		int len = word.length(); // shorthand for writing word.length every time
		
		
		char[] newWord = word.toCharArray();
		for (int i = 0; i <len; i++) {
			
			
			int count = 0;
			char letter = newWord[i];
			for(int j = 0; j < tiles.length(); j++) {
				if (newWord[j]== letter) { //a(count++)  b  b  a (count++)
					
					newWord[i] = '*';
					break;
					
				}
			}
			if(count != 2) {
				return false;
			}
		}
		
		
		return true;
	}

}
