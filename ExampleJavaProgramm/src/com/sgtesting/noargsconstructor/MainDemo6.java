package com.sgtesting.noargsconstructor;
class CaptalCity
{
	String names;
	int population;
	int mncs;
	String bestplace;
	CaptalCity ()
	{
		names="Banglore, mysore";
		population=1250000;
		mncs=8500;
		bestplace="Vijaynagar";
		System.out.println("City names are:"+names);
		System.out.println("Population is:"+population);
		System.out.println("The no of companies:"+mncs);
		System.out.println("Best places are:"+bestplace);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
}
class Districts
{
	String names;
	int population;
	int mncs;
	String Bestplace;
	Districts ()
	{
		names="Bidar, basavakalyan,bhalki";
		population=250000;
		mncs=0;
		Bestplace="Kali galli";
		System.out.println("City names are:"+names);
		System.out.println("Population is:"+population);
		System.out.println("The no of companies:"+mncs);
		System.out.println("Best places are:"+Bestplace);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
}
class villages
{
	String name;
	int population;
	int mncs;
	String Bestplace;
	villages ()
	{
		name="Kanakatta, Gour janapur";
		population=250000;
		mncs=0;
		Bestplace="Kiccha na mane";
		System.out.println("City names are:"+name);
		System.out.println("Population is:"+population);
		System.out.println("The no of companies:"+mncs);
		System.out.println("Best places are:"+Bestplace);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
}

public class MainDemo6 {

	public static void main(String[] args) {
		CaptalCity place1=new CaptalCity();


		Districts place2=new Districts();


		villages place3=new villages();

	}

}
