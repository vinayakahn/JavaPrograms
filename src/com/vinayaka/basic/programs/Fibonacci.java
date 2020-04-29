package com.vinayaka.basic.programs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, t1=0,t2=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num = sc.nextInt();
		for(int i=1;i<=num;++i)
		{
			System.out.println(t1 + " ");
			
			int sum = t1+t2;
			t1=t2;
			t2=sum;
		}
		
		
	}

}
