package array;

import java.util.Scanner;

public class CheckAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 10 student age");
		for(int i =0 ; i < 10 ; i++) {
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("printing output");
		for(int i =0 ; i < 10 ; i++) {
			if(numbers[i] < 0) {
				System.out.println("Invalid Age");
			}
			if(numbers[i] >= 18) {
				System.out.println("The student with the age "+ numbers[i] +" can vote");
			}
			else {
				System.out.println("The student with the age " + numbers[i] + " cannot vote.");
			}
		}
		
	}

}
