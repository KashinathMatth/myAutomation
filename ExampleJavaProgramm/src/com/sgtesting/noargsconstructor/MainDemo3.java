package com.sgtesting.noargsconstructor;

class Dextop
{
	String name;
	int price;
	int quantity;
	String brand;
	int ram;
	String procees;
	Dextop ()
	{
		name="apple";
		price=900000;
		quantity=4;
		brand="american";
		ram=8;
		procees="os software";
		System.out.println("Name is:"+name);
		System.out.println("The price:"+price);
		System.out.println("Quty:"+quantity);
		System.out.println("The brand:"+brand);
		System.out.println("The ram is:"+ram);
		System.out.println("The processor is :"+procees);
		System.out.println("*******************");
	}
}
class Laptop
{
	String name;
	int price;
	int ram;
	String process;
	Laptop ()
	{
		name="lenovo";
		price=780000;
		ram=8;
		process="Micro soft 11";
		System.out.println("The brand name is:"+name);
		System.out.println("THe amount is:"+price);
		System.out.println("Th memory is:"+ram);
		System.out.println("The operating is :"+process);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%");
	}
}
class Mobile
{
	String name;
	int price;
	int cammera;
	String android;
	Mobile ()
	{
		name="Samsung";
		price=700000;
		android="UI";
		cammera=108;
		System.out.println("name:"+name);
		System.out.println("Th price is:"+price);
		System.out.println("The opp system is:"+android);
		System.out.println("The mega pixle:"+cammera);
	}
}

public class MainDemo3 {

	public static void main(String[] args) {
		Dextop led=new Dextop();


		Laptop hd=new Laptop();


		Mobile phone=new Mobile();

	}

}
