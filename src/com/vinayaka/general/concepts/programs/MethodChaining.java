package com.vinayaka.general.concepts.programs;

public class MethodChaining {
	public MethodChaining run()
	{
		System.out.println("Start Running");
		return this;
	}
	public MethodChaining swim()
	{
		System.out.println("start Swimming");
		return this;
	}
	public MethodChaining jump()
	{
		System.out.println("Started jumping");
		return this;
	}
	
	public static void main(String[] args) {
		/*method Chaining*/
		MethodChaining mc=new MethodChaining();
		mc.run().swim().jump();
	}

}
