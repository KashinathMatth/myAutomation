package com.kashi.practice;
interface laptop
{
	void showBrandName(String name);
	void buyerName(String bname);
}
class pc implements laptop
{
	public void showBrandName(String name)
	{
		System.out.println("The name of the lp :"+name);
	}

	public void buyerName(String bname)
	{
		System.out.println("The name of the owner is :"+bname);
	}

	void displayQuty(int no)
	{
		System.out.println("Number of lp are :"+no);  
	}
}

public class interfaceSimple {

	public static void main(String[] args) {
		pc p1=new pc();
		p1.showBrandName("lenovo,Hp,Dell");
		p1.displayQuty(5);
		p1.showBrandName("Apple");
		p1.buyerName("Kiccha Kashinath");


	}

}
