package com.kashi.practice;
class student
{
	String name;
	student(String name)
	{
		System.out.println("The name of the student is :"+name);

	}
	student (String Cname,double marks)
	{
		this("sunil");
		System.out.println("The College name is :"+Cname);
		System.out.println("Total Marks Obtained :"+marks);
	}
	student ()
	{
		System.out.println("THis is no args constructotr");
	}
}


public class constChaining {

	public static void main(String[] args) {
		student s2=new student ("BKIT",9.2);
		student s3=new student();
		
		

	}

}
