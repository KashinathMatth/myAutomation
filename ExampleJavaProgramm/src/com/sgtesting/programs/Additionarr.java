package com.sgtesting.programs;

public class Additionarr {

	public static void main(String[] args) {
		int a[][]= {{2,4,6},{8,7,9}};
		int b[][]= {{3,5,8},{2,4,3}};
		int c[][]= new int[3][3];
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				c [i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}


	}

}


