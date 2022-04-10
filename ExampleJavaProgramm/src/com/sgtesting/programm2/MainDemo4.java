package com.sgtesting.programm2;

class Fruits
{
	String name;
	int quantity;
	String colour;
	String quality;
}
class Vegitable
{
	String name;
	int quantity;
	String colour;
	String quality;
}
class Flowers
{
String name;
int quantity;
String colour;
String quality;
}

public class MainDemo4 {

	public static void main(String[] args) {
		Fruits obj1=new Fruits();
		obj1.name="apple";
		obj1.quantity=10;
		obj1.colour="red";
		obj1.quality="Good";
		System.out.println("The name:"+obj1.name);
		System.out.println("No of fruits are:"+obj1.quantity);
		System.out.println("Colour:"+obj1.colour);
		System.out.println("Quality is:"+obj1.quality);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		Vegitable obj2=new Vegitable();
		obj2.name="Carret";
		obj2.quantity=50;
		obj2.colour="orrange";
		obj2.quality="better";
		System.out.println("Name is:"+obj2.name);
		System.out.println("no of vegitables:"+obj2.quantity);
		System.out.println("Banna is:"+obj2.colour);
		System.out.println("Quality is:"+obj2.quality);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		Flowers obj3=new Flowers();
		obj3.name="Rose";
		obj3.quantity=5;
		obj3.colour="redish";
		obj3.quality="very Good";
		System.out.println("Name is:"+obj3.name);
		System.out.println("Quantity are:"+obj3.quantity);
		System.out.println("Colour is:"+obj3.colour);
		System.out.println("Quality is:"+obj3.quality);
	}

}
