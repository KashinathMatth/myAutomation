package com.sgtesting.inheritance;

class Demo1
{
	void display(String Studname)
	{
		System.out.println("Name of the student:"+Studname);	
	}
}
class Demo2 extends Demo1
{
	Demo2(String StudAddress)
	{
		super.display(StudAddress);
	}
	void display(String Studname)
	{
		System.out.println("Name of the student:"+Studname);	
	}
}
class Demo3 extends Demo2
{
	Demo3(String StudAddress1 ,String StudAddress2)
	{
		super (StudAddress1);
		super.display(StudAddress2);

	}
	void display(String Studname)
	{
		System.out.println("Name of the student:"+Studname);	
	}
}

public class MultiSameMethod {

	public static void main(String[] args) {
		Demo3 o=new Demo3("Banglore", "Bidar");
		o.display("kashinath");



	}

}
