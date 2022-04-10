package com.sgtesting.parametersizedconstructor;

class Dextop
{
	String name;
	int price;
	int quantity;
	String brand;
	int ram;
	String procees;
	Dextop (String name,int price,int quantity,String brand,int ram,String procees)
	{
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
	Laptop (String name,int price,int ram,String process)
	{
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
	Mobile (String name,int price,int cammera,String android)
	{
		System.out.println("name:"+name);
		System.out.println("Th price is:"+price);
		System.out.println("The opp system is:"+android);
		System.out.println("The mega pixle:"+cammera);
	}
}

public class MainDemo3 {

	public static void main(String[] args) {
		Dextop led=new Dextop("Apple",850000,8,"American ",8,"os system");


		Laptop hd=new Laptop("Lenovo",78000,8,"Windos 11");


		Mobile phone=new Mobile("samsun",65000,108,"One UI");

	}

}
