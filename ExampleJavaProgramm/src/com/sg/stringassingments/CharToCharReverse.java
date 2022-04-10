package com.sg.stringassingments;

public class CharToCharReverse {
	private static void reverse(String s) {
		System.out.println(s);
		String sArray[]=s.split(" ");
		String revString="";
		for(int i=0;i<sArray.length;i++)
		{
			StringBuffer sb=new StringBuffer(sArray[i]);
			sb.reverse();
			revString=revString+" "+new String(sb);
		}
		System.out.println("Result:");
		System.out.println(revString);
	}

	public static void main(String[] args) {
		String s="The temple is at the top of the hill";
		reverse(s);
	}

}


