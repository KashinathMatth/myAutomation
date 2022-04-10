package com.sgtesting.returnmethods;

class Table
{
	int[] tableeight()
	{
	int a[]=new int[10];
	 int temp=0;
	 int k=0;
		for(int i=1;i<=10;i++)
		{
			temp=i*8;
			a[k]=temp;
			k++;
		}
		
		return a;
	}
}

public class Table8 {

	public static void main(String[] args) {
      
	Table o=new Table();
	int a[]=o.tableeight();
	for(int i=0; i<a.length; i++)
	{
		System.out.println(a[i]);
	}
	
	
	}

}
