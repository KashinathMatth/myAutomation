package com.sg.test.questions;
class Maggi
{
	int[] tableeights()
	{
		int a[]=new int[10];
		int temp=0;
		int k=0;
		for(int i=1;i<=10;i++)
		{
			temp=i*4;
			a[k]=temp;
			k++;
		}

		return a;
	}
}


public class Tabu4Th {

	public static void main(String[] args) {
		Maggi o=new Maggi();
		int a[]=o.tableeights();
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}

	}

}



