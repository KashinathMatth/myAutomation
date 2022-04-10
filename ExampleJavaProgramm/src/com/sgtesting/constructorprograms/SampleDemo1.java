package com.sgtesting.constructorprograms;
class Fact
{
	Fact(int a)
	{
		int fact=1;
		for(int i=a;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial is:"+fact);
	}

}


public class SampleDemo1 {

	public static void main(String[] args) {
		Fact o=new Fact(5);
		Fact o2=new Fact(6);
		



	}

}
