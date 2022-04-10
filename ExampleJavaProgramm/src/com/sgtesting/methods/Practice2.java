package com.sgtesting.methods;
class Multiplication
{
	void sqare()
	{
		int res;
		for (int i=1; i<=10; i++)
		{
			res=i*i;
			System.out.println(res+" ");
		}
	}
}


public class Practice2 {

	public static void main(String[] args) {
		Multiplication o=new Multiplication();
		o.sqare();


	}

}
