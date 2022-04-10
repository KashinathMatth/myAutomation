package com.sgtesting.parametersizedconstructor;
class Cricket
{
	String name;
	int players;
	String Goodplayer;
	int matchwon;
	Cricket (String name,int players,String Goodplayer,int matchwon)
	{
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
	Hocky (String name,int players,String Goodplayer,int matchwon)
	{
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
	Footbal (String name,int players,String Goodplayer,int matchwon)
	{
		System.out.println("The team is:"+name);
		System.out.println("total:"+players);
		System.out.println("best players:"+Goodplayer);
		System.out.println("won:"+matchwon);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}
}

public class MainDemo5 {

	public static void main(String[] args) {
		Cricket game=new Cricket("Team India",5,"Virat Kohli",11);


		Hocky game2=new Hocky("bharat",18,"Kiccha Sudeep",7);

		Footbal game3=new Footbal("India",12,"Ronaldo",2);

	}

}
