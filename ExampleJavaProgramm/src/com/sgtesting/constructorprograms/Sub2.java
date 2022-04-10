package com.sgtesting.constructorprograms;
class Substraction
{
	Substraction(int a[], int b[])
	{
		for(int i=0; i<a.length; i++)
		{
			int result=a[i]-b[i];
			System.out.println(result+"   ");
		}
	}
	
}

public class Sub2 {

	public static void main(String[] args) {
		int a[]= {2,5,8};
		int b[]= {8,7,9};
		Substraction Oa=new Substraction(a,b);
		

	}

}
