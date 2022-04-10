package com.sgtesting.programm2;
class Cricket
{
	String name;
	int players;
	String Goodplayer;
	int matchwon;
}
class Hocky
{
	String name;
	int players;
	String Goodplayer;
	int matchwon;
}
class Footbal
{
	String name;
	int players;
	String Goodplayer;
	int matchwon;
}

public class MainDemo5 {

	public static void main(String[] args) {
		Cricket game=new Cricket();
		game.name="team India";
		game.players=11;
		game.Goodplayer="pant";
		game.matchwon=5;
		System.out.println("Team name is:"+game.name);
		System.out.println("Good palyer is:"+game.Goodplayer);
		System.out.println("The no of players are:"+game.players);
		System.out.println("won:"+game.matchwon);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		Hocky game2=new Hocky();
		game2.name="team India";
		game2.players=15;
		game2.Goodplayer="Kiccha";
		game2.matchwon=4;
		System.out.println("Team name is:"+game2.name);
		System.out.println("Good palyer is"+game2.Goodplayer);
		System.out.println("The no of players are:"+game2.players);
		System.out.println("won:"+game2.matchwon);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		Footbal game3=new Footbal();
		game3.name="team India";
		game3.players=12;
		game3.Goodplayer="Kiccha";
		game3.matchwon=4;
		System.out.println("The team is:"+game3.name);
		System.out.println("total:"+game3.players);
		System.out.println("best players:"+game3.Goodplayer);
		System.out.println("won:"+game3.matchwon);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}

}
