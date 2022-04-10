package com.kashi.practice;
abstract class QaTeam
{
	abstract void projectName(String name);
	abstract void teamMembers(int size);
	void displayNames(String tnames)
	{
	 System.out.println("prbhu chutya");
	}
}
class dev extends QaTeam
{
	void projectName(String name)
	{
		System.out.println("The name of the pro is :"+name);
	}
	void teamMembers(int size)
	{
		System.out.println("Numbers of members are :"+size);
	}
	void displayNames(String tnames)
	{
	   System.out.println("All names are :"+tnames);
	}
}

public class abstraction2 {

	public static void main(String[] args) {
		dev d1=new dev();
		d1.projectName("Hospital Domain");
		d1.teamMembers(5);
		d1.displayNames("k,s,i");
		
	

	}

}

