package array;

import java.util.Scanner;

public class SumEvenOodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.println("Enter the size");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		if(number < 1) {
			System.out.println("Invalid Input : Number must be positive Number");
			return;
		}
		
		int size = number / 2 + 1;
        int[] oddNumbers = new int[size];
        int[] evenNumbers = new int[size];

        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        }

        // Print odd numbers
        System.out.print("Odd Numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        // Print even numbers
        System.out.print("\nEven Numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }

        sc.close();
	}

}
