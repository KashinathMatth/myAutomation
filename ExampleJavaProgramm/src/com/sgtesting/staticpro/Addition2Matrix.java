package com.sgtesting.staticpro;

import javax.print.attribute.ResolutionSyntax;

class AdditionMatrix
{
	static int[][] addition(int a[][], int b[][])
	{
		int c[][]=new int[a.length][a[0].length];
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
}

public class Addition2Matrix {

	public static void main(String[] args) {
		int a[][]= {{1,2},{4,5}};
		int b[][]= {{8,7},{6,2}};
		int res[][]=AdditionMatrix.addition(a,b);
		for(int l=0; l<res.length; l++)
		{
			for(int k=0; k<res[l].length; k++)
			{
				System.out.print(res[l][k]+"   ");
			}
			System.out.println();
		}


	}

}
