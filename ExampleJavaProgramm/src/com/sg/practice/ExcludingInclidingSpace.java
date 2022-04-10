package com.sg.practice;

public class ExcludingInclidingSpace {
	public static void main(String[] args) {
		trimDemo();
	}

	private static void trimDemo()
	{
		String s="   Java    ";
		System.out.println("The String is :"+s+ "and its length :"+s.length());
		String s1=s.trim();
		System.out.println("The String is :"+s1+ "and its length :"+s1.length());
		System.out.println("+++++++++++++");
	}


}


