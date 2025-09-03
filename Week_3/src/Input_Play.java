import java.util.Scanner;

public class Input_Play {
	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
//				printInput(); //here we are calling a method with no parameters or returns
//above we comment out the method to make it not run every time we test
				System.out.println("What is the temp in F?");
				
		
				double fTemp = input.nextDouble(); // input for a floating point number double
				
				double cTemp = convertToC(fTemp);
				
				double kTemp = convertToK(cTemp);
			
				System.out.println(fTemp + "F is " + cTemp + "C and " + kTemp + "K" );
				
				System.out.printf("%.2fF is %.2fC and %.2fK%n",fTemp,cTemp,kTemp);
				System.out.println("Enter kilos");
				
				double kilos = input.nextDouble();
				double pounds = convertToPounds(kilos);
				System.out.printf("%.2f", pounds);
	}
		
		private static double convertToPounds(double kilos) {
			// TODO Auto-generated method stub
			return kilos * 2.2;
		}

		//private is the access, static means its outside of main
		//void is the return type for returning nothing
		//printInput is the name and there are no parameters
		public static void printInput() { //changing private to public allows it to be pulled by other sections of the code. Used to protect the user from breaking their computer
				System.out.println("What is your name?");
				
				String name = input.next();
				
				System.out.println("Great " + name + "!");
				
				System.out.println("Enter your age in years");
				
				int age = input.nextInt();
						
				System.out.println("You age is " + age);
				
		}
		
		//public lets everyone use this
		//double is the data type of what is returned
		//double fTemp is the variable used inside this method, it is a parameter/argument
		public static double convertToC(double fTemp)
		{
		return (fTemp - 32) *5/9;
		
		}

		public static double convertToK(double cTemp)
		{
			return (cTemp +273.15);
		}
		
	

}
