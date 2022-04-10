package com.sg.abstractor;
abstract class City
{
	abstract void cityname(String name);
	abstract void clgname(String companyname);
}
abstract class ColName extends City
{
	void cityname(String name)
	{
		System.out.println("Country : "+ name);
	}
}
class ColAddress extends ColName
{
	void clgname(String companyname)
	{
		System.out.println("companyname : "+ companyname);
	}
}

public class MultilevelAbstractor {

	public static void main(String[] args) {
		ColAddress c=new ColAddress();
		c.cityname("Newzland");
		c.clgname("Hp world");
		

	}

}
