package com.sgtesting.noargsconstructor;
class Cricket
{
	String name;
	int players;
	String Goodplayer;
	int matchwon;
	Cricket ()
	{
		name="team India";
		players=11;
		Goodplayer="pant";
		matchwon=5;
		System.out.println("Team name is:"+name);
		System.out.println("Good palyer is:"+Goodplayer);
		System.out.println("The no of players are:"+players);
		System.out.println("won:"+matchwon);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}
}
class Hocky
{
	String name;
	int players;
	String Goodplayer;
	int matchwon;
	Hocky ()
	{
		name="team India";
		players=15;
		Goodplayer="Kiccha";
		matchwon=4;
		System.out.println("Team name is:"+name);
		System.out.println("Good palyer is"+Goodplayer);
		System.out.println("The no of players are:"+players);
		System.out.println("won:"+matchwon);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}
}
class Footbal
{
	String name;
	int players;
	String Goodplayer;
	int matchwon;
	Footbal ()
	{
		name="team India";
		players=12;
		Goodplayer="Kiccha";
		matchwon=4;
		System.out.println("The team is:"+name);
		System.out.println("total:"+players);
		System.out.println("best players:"+Goodplayer);
		System.out.println("won:"+matchwon);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}
}

public class MainDemo5 {

	public static void main(String[] args) {
		Cricket game=new Cricket();


		Hocky game2=new Hocky();

		Footbal game3=new Footbal();

	}

}
