package com.vinayaka.basic.programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,rem,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check Palindrome number or not");
		int num= sc.nextInt();
		temp = num;
		while(num>0) {
			rem = num%10;//getting the remainder
			sum = (sum*10)+rem;
			num = num/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
