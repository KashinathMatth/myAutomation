package com.sgtesting.programm2;

class TwoWheleer
{
	String name;
	int speed;
	int mailage;
	int price;
	String brand;
	String collour;
}
class FourWheeler
{
	String name;
	int speed;
	int mailage;
	String brand;
	int capacity;
}



public class MainDemo2 {

	public static void main(String[] args) {
		TwoWheleer bike=new TwoWheleer();
		bike.name="vespa";
		bike.speed=210;
		bike.mailage=60;
		bike.price=80000;
		bike.brand="bajaj";
		bike.collour="black";
		System.out.println("Bike Name is:"+bike.name);
		System.out.println("The speed is:"+bike.speed);
		System.out.println("The mailage:"+bike.mailage);
		System.out.println("The price is:"+bike.price);
		System.out.println("The brand name is:"+bike.brand);
		System.out.println("The colour is:"+bike.collour);
		System.out.println("###########################");

		FourWheeler car=new FourWheeler();
		car.name="audi";
		car.speed=280;
		car.mailage=40;
		car.brand="Wholksvagon";
		car.capacity=4;
		System.out.println("The car Name is:"+car.name);
		System.out.println("The speed is:"+car.speed);
		System.out.println("The mailage is:"+car.mailage);
		System.out.println("The Brand name is:"+car.brand);
		System.out.println("The capacity of car is:"+car.capacity);
	}

}
