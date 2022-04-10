package com.sgtesting.programs;

public class AddRever {

	public static void main(String[] args) 
	{
		int a[][]= {{1,5,8},{5,7,9}};
		int b[][]= {{5,8,9},{7,9,4}};
		int c[][]= new int[3][3];
		for (int i=a.length-1; i>=0; i--)
		{
			for (int j=a[i].length-1; j>=0; j--)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
