package com.sg.test.questions;


class Division1
{
	int [] divisible()
	{
		int count=0;
		for(int i=1; i<=100; i++)
		{
			if((i%3==0) && (i%9==0))
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


public class Sample1To100 {

	public static void main(String[] args) {
		Division1 obj=new Division1();
		int a[]=obj.divisible();
	    for(int k=1; k<a.length; k++)
	    {
		System.out.println(a[k]);
	    }
	}

}



