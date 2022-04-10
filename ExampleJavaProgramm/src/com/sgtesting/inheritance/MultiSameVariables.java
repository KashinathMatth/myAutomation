package com.sgtesting.inheritance;
class Test1
{
	String softwareName;
	void show()
	{
		System.out.println("The Softwares are:"+softwareName);
	}
}
class Test2 extends Test1
{
	String softwarename;
	Test2 (String software1, String Software2)
	{
		super.softwareName=software1;
		softwarename=Software2;
		
	}
	void display()
	{
		System.out.println(softwarename);
	}
}
class Test3 extends Test2
{
	String softwarename;
	Test3 (String software1, String software2, String software3)
	{
		super(software1,software2);
		softwarename=software3;
	}
	void display1()
	{
		System.out.println(softwarename);
	}
}

public class MultiSameVariables {

	public static void main(String[] args) {
		Test3 obj=new Test3("Hp","Microsoft","Oracle");
		obj.show();
		obj.display();
		obj.display1();

	}

}
