package com.sgtesting.staticpro;
class SumDigits
{
	static int getSumDigits(int total)
	{
		int sum=0;
		while(total>0)
		{
			sum=sum+(total%10);
			{
				total=total/10;
			}
		}
		return sum;
	}
}

public class SumOfDigits {

	public static void main(String[] args) {
		int total=1234567;
		int sumDigits=SumDigits.getSumDigits(total);
		System.out.println("sum of the digits is"+total+   sumDigits);


	}

}
