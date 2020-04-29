package com.vinayaka.general.concepts.programs;

public class Method_Overloading {
	public static void jump(int a,int b)
	{
		System.out.println("jump from building to building");
	}
	
	public static void jump(int a,int b,int c)
	{
		System.out.println("jump from tree to tree");
	}
	public static int jump(int a)
	{
		System.out.println("jump from floor to floor");
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jump(2,6);
		jump(4,8,5);
		jump(33);
		

	}

}
