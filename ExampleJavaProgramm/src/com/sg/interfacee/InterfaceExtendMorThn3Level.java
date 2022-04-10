package com.sg.interfacee;
interface Rain
{
	void showPlaces(String place);
}
interface Percent extends Rain
{
	void showPercentOfRain(int percent);
}
interface Duration extends Percent
{
	abstract void showDaysOfRain(int days);
}
interface Alert extends Duration
{
	void showAlert(String zone);
}
class Sample implements Alert
{
	public void showPlaces(String place)
	{
		System.out.println("Garden City :"+place);
	}
	public void showPercentOfRain(int percent)
	{
		System.out.println("The percent of rain is :"+percent);
	}
	public void showDaysOfRain(int days)
	{
		System.out.println("Further rain duration in days is :"+days);
	}
	public void showAlert(String zone)
	{
		System.out.println("In Banglore the zone alert by Government is :"+zone);
	}
	void displayReson(String resason)
	{
		System.out.println("The reson for heavy rain since from two dasy is :"+resason);
	}
}


public class InterfaceExtendMorThn3Level {

	public static void main(String[] args) {
		Sample o=new Sample();
		o.showPlaces("Bengaluru");
		o.showPercentOfRain(100);
		o.showDaysOfRain(8);
		o.showAlert("Orange Zone");
		o.displayReson("Syclon");


	}

}
