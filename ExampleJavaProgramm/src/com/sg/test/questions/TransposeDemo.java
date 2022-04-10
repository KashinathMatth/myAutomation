package com.sg.test.questions;
class Transpose1
{
	int[][] trans(int a[][])
	{
		int b[][]=new int[3][2];
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<2;j++)
			{
				b[i][j]=a[j][i];

            }
		}
		return b;
	}

}
public class TransposeDemo 
{
	public static void main(String[] args) 
	{
		Transpose1 o=new Transpose1();
		int c[][]= {{1,2,3},{4,5,6}};
		int k[][]=o.trans(c);
		for(int i=0;i<k.length;i++)
		{
			for(int j=0;j<k[i].length;j++)
			{
				System.out.print(k[i][j]+" ");
			}

			System.out.println();

         }

	}
}



