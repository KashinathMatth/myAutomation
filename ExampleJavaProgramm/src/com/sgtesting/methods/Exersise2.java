package com.sgtesting.methods;
class Matrix2
{
	void Substraction(int a[][],int b[][])
	{
		int res;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				res=a[i][j]-b[i][j];
				System.out.print(res+"  ");
			}
			System.out.println();
		}
	}
}

public class Exersise2 {

	public static void main(String[] args) {
		Matrix2 o=new Matrix2();
		int f[][]= {{5,8,9},{7,5,3}};
		int e[][]= {{7,4,1},{9,6,3}};
		o.Substraction(f, e);
		
		

	}

}
