package com.sg.test.questions;
class Kiccha
{
	int []  sudeep ()
	{
		int count=0;
		for(int i=1; i<=30; i++)
		{
			if(i%3==0)
			{
				count++;
			}
		}
		int a[]=new int[count];
		int k=0;
		for(int j=1; j<=30; j++)
		{
			if(j%3==0)
			{
				a[k]=j;
				k++;
			}
		}
		return a;
	}
}



public class Num1To30Div3 {
	public static void main(String[] args) {
		Kiccha obj=new Kiccha ();
		int a [] = obj.sudeep();
		for(int m=0; m<a.length; m++)
		{
			System.out.println(a[m]);
		}

	}
}

