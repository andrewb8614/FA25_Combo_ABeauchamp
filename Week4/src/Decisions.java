import java.util.Scanner;

public class Decisions {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//x == y (this is a question, "Does x = y?")
		//x != y (is x not equal to y?)
		//x > y (is x greater than y?)
		//x < y (is x less than y?)
		// <=
		// >=
		
		int x = 10;
		
		if(x % 2== 0) //whatever is in this if statement needs to evaluate to a boolean statement (either true or false)
			{
			System.out.println("x is even");
			
		} else{
			System.out.println("x is odd");
			
		}
		
		if (x>0)	{
			System.out.println("x is positive");
	
			
		}
		 
		else if (x<0)
		{
			System.out.println("x is negative");
		}
		else {
			
			System.out.println("x is zero");
		}
		
		System.out.println("Enter a number from 1-4");
		int num = input.nextInt();
		
		if(num ==1) {
			System.out.println("one");
		}
		else if(num == 2) {
			System.out.println("two");
			}
		else if(num ==3) {
			System.out.println("three");
			}
//		else (num == 4) {
//			System.out.println("four");
//			}
//				
//				
			
				
		switch (num) {
	
			case 1: 
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
			}
		
		String food = "banana";
		
		switch(food) {
			case "apple": //if(food == "apple || food == "banana" || food == "cherry"
			case "banana":
			case "cherry":
				System.out.println("Fruit!");
			case "broccoli":
			case "carrot":
			case "peas":
				System.out.println("veggie!");
				break;
			
			
			
		}
		
		
	//	if (x>0 && x < 10) { //numbers 1-9
			
		//}
		
		//x<0 || x>10 any number that's not 1-9
		//!(x>0) not greater than zero (any negative number would create a true)
		x = 4;
		int y = 0;
		
		if (x == 0) {
			
			
			if (y == 0) {
				System.out.println("Both x and y are zero");
			}
			
		}
		if (x == 0 && y ==0) System.out.println("both are zero");
		if (x == 0 || y == 0) System.out.println("Either x or y is zero"); // || is the or operator
		
		
		// DeMorgan's Law !(a && b) is the same as !a || !b
		// !(a || b) is the same as !a && !b
		
		boolean flag;
		flag = true;
	
		System.out.println(isSingleDigit(0));
		int userNum = getNum();
		while(!isSingleDigit(userNum)) {
			System.out.println("That is not a single digit! Try Again");
			userNum = getNum();
		}
		System.out.println("Great job following instructions!");
	}
	
	



	public static boolean isSingleDigit(int num) {
		return num > -10 && num < 10;
	}
	private static int getNum() {
		System.out.println("enter a single digit number");
		int userNum = input.nextInt();	
		return userNum;
	}
	

}
