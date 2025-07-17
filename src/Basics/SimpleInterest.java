package Basics;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Principal Amount : ");
		double principal = sc.nextDouble();
		System.out.print("Enter The Rate : ");
		double rate = sc.nextDouble();
		System.out.print("Enter The Time : ");
		double time = sc.nextDouble();
		double simple_interest = (principal * rate * time) / 100;
		System.out.println("Simple Interest : " + simple_interest);
		sc.close();
	}

}
