package com.sgtesting.noargsconstructor;

class Fruits
{
	String name;
	int quantity;
	String colour;
	String quality;
	Fruits ()
	{
		name="apple";
		quantity=10;
		colour="red";
		quality="Good";
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
	Vegitable ()
	{
		name="Carret";
		quantity=50;
		colour="orrange";
		quality="better";
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
	Flowers ()
	{
		name="Rose";
		quantity=5;
		colour="redish";
		quality="very Good";
		System.out.println("Name is:"+name);
		System.out.println("Quantity are:"+quantity);
		System.out.println("Colour is:"+colour);
		System.out.println("Quality is:"+quality);
	}
}

public class MainDemo4 {

	public static void main(String[] args) {
		Fruits obj1=new Fruits();


		Vegitable obj2=new Vegitable();


		Flowers obj3=new Flowers();

	}

}
