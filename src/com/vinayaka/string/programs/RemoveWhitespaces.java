package com.vinayaka.string.programs;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="my name is Vinayaka";
		String w="I am living for my best friend";
		String space = s.replaceAll(" ", "");
		String word=w.replaceAll("\\s+", "");
		System.out.println("After removing the white spaces from the string: "+space);
		System.out.println("After removing the second String white spaces: "+word);
		
	}

}
