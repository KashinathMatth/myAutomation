package com.sgtesting.methods;
class Matrix
{
	void Addition(int a[][], int b[][])
	{
		int res;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				res=a[i][j]+b[i][j];
				System.out.print(res+"  ");
			}
			System.out.println();
		}
	}
}

public class Exersise1 {

	public static void main(String[] args) {
		Matrix o1=new Matrix();
		int m[][]= {{14,54,84},{87,12,03}};
		int k[][]= {{14,25,7},{5,05,42}};
		o1.Addition(m, k);
		int x[][]= {{1,5,7},{8,7,2}};
		int y[][]= {{7,0,2},{8,2,6}};
		o1.Addition(x,y);
	}

}
