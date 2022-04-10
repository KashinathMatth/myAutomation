package com.sg.stringassingments;

public class WithoudUsingRevr {
	private static void charAtDemo(String s){
		System.out.println("Given string:"+s);
		String s1=new String();
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		System.out.println("Reversed String using charAt() is :" +s1);
	} 

	private static void toCharArrayDemo(String s2){
		System.out.println("Given string:"+s2);
		String s3="";
		char[] ch=s2.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			s3=s3+ch[i];
		}

		System.out.println("reversed String using toCharArray() is :" +s3);
	}

	private static void subStringDemo(String s4) {
		System.out.println("Given string:"+s4);
		String s5="";
		for(int i=s4.length()-1;i>=0;i--) {
			if(i!=0) {
				s5=s5+s4.substring(i-1, i);
			}else {
				s5=s4.charAt(s4.length()-1)+s5;
			}
		}
		System.out.println("Reversed String using substring() is :" +s5);

	}
	public static void main(String[] args) {
		String s="Kiccha";
		charAtDemo(s);
		System.out.println("--------------------");
		String s2="Sudeep";
		toCharArrayDemo(s2);
		System.out.println("--------------------");
		String s4="Sunil";
		subStringDemo(s4);

	}
}
