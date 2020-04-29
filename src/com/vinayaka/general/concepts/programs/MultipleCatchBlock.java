package com.vinayaka.general.concepts.programs;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;

		} catch (ArithmeticException ae) {
			System.out.println("Arithmatic Exception");
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("Array Index Out Of Bound Exception");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}

		finally {
			System.out.println("The Finally Block executes always");
		}

	}

}
