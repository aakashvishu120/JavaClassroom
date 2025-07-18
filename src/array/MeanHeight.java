package array;

import java.util.Scanner;

public class MeanHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		double[] heights = new double[11];
		double sum = 0, mean = 0;

		System.out.println("Enter the height of 11 Players");
		for (int i = 0; i < 11; i++) {
			heights[i] = scanner.nextDouble();
		}

		for (int i = 0; i < 11; i++) {
			sum += heights[i];
		}

		mean = sum / 11;
		System.out.print("Mean Height of the Players : ");
		System.out.println(mean);
		scanner.close();
	}

}
