package com.kashi.practice;
abstract class City
{
	abstract void displayCityName(String name);
	abstract void showNoOfVoters(int peoples);
}
class Taluk extends City
{
	void displayCityName(String name)
	{
		System.out.println("The Taluka Name is");
	}
	void showNoOfVoters(int peoples)
	{
		System.out.println("The peoples to be Vote :"+peoples);
	}
}
public class abstracionDemo {

	public static void main(String[] args) {
		Taluk t1=new Taluk ();
		t1.displayCityName("Basavakalyan, Humnabad,Aurad,Hulsur");
		t1.showNoOfVoters(4500000);

	}

}
