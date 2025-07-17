package Basics;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Radius");
		double radius = sc.nextFloat();
		double area = Math.PI * radius * radius;
		System.out.println("Area of the Circle : " + area);
		sc.close();
	}

}
