package com.sgtesting.returnmethods;
class Add
{
	int[][] Addition(int a[][],int b[][])
	{
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<a[i].length;k++)
			{
				c[i][k]=a[i][k]+b[i][k];

			}
		}

		return c;


	}
}

public class TwoDAdditonMatrix {

	public static void main(String[] args) {

		Add obj=new Add();
		int a[][]= {{1,2,3,4,5},{2,3,4,5,6}};
		int b[][]= {{2,3,5,4,6},{2,3,5,4,6}};
		int d[][]=obj.Addition(a, b);

		for(int k[]:d)
		{
			for(int c:k)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}


	}

}



