package com.sgtesting.inheritance;
class Mechanical1
{
	void manufacturing(String operation)
	{
		System.out.println("The Operation held on"+operation);
	}
}
class Mechanical2 extends Mechanical1
{
	void inspection(String checking)
	{
		System.out.println("the products are going to be inspected"+checking);
	}
}
class Mechanical3 extends Mechanical2
{
	void desing(String catia)
	{
		System.out.println("the product is desined by"+catia);
	}
}

public class MultilevelDemo1 {

	public static void main(String[] args) {
		Mechanical3 o=new Mechanical3();
		o.manufacturing("turning");
		o.desing("catia");
		o.inspection("by vernier caliper");
	}

}
