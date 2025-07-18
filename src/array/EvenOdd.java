package array;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[5];
		int n =5;
		System.out.println("Enter the 5 Numbers");
		
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i < n ; i++) {
			numbers[i] = sc.nextInt();
		}
		
		for(int i =0 ; i < n ; i++) {
			System.out.println(numbers[i]);
			if(numbers[i] > 0) {
				System.out.println("Number is Positive ");
				
				if(numbers[i] % 2 == 0) {
					System.out.println("Number is Even ");
				}
				else {
					System.out.println("Number is Odd ");
				}
			}
			else if(numbers[i] < 0){
				System.out.println("Number is Negative ");
			}
			else {
				System.out.println("Number is Zero ");
			}
			
		}
		
		int first_element = numbers[0];
		int last_element = numbers[n-1];
		
		if(first_element > last_element) {
			System.out.println(numbers[0] + " Number is greater than " + numbers[n-1]);
		}
		else if(first_element  < last_element) {
			System.out.println(numbers[n-1] + " Number is greater than " + numbers[0]);
		}
		else {
			System.out.println(first_element + " is equal to " + last_element);
		}
	}

}
