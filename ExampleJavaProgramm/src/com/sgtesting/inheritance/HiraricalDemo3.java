package com.sgtesting.inheritance;
class Movies1
{
	void name(String moviename)
	{
		System.out.println("The latest movis released" +moviename);
	}
}
class Movies2 extends Movies1
{
	void boxoffice(int x)
	{
		System.out.println("The Grabd collection is" +x);
	}
}
class Movies3 extends Movies1
{
	void actorNames(String listOfNames)
	{
		System.out.println("The list of name is" +listOfNames);
	}
}


public class HiraricalDemo3 {

	public static void main(String[] args) {
		Movies2 o1=new Movies2();
		o1.name("Kotigobba3");
		o1.boxoffice(10000000);
		
		
		Movies3 o2=new Movies3();
		o2.actorNames("Kiccha Sudeep, Modenna, Ravishankar");
		o2.name("Kotigobba");
		

	}

}
