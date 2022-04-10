package com.sgtesting.parametersizedconstructor;
class CaptalCity
{
	String names;
	int population;
	int mncs;
	String bestplace;
	CaptalCity (String names,int population,int mncs,String bestplace)
	{
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
	Districts (	String names,int population,int mncs,String Bestplace)
	{
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
	villages (String name,int population,int mncs,String Bestplace)
	{
		System.out.println("City names are:"+name);
		System.out.println("Population is:"+population);
		System.out.println("The no of companies:"+mncs);
		System.out.println("Best places are:"+Bestplace);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
}

public class MainDemo6 {

	public static void main(String[] args) {
		CaptalCity place1=new CaptalCity("Banglore,Mysore,Mangalore",2500000,1800,"Banglore");


		Districts place2=new Districts("Bidar,Gulbarga,Chitradurga",8500000,150,"Bidar");


		villages place3=new villages("kanakatta,shira,",15746,0,"kanakatta");

	}

}
