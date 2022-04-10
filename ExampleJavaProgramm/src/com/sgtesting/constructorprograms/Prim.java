package com.sgtesting.constructorprograms;
class Prnum
{
	Prnum(int a)
	{
		if ((a%2!=0) && (a%3!=0))
		{
			System.out.println("The givven num is prime");
		}
		else
		{
			System.out.println("The giveen num is not prime");
		}
	}
}




public class Prim {

	public static void main(String[] args) {
		Prnum obj1= new Prnum(5);
        Prnum obj2= new Prnum(12);
	}

}
