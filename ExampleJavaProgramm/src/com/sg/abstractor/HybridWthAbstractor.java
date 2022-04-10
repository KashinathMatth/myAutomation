package com.sg.abstractor;
abstract class HybridDemo
{
	abstract void show(String name);
	abstract void age(int age);
	abstract void num(int x,int y);
	int sum=0;
	void sum1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum : "+sum);
	}
}
abstract class Demo1 extends HybridDemo
{
	void show(String name)
	{
		System.out.println("Name : "+name);
	}
}
class Demo2 extends Demo1
{
	void age(int age)
	{
		System.out.println("Age : "+ age);
	}
	void num(int x1,int y2)
	{
		System.out.println("x " + x1 + "y " + y2);
	}
}
class Hybrid1 extends HybridDemo
{
	void show(String name11)
	{
		System.out.println("name : "+ name11);
	}
	void age(int age11)
	{
		System.out.println("age : "+ age11);
	}
	void num(int x,int y)
	{
		System.out.println("x " + x + "y " + y);
	}
	int count=0;
	void count1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				count++;
		}
		System.out.println("Count : " + count);
	}
}

public class HybridWthAbstractor {

	public static void main(String[] args) {
		Demo2 demo=new Demo2();
		demo.num(13,11);
		demo.age(22);
		demo.show("kicchu");
		demo.sum1(10);
		Hybrid1 h=new Hybrid1();
		h.age(34);
		h.show("xyz");
		h.num(34,76);
		h.count1(0);
		

	}

}
