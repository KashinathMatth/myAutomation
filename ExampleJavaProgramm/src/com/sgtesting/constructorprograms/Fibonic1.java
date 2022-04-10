package com.sgtesting.constructorprograms;
class Fibo
{
	Fibo(int n1,int n2,int sum)
	{
		System.out.println(n1);
		System.out.println(n2);

		for(int i=3; i<=10; i++)
		{
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
		}
	}
}

public class Fibonic1 {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int sum=0;
		Fibo o1=new Fibo(n1,n2,sum);


	}

}
