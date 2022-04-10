package com.kashi.practice;
class village
{
  String name;
  int population;
  village ()
  {
	  name="Gour";
	  population=16000;
	  System.out.println("The Beauti Village Name"+name);
	  System.out.println("The No Of Population is"+population);
  }
}
class district
{
	String name;
	int voters;
	String Mname;
	district()
	{
		name="Bidar";
		voters=4500001;
		Mname="B.Khuba";
		System.out.println("The Dist. Name is"+name);
		System.out.println("The No Of Voters"+voters);
		System.out.println("The MP name is"+Mname);
				
	}
}

public class noArgsDemo1 {

	public static void main(String[] args) {
		village v1=new village();
		
		district d1=new district();
		
		

	}

}
