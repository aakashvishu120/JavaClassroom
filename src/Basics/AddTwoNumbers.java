package Basics;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the num2");
		int num2 = sc.nextInt();
		
		int result = num1 + num2;
		System.out.println("Result : " + result);
	}

}
