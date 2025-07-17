package Basics;

import java.util.Scanner;

public class VolumeOfCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Radius of the Cylinder : ");
		double radius = sc.nextDouble();
		System.out.print("Enter The Height of the Cylinder : ");
		double height = sc.nextDouble();
		double volume = Math.PI * radius * radius * height;
		System.out.println("Volume of the cylinder : " + volume);
		sc.close();
	}

}
