import java.util.Scanner;

public class Bookwork {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
//			System.out.println(System.out);
//			
//			System.out.println("Type Something");
//			String word = input.next();
//			System.out.println(word);
//			
//			input.nextLine();
//			
//			
//			System.out.println("Type Something");
//			String words = input.nextLine();
//			System.out.println(words);
//		
//		final double CM_PER_INCH = 2.54;
//		int inch = 100;
//		double cm = inch * CM_PER_INCH; 
	
//		
//		System.out.println("How many inches?");
//		inch = input.nextInt();
//		
//		cm = inch * CM_PER_INCH;
//		System.out.print(inch + " in = ");
//		System.out.println(cm + " cm");
//	
		
//		System.out.printf("Four thirds = %.3f\n" , 4.0/3); 
//		System.out.printf("%d in = %.3f cm\n" , inch, cm); // %.3f seems to change num of decimal places
//		
//		
//		String num = "73";
//		double pi = 3.14;
//		
//		System.out.println((int) pi + " " + pi);
//		System.out.println(Integer.parseInt(num) + pi);
//		System.out.println(num + pi);
//		
//		
//		int feet = 76/12;
//		int inches = 76%12;
//		
//		System.out.println(feet + "' " + inches + "\""); // \ is an escape character, tell console to print rather than run the next char

	
	
		double cm;
		int feet, inches, remainder;
		final int IN_PER_FOOT = 12;
		final double CM_PER_INCH = 2.54;
		
		
		System.out.println("Exactly how many centimeters?");
		cm = input.nextDouble();
		
		
		inches 	= (int)(cm/CM_PER_INCH);
		feet = inches / IN_PER_FOOT;
		remainder = inches % IN_PER_FOOT;
		
		System.out.printf("%.2f is %d feet and %d in\n", cm, feet, remainder);
		
	
	
	
	
	
	}

}
