package com.vinayaka.general.concepts.programs;

public class RunAbstract extends AbstractClassEx{
	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("I am jumping......");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunAbstract r1=new RunAbstract();
		r1.jump();
	}

}
