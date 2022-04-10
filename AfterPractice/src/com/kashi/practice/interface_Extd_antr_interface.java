package com.kashi.practice;
interface project
{
	void details(String dtl);
	void managerNames(String mName);
}
interface qa extends project
{
	void numberOfTeam(int size);
}
class analyst implements qa
{
	public void details(String dtl)
	{
		System.out.println("The details of project is :"+dtl);
	}
	public void managerNames(String mName)
	{
		System.out.println("THE NAME OF THE MANGER IS"+mName);
	}
	public void numberOfTeam(int size)
	{
		System.out.println("The no of members are :"+size);
	}
	void displayEstimation(int time)
	{
		System.out.println("The dsetiny of the project is :"+time);
	}
}

public class interface_Extd_antr_interface {

	public static void main(String[] args) {
		analyst b1=new analyst ();
		b1.details("p2p SAP");
		b1.numberOfTeam(8);
		b1.displayEstimation(45);
		b1.managerNames("kiccha");


	}

}
