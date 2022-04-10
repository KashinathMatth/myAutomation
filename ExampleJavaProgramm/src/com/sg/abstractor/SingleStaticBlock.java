package com.sg.abstractor;
abstract class Student
{
	static String name="SG Testing";
	static
	{
		System.out.println("Student name is : "+ name);
	}

}
class Stud extends Student
{
	
	
}

public class SingleStaticBlock {

	public static void main(String[] args) {
		Stud s=new Stud();


	}

}
