package com.sg.stringassingments;

public class NoOfCharLenth {
	static void findLength(String s) {
		char ch[]=s.toCharArray();
		int length=0;
		for (char c : ch) {
			length++;
		}
		System.out.println("String length :"+length);
	}

	public static void main(String[] args) {
		findLength("My Name Is Gayatri");

	}

}



