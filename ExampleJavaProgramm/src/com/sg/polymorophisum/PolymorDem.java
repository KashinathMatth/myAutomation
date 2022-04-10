package com.sg.polymorophisum;
abstract class SimpleMaths
{
	abstract void maths();
}

class Addition extends SimpleMaths
{
	void maths()
	{
		int a,b;
		a=20; b=30;
		System.out.println("The addition REsults is :"+(a+b));
	}
}
class Substarction extends SimpleMaths
{
	void maths()
	{
		int x,y;
		x=150; y=57;
		System.out.println("The sub result is :"+(x-y));
	}
}
class Division extends SimpleMaths
{
	void maths()
	{
		int q,r;
		q=84; r=7;
		System.out.println("The division result :"+(q/r));
	}
}

public class PolymorDem {

	public static void main(String[] args) {
		SimpleMaths calcu=null;

		Addition add=new Addition ();
		Substarction sub=new Substarction ();
		Division div=new Division ();

		calcu=add;
		calcu.maths();

		calcu=sub;
		calcu.maths();

		calcu=div;
		calcu.maths();



	}

}
