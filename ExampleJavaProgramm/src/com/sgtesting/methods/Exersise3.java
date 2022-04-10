package com.sgtesting.methods;
class Single
{
	void Transpose(int a[][])
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[j][i]+"  ");
			}
			System.out.println();
		}
	}
}

public class Exersise3 {

	public static void main(String[] args) {
		Single o=new Single();
		int d[][]= {{1,5,},{7,8,}};
		o.Transpose(d);
		

	}

}
