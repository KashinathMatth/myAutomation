package com.sg.practice;

public class ReplaceDemo {

	public static void main(String[] args) {
		//replaceDemo();
		//getCharsFromString();
		//displaychar();
		//existanceOfString();
		compareString1();
	}
	private static void replaceDemo()
	{
		String s="It is a Kashinath";
		System.out.println("Replaced String :"+s.replace("is", "was"));

	}
	private static void getCharsFromString()
	{
		String s="PRABHAKAR";
		char ch[]=s.toCharArray();
		for(char ch1:ch)
		{
			System.out.println(ch1);
		}
	}
		
		private static void displaychar()
		{
			String s="SG Institute";
			for(int i=0; i<s.length(); i++)
			{
				System.out.println(s.charAt(i));
			}
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		}
		private static void existanceOfString()
		{
			String s="That is a old but Village";
			System.out.println("Starts With:"+s.startsWith("That"));
			System.out.println("Ends With :"+s.endsWith("Village"));
			System.out.println("Contains :"+s.contains("old"));
			System.out.println("Contains :"+s.contains("but"));
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		}
		private static void compareString1()
		{
			String s="kiccha";
			String s1="SUDEEP";
			System.out.println("s.equals(s1) :"+s.equals(s1));
			System.out.println("s.equalsIgnoreCase(s1) :"+s.equalsIgnoreCase(s1));
			System.out.println("##############################");
		}
	}


