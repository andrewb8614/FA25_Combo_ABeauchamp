import java.util.Scanner;

public class GradeCalculatorSolo {

	public static void main(String[] args) {
		System.out.println("Please enter your grade.");
		while (true)	{
		
			Scanner input = new Scanner(System.in);
		
	
			boolean validGrade = false;
			while (!validGrade) {
				float gradeInput = input.nextFloat();
	
				if (gradeInput >= 0) {
					validGrade=true;
	
					
					if (gradeInput >= 0 && gradeInput <60) {
						System.out.println("your grade is F");
					}
					else if (gradeInput >= 60 && gradeInput <67) {
						System.out.println("your grade is D");
					}
					else if (gradeInput >= 67 && gradeInput <69) {
						System.out.println("your grade is D+");
					}
					else if (gradeInput >= 69 && gradeInput <72) {
						System.out.println("your grade is C-");
					}
					else if (gradeInput >= 72 && gradeInput <77) {
						System.out.println("your grade is C");
					}
					else if (gradeInput >= 77 && gradeInput <79) {
						System.out.println("your grade is C+");
					}
					else if (gradeInput >= 79 && gradeInput <82) {
						System.out.println("your grade is B-");
					}
					else if (gradeInput >= 82 && gradeInput <87) {
						System.out.println("your grade is B");
					}
					else if (gradeInput >= 87 && gradeInput <89) {
						System.out.println("your grade is B+");
					}
					else if (gradeInput >= 89 && gradeInput <92) {
						System.out.println("your grade is A-");
					}
					else if (gradeInput >= 92) {
						System.out.println("your grade is A");
					}
	
				}
				else
				{
					System.out.printf("Please input a valid grade.");
	
				}
				System.out.println("If you'd like to check again, please enter your grade here.");
			}
		}
	}


	

}
