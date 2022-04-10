package com.sg.test.questions;
class Division
{
	int [] divisibl()
	{
		int count=0;
		for(int i=100; i<=200; i++)
		{
			if(i%7==0)
			{
				count++;
			}
		}
		int a[]=new int[count];
		int k=0;
		for(int j=100; j<=200; j++)
		{
			if(j%7==0)
			{
				a[k]=j;
				k++;

			}
		}
		return a;
	}
}


public class Count100To200Divi7 {

	public static void main(String[] args) {
		Division obj=new Division();
		int a[]=obj.divisibl();
		for (int m=0; m<a.length; m++)
		{
			System.out.println(a[m]);
		}

	}

}
