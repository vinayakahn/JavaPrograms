package com.vinayaka.string.programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check Palindrome or not");
		String str = sc.next();
		str = str.toLowerCase();
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-i-1))
			{
				flag=false;	
				break;
			}
		}
		if(flag) 
			System.out.println("Given string is Palindrome");
		else
			System.out.println("It is not a Palindrome");

	}

}
