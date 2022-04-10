package com.sgtesting.methods;
class Arra
{
	void Array(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
			
	}
}

public class MethodsDemo1 {

	public static void main(String[] args) {
		int b[]= {1,2,5};
		Arra o1= new Arra();
		o1.Array(b);
	}

}
