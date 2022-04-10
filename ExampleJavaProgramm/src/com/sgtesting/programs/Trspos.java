package com.sgtesting.programs;

public class Trspos {

	public static void main(String[] args) 
	{
		int a[][]= {{1,4,},{8,7,}};
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				System.out.print(a[j][i]+"   ");
			}
			System.out.println();
		}

	}
}
