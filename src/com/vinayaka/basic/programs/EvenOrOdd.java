package com.vinayaka.basic.programs;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number to check whether the number is Even or Odd: ");
		int number = sc.nextInt();
		if(number%2==0)
		{
			System.out.println("The Number " +number+ " is EVEN");
		}
		else
		{
			System.out.println("The Number " +number+ " is ODD");
		}

	}

}
