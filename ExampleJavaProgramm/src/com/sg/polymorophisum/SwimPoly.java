package com.sg.polymorophisum;
abstract class Swimming
{
  abstract void swim();
}

class Animals extends Swimming
{
	void swim()
	{
		System.out.println("The animals are swims in lake, rver ");
	}
}
class Human extends Swimming
{
	void swim()
	{
		System.out.println("Human Beings are swims in pool, small river");
	}
}
class Reptiles extends Swimming
{
	void swim()
	{
		System.out.println("Some of reptiles are swims or lives in Ocean");
	}
}

public class SwimPoly {

	public static void main(String[] args) {
		Swimming water=null;
		
		Animals a=new Animals();
		Human h=new Human();
		Reptiles r=new Reptiles();
		
		water=a;
		water.swim();
		
		water=h;
		water.swim();
		
		water=r;
		water.swim();
		

	}

}
