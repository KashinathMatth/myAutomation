package com.sgtesting.programs;

public class SubRever1 {

	public static void main(String[] args) 
	{
		int a[][]= {{4,6,9},{9,7,8}};
		int b[][]= {{2,3,1},{5,3,4}};
		int c[][]= new int [3][3];
		for (int i=a.length-1; i>=0; i--)
		{
			for (int j=a[i].length-1;j>=0; j--)
			{
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}

	}
}
