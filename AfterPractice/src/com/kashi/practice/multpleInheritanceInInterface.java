package com.kashi.practice;
interface hospital
{
	void showHospitalName(String hname);
}
interface labrotary
{
	void showAvailability(int no);
}
class doctors implements hospital,labrotary
{
	public void showHospitalName(String hname)
	{
		System.out.println("the name of the HSPTL ;"+hname);
	}
	public void  showAvailability(int no)
	{
		System.out.println("The no. of labs available in hstpl "+no);
	}
}

public class multpleInheritanceInInterface {

	public static void main(String[] args) {
	   doctors d1=new doctors ();
	   d1.showHospitalName("Vijaya Clinic");
	   d1.showAvailability(5);
	   

	}

}
