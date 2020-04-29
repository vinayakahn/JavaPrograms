package com.vinayaka.general.concepts.programs;

public class NestedTryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			System.out.println("This is the example of Nested try block");

			try {
				int a = 10 / 0;
				System.out.println("Output is: " + a);

			} catch (ArrayIndexOutOfBoundsException ae) {
				System.out.println("This is Array index out of bound exception example");
			} catch (ArithmeticException are) {
				System.out.println("Arithmatic Exception");
			}

		} finally {
			System.out.println("This block will executes always");
		}

	}
}
