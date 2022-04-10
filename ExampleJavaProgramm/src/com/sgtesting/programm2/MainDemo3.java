package com.sgtesting.programm2;

class Dextop
{
	String name;
	int price;
	int quantity;
	String brand;
	int ram;
	String procees;
}
class Laptop
{
	String name;
	int price;
	int ram;
	String process;
}
class Mobile
{
	String name;
	int price;
	int cammera;
	String android;
}

public class MainDemo3 {

	public static void main(String[] args) {
		Dextop led=new Dextop();
		led.name="apple";
		led.price=900000;
		led.quantity=4;
		led.brand="american";
		led.ram=8;
		led.procees="os software";
		System.out.println("Name is:"+led.name);
		System.out.println("The price:"+led.price);
		System.out.println("Quty:"+led.quantity);
		System.out.println("The brand:"+led.brand);
		System.out.println("The ram is:"+led.ram);
		System.out.println("The processor is :"+led.procees);
		System.out.println("*******************");

		Laptop hd=new Laptop();
		hd.name="lenovo";
		hd.price=780000;
		hd.ram=8;
		hd.process="Micro soft 11";
		System.out.println("The brand name is:"+hd.name);
		System.out.println("THe amount is:"+hd.price);
		System.out.println("Th memory is:"+hd.ram);
		System.out.println("The operating is :"+hd.process);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%");

		Mobile phone=new Mobile();
		phone.name="Samsung";
		phone.price=700000;
		phone.android="UI";
		phone.cammera=108;
		System.out.println("name:"+phone.name);
		System.out.println("Th price is:"+phone.price);
		System.out.println("The opp system is:"+phone.android);
		System.out.println("The mega pixle:"+phone.cammera);
	}

}
