package com.sg.stringassingments;

public class DayString {
	private static void DAYCount(String s) {
		System.out.println(s);
		String sArray[]=s.split("DAY");
		int count=0;
		for(String s1:sArray) 
		{
			count++;
		}
		System.out.println(count);
	}

	private static void removeDAYWithoutUsingRemoveM(String s) {
		String sArray[]=s.split("DAY");
		System.out.println(s);
		String resString="";
		for(String s1:sArray) 
		{
			resString=resString+s1;
		}
		System.out.println("After removing each occurance of \"DAY\":");
		System.out.println(resString);

	}
	private static void replaceDAYWithCommaWURemoveM(String s) {
		String sArray[]=s.split("DAY");
		System.out.println(s);
		String resString="";
		for(String s1:sArray)
		{
			resString=resString+s1+",";
		}
		System.out.println("After replacing all occurances of \"DAY\" with \",\":");
		System.out.println(resString);

	}

	public static void main(String[] args) {
		String s="SUNDAYMONDAYTUESDAYWENSDAYTHURSDAYFRIDAYSATURDAY";
		DAYCount(s);
		System.out.println("------------------------------------");
		removeDAYWithoutUsingRemoveM(s);
		System.out.println("------------------------------------");
		replaceDAYWithCommaWURemoveM(s);
	}
}
