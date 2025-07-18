package array;

import java.util.Scanner;

public class StoreAndSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double[] numbers = new double[10];
		double total = 0.0; 
		int index = 0;

		// Infinite loop for user input
		while (true) {
			System.out.print("Enter a number (0 or negative to stop): ");
			double input = scanner.nextDouble();

			if (input <= 0) {
				break;
			}

			if (index == 10) {
				break;
			}

			numbers[index] = input;
			index++;
		}
		
		System.out.println("\nYou entered:");
		for (int i = 0; i < index; i++) {
			System.out.println(numbers[i]);
			total += numbers[i]; // Add to total
		}

		// Display the total sum
		System.out.println("\nTotal sum: " + total);
		scanner.close();
	}

}
