package com.sgtesting.parametersizedconstructor;

class Fruits
{
	String name;
	int quantity;
	String colour;
	String quality;
	Fruits (String name,int quantity,String colour,String quality)
	{
		System.out.println("The name:"+name);
		System.out.println("No of fruits are:"+quantity);
		System.out.println("Colour:"+colour);
		System.out.println("Quality is:"+quality);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
}
class Vegitable
{
	String name;
	int quantity;
	String colour;
	String quality;
	Vegitable (String name,int quantity,String colour,String quality)
	{
		System.out.println("Name is:"+name);
		System.out.println("no of vegitables:"+quantity);
		System.out.println("Banna is:"+colour);
		System.out.println("Quality is:"+quality);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
}
class Flowers
{
	String name;
	int quantity;
	String colour;
	String quality;
	Flowers (String name,int quantity,String colour,String quality)
	{
		System.out.println("Name is:"+name);
		System.out.println("Quantity are:"+quantity);
		System.out.println("Colour is:"+colour);
		System.out.println("Quality is:"+quality);
	}
}

public class MainDemo4 {

	public static void main(String[] args) {
		Fruits obj1=new Fruits("Apple",50,"lite Red","Good");


		Vegitable obj2=new Vegitable("carett",10,"redish","Good");


		Flowers obj3=new Flowers("Rose",5,"red","nice");

	}

}
