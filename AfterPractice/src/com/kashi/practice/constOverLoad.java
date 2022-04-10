package com.kashi.practice;
class mobile1
{
	String name;
	int price;
	mobile1(String name,int price)
	{
		System.out.println("The Brand is :"+name);
		System.out.println("The amount should be"+price);
	}
	mobile1(double amount,String brand)
	{
		System.out.println("The price may differ"+amount);
		System.out.println("The mobile name is"+brand);
	}
	mobile1(String mName,int quty,String pName)
	{
		System.out.println("The Mobile name is :"+mName);
		System.out.println("No. of Quantity requers :"+quty);
		System.out.println("The person who using :"+pName);
	}
}

public class constOverLoad {

	public static void main(String[] args) {
		mobile1 m1=new mobile1("Samsung",78000);
		mobile1 m2=new mobile1(78.15,"apple");
		mobile1 m3=new mobile1("Vivo v25",05,"Sunil");
		mobile1 m4=new mobile1(45.15,"One+9");
		// TODO Auto-generated method stub

	}

}
