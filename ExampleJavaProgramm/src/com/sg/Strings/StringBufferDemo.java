package com.sg.Strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		appendDemo();
		insertDemo();
		deleteDemo();
		reverseStr();
	}

	private static void appendDemo()
	{
		StringBuffer s=new StringBuffer("Java");
		System.out.println(s);
		s.append(" Programming");
		System.out.println(s);
		System.out.println("++++++++++++++++++++");
	}

	private static void insertDemo()
	{
		StringBuffer s=new StringBuffer("It is a palace");
		StringBuffer s1=s.insert(8, "new ");
		System.out.println(s1);
		System.out.println("++++++++++++++++++++");	
	}

	private static void deleteDemo()
	{
		StringBuffer s=new StringBuffer("It is a new palace");
		StringBuffer s1=s.delete(8, 12);
		System.out.println(s1);
		System.out.println("++++++++++++++++++++");	
	}

	private static void reverseStr()
	{
		StringBuffer s=new StringBuffer("Programming");
		StringBuffer s1=s.reverse();
		System.out.println(s1);
		System.out.println("++++++++++++++++++++");	
	}

}


