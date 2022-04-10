package com.sgtesting.constructorprograms;
class Sub
{
	Sub(int a[][], int b[][])
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0;j<a[i].length; j++)
			{
				int res=a[i][j]-b[i][j];
				System.out.print(res+"  ");
			}
			System.out.println();
		}
	}
}

public class Substrct3 {

	public static void main(String[] args) {
		int k[][]= {{41,54,89},{74,87,51}};
		int s[][]= {{25,4,8},{41,15,8}};
		Sub ob1 = new Sub(k,s);
	}

}
