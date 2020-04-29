package com.vinayaka.general.concepts.programs;

public class General {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArithmaticException
		int a = 50 / 0;
		System.out.println("the number is " + a);

		// NullPointerException

		String s = null;
		System.out.println("lenth of the string is: " + s.length());

		// NumberFormatException
		String s1 = "abcd";
		int i = Integer.parseInt(s1);
		System.out.println("The Number is :" + i);
		
		
		//ArrayIndexOutOfBoundException
		int ar[] = new int[5];
		ar[10]=30;
		System.out.println("Array IndexOutOfBoundException : "+ar);

	}

}
