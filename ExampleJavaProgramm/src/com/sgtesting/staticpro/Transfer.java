package com.sgtesting.staticpro;
class Transu
{
	static int[][] getTranspose(int a[][])
	{
		int c[][]=new int [a.length][a[0].length];
		for (int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				c[j][i]=a[i][j]; 
			}
		}
		return c;
	}
}

public class Transfer {

	public static void main(String[] args) {
		int a[][]= {{1,2},{5,6}};
		int[][] val=Transu.getTranspose(a);
		for(int l=0; l<val.length; l++)
		{
			for(int k=0; k<val[l].length; k++)
			{
				System.out.print(val[l][k]+"  ");
			}
			System.out.println();
		}
		
		

	}

}
