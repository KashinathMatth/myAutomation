package com.sgtesting.programm2;
class CaptalCity
{
	String names;
	int population;
	int mncs;
	String bestplace;
}
class Districts
{
	String names;
	int population;
	int mncs;
	String Bestplace;
}
class villages
{
	String name;
	int population;
	int mncs;
	String Bestplace;
}

public class MainDemo6 {

	public static void main(String[] args) {
		CaptalCity place1=new CaptalCity();
		place1.names="Banglore, mysore";
		place1.population=1250000;
		place1.mncs=8500;
		place1.bestplace="Vijaynagar";
		System.out.println("City names are:"+place1.names);
		System.out.println("Population is:"+place1.population);
		System.out.println("The no of companies:"+place1.mncs);
		System.out.println("Best places are:"+place1.bestplace);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		Districts place2=new Districts();
		place2.names="Bidar, basavakalyan,bhalki";
		place2.population=250000;
		place2.mncs=0;
		place2.Bestplace="Kali galli";
		System.out.println("City names are:"+place2.names);
		System.out.println("Population is:"+place2.population);
		System.out.println("The no of companies:"+place2.mncs);
		System.out.println("Best places are:"+place2.Bestplace);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		villages place3=new villages();
		place3.name="Kanakatta, Gour janapur";
		place3.population=250000;
		place3.mncs=0;
		place3.Bestplace="Kiccha na mane";
		System.out.println("City names are:"+place3.name);
		System.out.println("Population is:"+place3.population);
		System.out.println("The no of companies:"+place3.mncs);
		System.out.println("Best places are:"+place3.Bestplace);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

}
