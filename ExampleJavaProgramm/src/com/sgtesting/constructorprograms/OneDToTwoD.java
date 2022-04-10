package com.sgtesting.constructorprograms;
class Array2
{
	Array2(int a[],int row,int column)
	{
		int p=0;
		int b[][]=new int[row][column];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<column; j++)
			{
				b[i][j]=a[p];
				p++;
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class OneDToTwoD {

	public static void main(String[] args) {
		int a[]= {1,8,9,4,5,6};
		Array2 ob2=new Array2(a,2,3);


	}

}
