package com.sgtesting.programs;

public class PrimeOrNot {

	public static void main(String[] args) 
	{
		int a=8;
		int count=0;
		for (int i=1; i<=a; i++)
		{
			if (a%i==0);
			{
				count++;
			}
		}
		if (count>2)
		{
			System.out.println("num is not prime");
		}
		else 
		{
			System.out.println("num is prime");
		}
	}
}

