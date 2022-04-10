package com.sgtesting.returnmethods;
class Prime
{
	boolean prime(int num)
	{


		if((num%2!=0)&&(num%3!=0))
		{

			return true;
		}


		else
		{
			return false;
		}
	}
}


public class PrimeOrNot {

	public static void main(String[] args) {
		Prime ob=new Prime();
		boolean a=ob.prime(8);

		System.out.println(a);

	}

}
