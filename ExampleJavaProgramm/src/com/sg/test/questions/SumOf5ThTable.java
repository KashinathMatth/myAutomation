package com.sg.test.questions;
class Table
{
	int [] tablefour()
	{
		int a[]=new int [10];
		int temp=0;
		int k=0;
		for(int i=1; i<=10; i++)
		{
			temp=i*5;
			a[k]=temp;
			k++;
		}
		
		return a;
	}
}

public class SumOf5ThTable {

	public static void main(String[] args) {
		Table o=new Table();
		int a[]=o.tablefour();
		for(int m=0; m<a.length; m++)
		{
			System.out.println(a[m]);
		}

	}

}
