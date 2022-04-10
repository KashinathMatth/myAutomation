package com.sg.stringassingments;

public class ReverseStringReplaceMethod {

	static void replaceWords(String s) {
		System.out.println("Given string is :"+s);
		s=s.replace("Mysore", "Bangalore");
		s=s.replaceFirst("Bangalore", "Mysore");
		System.out.println("String after reversing words :"+s);
	}
	public static void main(String[] args) {
		replaceWords("Bangalore and Mysore");

	}

}


