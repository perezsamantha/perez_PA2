import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userChoice;
		double userWeight, userHeight;
		double bodyMassIndex = 0.00;
		
		System.out.println("Which formula to calculate BMI? (Enter 1 for standard and 2 for metric)");
		userChoice = scnr.nextInt();
		
		if (userChoice == 1 ) {
			System.out.println("Enter your weight (in pounds) followed by your height (in inches):");
			
			userWeight = scnr.nextDouble();
			userHeight = scnr.nextDouble();
			bodyMassIndex = (703 * userWeight) / (userHeight * userHeight);
		}
		else if (userChoice == 2) {
			System.out.println("Enter your weight (in kilograms) followed by your height (in meters):");
			
			userWeight = scnr.nextDouble();
			userHeight = scnr.nextDouble();
			bodyMassIndex = userWeight / (userHeight * userHeight);
		}
		else {
			System.out.println("Invalid entry");
			System.exit(0);
		}
		
		System.out.printf("Your Body Mass Index is: %.2f%n", bodyMassIndex);
		
		System.out.println("\nBMI CATEGORIES:\n");
		System.out.println("Underweight - < 18.5");
		System.out.println("Normal weight - 18.5 - 24.9");
		System.out.println("Overweight - 25.0 - 29.9");
		System.out.println("Obesity - > 30.0");
		
		scnr.close();
	}

}
