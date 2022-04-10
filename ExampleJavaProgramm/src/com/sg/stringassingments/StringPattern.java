package com.sg.stringassingments;

public class StringPattern {
	private static void patterDesign1() {
		String s="PROGRAMS";
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(j<=i) 
				{
					System.out.print(s.charAt(j)+" ");
				}
			}
			System.out.println();
		}
	}
	private static void patterDesign2() {
		String s="PROGRAM";
		for(int i=s.length();i>=0;i--) {
			for(int j=0;j<s.length();j++) {
				if(j<=i) 
				{
					System.out.print(s.charAt(j)+" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		patterDesign1();
		System.out.println("------------------");
		patterDesign2();
	}
}

