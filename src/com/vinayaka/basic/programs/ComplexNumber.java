package com.vinayaka.basic.programs;

public class ComplexNumber {
	// for real and imaginary parts of complex numbers
	double real, img;

	// constructor to initialize the complex number
	public ComplexNumber(double r, double i) {
		// TODO Auto-generated constructor stub
		this.real = r;
		this.img = i;

	}

	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
		// creating a temporary complex number to hold the sum of two numbers
		ComplexNumber temp = new ComplexNumber(0, 0);
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;

		// returning the output complex number
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber c1 = new ComplexNumber(5.5, 4);
		ComplexNumber c2 = new ComplexNumber(1.2, 3.5);
		ComplexNumber temp = sum(c1, c2);
		System.out.println("Sum is: " + temp.real + "+" + temp.img + "i");

	}

}
