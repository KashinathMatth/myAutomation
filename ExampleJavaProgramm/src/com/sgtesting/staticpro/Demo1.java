package com.sgtesting.staticpro;
class Demo
{
	static int getSum()
	{
		int res=1;
		for(int i=1; i<=10; i++)
		{
			res=res+i;
		}
		return res;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		int val=Demo.getSum();
		System.out.println(val);

	}
}
