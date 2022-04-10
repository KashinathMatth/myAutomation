package com.sg.Strings;

public class StringsDemo {

	public static void main(String[] args) {
		String s="Java";
		String s1="java";
		String s2="Java";
		String s3="java";

		String s4=new String("Java");
		String s5=new String("Java");
		String s6=new String("java");

		System.out.println("(s==s1) :"+(s==s1));
		System.out.println("(s==s2) :"+(s==s2));
		System.out.println("(s==s4) :"+(s==s4));
		System.out.println("(s.equals(s4)) :"+(s.equals(s4)));
		System.out.println("(s2==s5) :"+(s2==s5));
		System.out.println("(s4==s5) :"+(s4==s5));
		System.out.println("(s4.equals(s5)) :"+(s4.equals(s5)));

	}

}
