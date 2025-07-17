package Basics;

import java.util.Scanner;

public class PerimeterRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the Rectangle : ");
		double length = sc.nextDouble();
		System.out.print("Enter The Width of the Rectangle : ");
		double width = sc.nextDouble();
		double area = length * width;
		System.out.println("Area of the Rectangle : " + area);
		sc.close();
	}

}
