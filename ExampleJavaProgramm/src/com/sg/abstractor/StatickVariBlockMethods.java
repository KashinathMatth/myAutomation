package com.sg.abstractor;
abstract class CollegeDemo
{
	static int noofstudents=987;
	static String name;
	static String num;

	static void pname()
	{
		System.out.println("The name of the college principle : "+ name);
		System.out.println("the no of students in the institute"+noofstudents);
	}
	static void showRollnum()
	{
		System.out.println("Roll number series : "+ num );
	}
	static
	{
		num="3rb16me411";
		showRollnum();
		name="Prabhakar Gudi";
		CollegeDemo.pname();
	}

}

public class StatickVariBlockMethods {

	public static void main(String[] args) {
		CollegeDemo.name="SG institute";
		System.out.println("in main method pname is : " + CollegeDemo.name);

	}

}
