package com.sgtesting.returnmethods;
class Division
{
	int [] divisible()
	{
		int count=0;
		for(int i=1; i<=100; i++)
		{
			if(i%10==0)
			{
				count++;	
			}
		}
		int a[]=new int[count];
		int j=0;
		for (int i=1; i<=100; i++)
		{
			if (i%10==0)
			{
				a[j]=i;
				j++;
			}
		}
		return a;		
	}
}

public class ExDivisible10 {

	public static void main(String[] args) {
		Division obj=new Division();
		int a[]=obj.divisible();
	    for(int k=1; k<a.length; k++)
	    {
		System.out.println(a[k]);
	    }
	}

}
