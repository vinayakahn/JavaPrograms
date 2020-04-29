package com.vinayaka.basic.programs;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int c=0,a,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check Armstrong number or not: ");
		int num = sc.nextInt();
		temp = num;
		while(num>0)
		{
			a=num%10;//on each iteration last digit of num is stored in a
			num=num/10;//last digit is removed from num after division by 10
			c=c+(a*a*a);
		}
		if(temp==c) {
			System.out.println(temp+" this number is Armstrong number");
		}
		else
		{
			System.out.println(temp+" not a Armstrong number");
		}
	}

}
