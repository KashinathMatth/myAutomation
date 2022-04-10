package com.sgtesting.staticpro;
class Reversed
{
	static int getreverse()
	{
		int count=0;
		for(int i=10; i>=1; i--)
		{
			count++;
		}
		return count;
	}
}

public class ReverseOrder {

	public static void main(String[] args) {
		int val=Reversed.getreverse();
		System.out.println(val);
		

	}

}
