package com.sgtesting.methods;
class Fibo
{
	void fibonice()
	{
		int a=0,b=1,res;
		System.out.println(a);
		System.out.println(b);
		for(int i=3; i<10; i++ )
		{
			res=a+b;
			System.out.println(res);
			a=b;
			b=res;
		}
	}
}

public class ExersiseFibon {

	public static void main(String[] args) {
		Fibo obj=new Fibo();
		obj.fibonice();
		


	}

}
