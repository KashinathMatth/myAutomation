package com.sg.interfacee;
interface worldcup
{
	void showCountryName(String name);
}
interface type
{
	void showType(String type);
}
interface bestPlayer
{
	void showPlayerName(String name);
}
interface wonMatches
{
	void showMatheswon(int wonMatches );
}
abstract class Country
{
	abstract void showCountry(String name);
}

class Samo extends Country implements worldcup,type,bestPlayer,wonMatches
{
	public void showCountryName(String name)
	{
		System.out.println("Country Name:"+name);
	}
	public void showType(String name)
	{
		System.out.println("Type:"+name);
	}
	public void showPlayerName(String name)
	{
		System.out.println("PlayerName:"+name);
	}
	public void showMatheswon(int num)
	{
		System.out.println("Won Matches:"+num);
	}
	public void showCountry(String name)
	{
		System.out.println("Country:"+name);
	}
	void displayCoachName(String name)
	{
		System.out.println("The new coach name :"+name);
	}
}


public class MultiSubclssExtendAbstrct2nd {

	public static void main(String[] args) {
		Samo s=new Samo();
		s.showCountryName("India");
		s.showType("IPL");
		s.showPlayerName("Rahul Dravid");
		s.showMatheswon(5);
		s.showCountry("Pakistan");
		s.displayCoachName("Gawaskar");
	}

}

