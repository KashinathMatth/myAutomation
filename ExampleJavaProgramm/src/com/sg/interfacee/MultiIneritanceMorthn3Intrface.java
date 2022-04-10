package com.sg.interfacee;
interface vehicle
{
	abstract void showVehicle(String name);
}
interface car
{
	void showcartype(String name);
}
interface bike
{
	abstract void showBikeName(String name);
}
interface ownername
{
	void showOwnerName(String name);
}

class Automobile implements vehicle,car,bike,ownername
{
	public void showVehicle(String name)
	{
		System.out.println("The vehicle name is  :"+name);
	}
	public void showcartype(String name)
	{
		System.out.println("Type of car is  :"+name);
	}
	public void showBikeName(String name)
	{
		System.out.println("The bike name is  :"+name);
	}
	public void showOwnerName(String name)
	{
		System.out.println("The Legend owner name is  :"+name);
	}
	void displayCompany(String name)
	{
		System.out.println("The Company name is  :"+name);
	}
}

public class MultiIneritanceMorthn3Intrface {

	public static void main(String[] args) {
		Automobile o=new Automobile();
		o.showVehicle("Mercidies");
		o.showcartype("Four Wheeler");
		o.showBikeName("Splender");
		o.showOwnerName("Kashinath");
		o.displayCompany("Hero,Volkswagon");

	}

}
