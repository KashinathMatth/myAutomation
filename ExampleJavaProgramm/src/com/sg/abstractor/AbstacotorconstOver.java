package com.sg.abstractor;
abstract class Colleges
{
	Colleges(String gname)
	{
		System.out.println("Actress name : " +gname);
	}
	Colleges(int age)
	{
		System.out.println("Age : "+age);
	}
	abstract void bname(String bname1);
}
class Col extends Colleges
{
	Col(String gname1)
	{
		super(gname1);
	}
	Col(int age1)
	{
		super(age1);
	}
	void bname(String bname1)
	{
		System.out.println("Actor Name : "+bname1);
	}
}

public class AbstacotorconstOver {

	public static void main(String[] args) {
		Col c=new Col("Ashika,Aditi,");
		Col c1=new Col(23);
		c.bname("Sudeep");
		
	}

}
