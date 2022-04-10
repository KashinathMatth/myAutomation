package com.sgtesting.inheritance;
class Laptops1
{
	void brand(String name )
	{
		System.out.println("The Brand name is"+name);
	}
}
class Laptops2 extends Laptops1
{
	void cost(int a)
	{
		System.out.println("the cost of the laptos is "+a);
	}
}
class Laptop3 extends Laptops2
{
	void numberOfLaptops(int x)
	{
		System.out.println("the no of laptops is:"+x);
	}
}
class Laptops4 extends Laptops1
{
	void totalCost(int x,int y)
	{
		int res=x*y;
		System.out.println("the total cost is"+res);
	}
}

public class HybridDemo2 {

	public static void main(String[] args) {
		Laptop3 o1=new Laptop3();
		o1.brand("Lenovo");
		o1.cost(75000);
		o1.numberOfLaptops(50);

		Laptops4 o2=new Laptops4();
		o2.totalCost(50, 750000);
		o2.brand("Motorola");



	}

}
