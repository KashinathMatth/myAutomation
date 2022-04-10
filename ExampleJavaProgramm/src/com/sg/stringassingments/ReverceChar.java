package com.sg.stringassingments;

public class ReverceChar {
	static void wordCount(String s) {
		System.out.println("Given String :"+s);
		String sArray[]=s.split(" ");
		int count=0;
		for (String s1 : sArray)
		{
			count++;
		}
		System.out.println("Words Count:"+count);
	}

	public static void main(String[] args) {
		String s="Kiccha Sudeep is great legend in kannada";
		wordCount(s);
	}

}



