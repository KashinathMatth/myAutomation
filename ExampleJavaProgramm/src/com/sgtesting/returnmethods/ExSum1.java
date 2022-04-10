package com.sgtesting.returnmethods;
class Sum
{
	int getsum ()
	{
		int count=0;
		for(int i=0; i<=10; i++)
		{
			count=count+i;
		}

		return count;
	}

}


public class ExSum1 {

	public static void main(String[] args) {
		Sum o=new Sum();
		int a=o.getsum();
		System.out.println(a);


	}

}
