package com.sg.polymorophisum;
abstract class Car
{
	abstract void run (); 
}

class Audi extends Car
{
	void run()
	{
		int a,b;
		a=40; b=6;
		System.out.println("The speed of the car is :"+(a*b));
	}
}
class Tata extends Car
{
	void run()
	{
		int a, b, c;
		a=30; b=5; c=120;
		System.out.println("The speed limit is :"+((a*b)+c));
	}
}
class Wolksvagon extends Car
{
	void run()
	{
		int a ,b;
		a=120; b=50;
		System.out.println("The speed of this :"+(a+b));
	}
}

public class CarPoly {

	public static void main(String[] args) {
		Car k=null;

		Audi a=new Audi();
		Tata t=new Tata();
		Wolksvagon w=new Wolksvagon();

		k=a;
		k.run();
		k=t;
		k.run();
		k=w;
		k.run();


	}

}
