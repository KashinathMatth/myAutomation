package com.sgtesting.returnmethods;
class Even1
{
	int[] even()
	{
		int count=0;
		for(int i=80;i<=100;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}

		int a[]=new int[count];
		int k=0;
		for(int j=80;j<=100;j++)
		{
			if(j%2==0)
			{
				a[k]=j;
				k++;
			}
		}
		return a;

	}
}


public class Even80To100 {

	public static void main(String[] args) {

		Even1 ob=new Even1();
		int a[]=ob.even();
		for(int b:a)
		{
			System.out.println(b);
		}


	}

}



