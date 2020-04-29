package com.vinayaka.general.concepts.programs;

public class Implementation implements Interface_implementation {

	@Override
	public Implementation jump() {
		// TODO Auto-generated method stub
		System.out.println("I am jumping from building to building");
		return this;
	}

	@Override
	public Implementation swim() {
		// TODO Auto-generated method stub
		System.out.println("I am Swimming");
		return this;

	}

	@Override
	public Implementation run() {
		// TODO Auto-generated method stub
		System.out.println("I am Running");
		return this;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementation impl = new Implementation();
		impl.jump().swim().run();

	}

}
