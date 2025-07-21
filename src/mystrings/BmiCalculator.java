package mystrings;

import java.util.Scanner;

public class BmiCalculator {
	
	 // Method to calculate BMI and status
    public static String[][] calculateBmiAndStatus(double[][] data) {
        String[][] result = new String[10][4]; // [Height, Weight, BMI, Status]

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);
            String status;

            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 24.9)
                status = "Normal";
            else if (bmi < 29.9)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.format("%.2f", heightCm);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    // Method to display the result
    public static void displayResult(String[][] result) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n",
                    result[i][0], result[i][1], result[i][2], result[i][3]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2]; // [weight, height]

        System.out.println("Enter the weight (kg) and height (cm) for 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");

            System.out.print("  Weight (kg): ");
            data[i][0] = scanner.nextDouble();

            System.out.print("  Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        String[][] result = calculateBmiAndStatus(data);
        System.out.println("\nBMI Report:");
        displayResult(result);
        scanner.close();
    }

}
