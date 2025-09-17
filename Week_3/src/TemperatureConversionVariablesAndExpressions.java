import java.util.Scanner;

public class TemperatureConversionVariablesAndExpressions {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("What is the temp in \u00B0F?");

		double fTemp = input.nextDouble();

		double cTemp = convertToC(fTemp);

		double kTemp = convertToK(cTemp);

		System.out.printf("%.2f\u00B0F is %.2f\u00B0C and %.2fK%n", fTemp, cTemp, kTemp);

	}

	public static double convertToC(double fTemp) {
		return (fTemp - 32) * 5 / 9;

	}

	public static double convertToK(double cTemp) {
		return (cTemp + 273.15);
	}

}
