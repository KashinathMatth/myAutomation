package com.sg.abstractor;
abstract class Watch
{
	static void add(int a,int b)
	{
		int res=a+b;
		System.out.println("addition : "+res);

	}
	static void sub(int a,int b)
	{
		int res=a-b;
		System.out.println("subtraction : "+res);
	}
}

public class TwoStatickAbstract {

	public static void main(String[] args) {
		Watch.add(2, 5);
		Watch.sub(56, 6);

	}

}
