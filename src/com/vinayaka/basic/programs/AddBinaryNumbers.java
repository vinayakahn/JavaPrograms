package com.vinayaka.basic.programs;

import java.util.Scanner;

public class AddBinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//two variables to hold two input binary numbers
		long b1,b2;
		int i=0,carry=0;
		
		//this is to hold the output binary number
		int[] sum=new int[10];
		
		//to read the input binary numbers entered by user
		Scanner sc = new Scanner(System.in);
		
		//getting first binary number entered by user
		System.out.println("Enter the first binary number: ");
		b1=sc.nextLong();
		
		//getting second binary number entered by user
		System.out.println("Enter the second binary number: ");
		b2=sc.nextLong();
		
		//closing Scanner after use to avoid memory leak
		sc.close();
		
		while(b1!=0 || b2!=0)
		{
			//for binary addition
			sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
			//to find carry
			carry = (int) ((b1 % 10 + b2 % 10 + carry) / 2);
			b1=b1/10;
			b2=b2/10;
			
		}
		if(carry != 0)
		{
			sum[i++] = carry;
		}
		--i;
		
		System.out.println("output: ");
		while(i>=0)
		{
			System.out.print(sum[i--]);
		}
		System.out.println("\n"); 

	}

}
