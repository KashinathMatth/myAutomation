package com.sg.polymorophisum;
abstract class Animal
{
	abstract void Hunting ();
}
class Tiger extends Animal
{
	void Hunting()
	{
		System.out.println("Tiger Hunts Deer");
	}
}
class Lion extends Animal
{
	void Hunting()
	{
		System.out.println("Lion hunts cat");
	}
}
class Cheeta extends Animal
{
	void Hunting ()
	{
		System.out.println("Cheeta Hunts zeebra and crocodile, Man");
	}
}

public class Ass5 {

	public static void main(String[] args) {
		Animal a=null;
		
		Tiger t=new Tiger();
		Lion l=new Lion();
		Cheeta c=new Cheeta();
		
		a=t;
		a.Hunting();
		a=l;
		a.Hunting();
		a=c;
		a.Hunting();
		

	}

}
