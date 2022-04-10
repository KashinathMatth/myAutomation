package com.sgtesting.returnmethods;
class Multiplication
{
	int multi ()
	{
		int total=1;
		for(int i=0;i<=10;i++)
		{
			total=total*i;
		}
		return total;
	}
}

public class Ex2Multi {

	public static void main(String[] args) {
		Multiplication o1=new Multiplication();
		int a=o1.multi();
		System.out.println(a);


	}

}
