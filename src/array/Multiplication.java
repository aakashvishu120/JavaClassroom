package array;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] mutiplication = new int[11];
		for(int i =1 ; i <= 10 ; i++) {
			mutiplication[i] = number * i;
		}
		
		System.out.println("Multiplication of the Given Number");
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(number + " * " + i + " = " + mutiplication[i]);
		}
		sc.close();
	}

}
