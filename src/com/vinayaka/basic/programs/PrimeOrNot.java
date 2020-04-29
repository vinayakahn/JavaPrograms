package com.vinayaka.basic.programs;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;
		boolean flag=false;
		for(int i=2;i<=num/2;++i)
		{
			if(num%2==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println(+num+" is Prime Number");
		else
			System.out.println(+num+" is not a Prime number");

	}

}
