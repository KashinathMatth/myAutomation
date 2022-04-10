package com.sg.polymorophisum;
abstract class Country
{
	abstract void place ();
}
class Swizerland extends Country
{
	void place()
	{
		String s;
		s="SP Road";
		System.out.println("One of best place :"+s);
	}
}
class India extends Country
{
	void place()
	{
		String k;
		k="Sanatana Dharma";
		System.out.println("One Of the Great history is :"+k);
	}
}
class America extends Country
{
	void place()
	{
		String m;
		m="Sofware hub";
		System.out.println("One of the richest country and main :"+m);
	}
}

public class Assin3 {

	public static void main(String[] args) {
		Country c=null;

		Swizerland s=new Swizerland();
		India i=new India();
		America a=new America();

		c=s;
		c.place();

		c=i;
		c.place();

		c=a;
		c.place();


	}

}
