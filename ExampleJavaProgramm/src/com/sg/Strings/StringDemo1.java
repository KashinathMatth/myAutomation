package com.sg.Strings;

public class StringDemo1 {

	public static void main(String[] args) {
		getStrLength();
		isEmptyString();
		getCharacter();
		extraactString();
		existanceOfString();
		replaceDemo();
		compareString1();
		compareString2();
		getCharsFromString();
		splitDemo();
		convertToString();
		getPositionResult();
		trimDemo();
	}

	private static void getStrLength()
	{
		String s="Program";
		int v1=s.length();
		System.out.println("# of Chars :"+v1);
		System.out.println("+++++++++++++");
	}

	private static void isEmptyString()
	{
		String s="";
		boolean v1=s.isEmpty();
		System.out.println("The String is Empty ?:"+v1);
		System.out.println("+++++++++++++");
	}

	private static void getCharacter()
	{
		String s="JAVA";
		char ch=s.charAt(2);
		System.out.println("Character :"+ch);
		System.out.println("+++++++++++++");
	}

	private static void lowerCase()
	{
		String s="JAVA";
		System.out.println("Lower Case :"+s.toLowerCase());
		System.out.println("+++++++++++++");
	}

	private static void upperCase()
	{
		String s="java";
		System.out.println("Upper Case :"+s.toUpperCase());
		System.out.println("+++++++++++++");
	}

	private static void extraactString()
	{
		String s="Programming";
		System.out.println("From Specific Position:"+s.substring(3));
		System.out.println("From Range :"+s.substring(3,7));
		System.out.println("+++++++++++++");
	}

	private static void existanceOfString()
	{
		String s="It is a new palace";
		System.out.println("Starts With:"+s.startsWith("It"));
		System.out.println("Ends With :"+s.endsWith("palace"));
		System.out.println("Contains :"+s.contains("new"));
		System.out.println("+++++++++++++");
	}

	private static void replaceDemo()
	{
		String s="It is a palace";
		System.out.println("Replaced String :"+s.replace("is", "was"));
		System.out.println("+++++++++++++");
	}

	private static void compareString1()
	{
		String s="JavaScript";
		String s1="JAVASCRIPT";
		System.out.println("s.equals(s1) :"+s.equals(s1));
		System.out.println("s.equalsIgnoreCase(s1) :"+s.equalsIgnoreCase(s1));
		System.out.println("+++++++++++++");
	}

	private static void compareString2()
	{
		String s="JavaScript";
		String s1="JAVASCRIPT";
		System.out.println("s.comapreTo(s1) :"+s.compareTo(s1));
		System.out.println("s.compareToIgnoreCase(s1) :"+s.compareToIgnoreCase(s1));
		System.out.println("+++++++++++++");
	}

	private static void getCharsFromString()
	{
		String s="Programming";
		char ch[]=s.toCharArray();
		for(char ch1:ch)
		{
			System.out.println(ch1);
		}
		System.out.println("+++++++++++++");
	}

	private static void splitDemo()
	{
		String s="Apple,Mango,Banana,Orange";
		String s1[]=s.split(",");
		for(String s2:s1)
		{
			System.out.println(s2);
		}
		System.out.println("+++++++++++++");
	}

	private static void convertToString()
	{
		int a=125;
		String s1=String.valueOf(a);
		System.out.println(s1);

		double d=12.75;
		String s2=String.valueOf(d);
		System.out.println(s2);

		boolean b=true;
		String s3=String.valueOf(b);
		System.out.println(s3);
		System.out.println("+++++++++++++");
	}

	private static void getPositionResult()
	{
		String s="xxaxxaxxaXXAXXA";
		int pos1=s.indexOf('A');
		System.out.println(pos1);
		int pos2=s.lastIndexOf('A');
		System.out.println(pos2);
		System.out.println("+++++++++++++");
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



