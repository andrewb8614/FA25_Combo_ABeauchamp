import java.util.Scanner;

public class CircleCalculation {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please input the radius.");
		double radius = (input.nextDouble());
		double diameter = convertToDiameter(radius);
		double circumference = convertToCircumference(radius);
		double area = convertToArea(radius);
		System.out.printf("The diameter is %.2f units, the area is %.2f units\u00B2, & the circumference is %.2f units",
				diameter, area, circumference);

	}

	public static double convertToDiameter(double radius) {
		return radius * 2;

	}

	public static double convertToArea(double radius) {
		return radius * radius * Math.PI;

	}

	public static double convertToCircumference(double radius) {
		return 2 * Math.PI * radius;

	}

}
