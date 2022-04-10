package com.sg.test.questions;
class Primee
{
	boolean prim (int a)
	{
		if((a%2!=0)&&(a%3!=0))
		{
			return true;
		}
		else
		{
			return false;
	}
}
}

public class PrimeOrNott {

	public static void main(String[] args) {
		Primee ok=new Primee();
		boolean a=ok.prim(7);
		System.out.println(a);


	}

}
