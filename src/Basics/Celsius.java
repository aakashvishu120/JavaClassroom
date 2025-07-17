package Basics;

import java.util.Scanner;

public class Celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temp in Celsius");
		float celsius = sc.nextFloat();
		float answer = (celsius * 9/5) + 32;
		System.out.println("Fahrenheit Temp : " + answer);
		 sc.close();
	}

}
