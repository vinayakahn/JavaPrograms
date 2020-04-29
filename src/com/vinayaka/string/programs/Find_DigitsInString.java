package com.vinayaka.string.programs;

public class Find_DigitsInString {
	
	public static void findDigits() {
		String s="123423vi66nu45678";
		int count=0;
		for(int i=0,len=s.length();i<len;i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				count++;
			}
		}
		System.out.println("The number of digits in the string are: "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDigits();
	}

}
