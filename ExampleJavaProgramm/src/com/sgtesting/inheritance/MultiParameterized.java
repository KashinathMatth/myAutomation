package com.sgtesting.inheritance;
class Student1
{
	Student1(String FirstName,int age)
	{
		System.out.println("First Name Of the student:"+FirstName);
		System.out.println("Age of the student:"+age);
	}
}
class Student2 extends Student1
{
	Student2(String FirstName,int age)
	{
		super(FirstName,age);
	}
}
class Student3 extends Student2
{
	Student3(String FirstName,int age)
	{
		super(FirstName,age);
	}
}

public class MultiParameterized {

	public static void main(String[] args) {
		Student3 obj=new Student3("kashinath Matth",25);
	
	}

}
