package com.sgtesting.noargsconstructor;

class TwoWheleer
{
	String name;
	int speed;
	int mailage;
	int price;
	String brand;
	String collour;
	TwoWheleer ()
	{
		name="vespa";
		speed=210;
		mailage=60;
		price=80000;
		brand="bajaj";
		collour="black";
		System.out.println("Bike Name is:"+name);
		System.out.println("The speed is:"+speed);
		System.out.println("The mailage:"+mailage);
		System.out.println("The price is:"+price);
		System.out.println("The brand name is:"+brand);
		System.out.println("The colour is:"+collour);
		System.out.println("###########################");
	}
}
class FourWheeler
{
	String name;
	int speed;
	int mailage;
	String brand;
	int capacity;
	FourWheeler ()
	{
		name="audi";
		speed=280;
		mailage=40;
		brand="Wholksvagon";
		capacity=4;
		System.out.println("The car Name is:"+name);
		System.out.println("The speed is:"+speed);
		System.out.println("The mailage is:"+mailage);
		System.out.println("The Brand name is:"+brand);
		System.out.println("The capacity of car is:"+capacity);
	}
}



public class MainDemo2 {

	public static void main(String[] args) {
		TwoWheleer bike=new TwoWheleer();


		FourWheeler car=new FourWheeler();

	}

}
