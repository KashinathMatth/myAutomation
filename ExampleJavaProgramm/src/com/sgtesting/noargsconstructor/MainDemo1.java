package com.sgtesting.noargsconstructor;
class Employee
{
	String name;
	int idnumber;
	int age;
	String shift;
	Employee ()
	{
		name= "kashinath";
		idnumber=85;
		age=26;
		shift="Ashift";
		System.out.println("name:"+name);
		System.out.println("in number:"+idnumber);
		System.out.println("age is:"+age);
		System.out.println("shift is:"+shift);
	}
}
class Department
{
	String Dname;
	int numofworkers;
	String workplace;
	int sallary;
	Department ()
	{
		Dname="Design";
		numofworkers=400;
		workplace="ps1";
		sallary= 12000;
		System.out.println("Dname is:"+Dname);
		System.out.println("No of workers are:"+numofworkers);
		System.out.println("Work place is:"+workplace);
		System.out.println("Sallary is:"+sallary);
	}
}
class Insurance
{
	String Cname;
	int amount;
	String tyepeofinsurance;
	int years;
	Insurance ()
	{
		Cname="Lic";
		amount=50000;
		tyepeofinsurance="Health and accidental";
		years=10;
		System.out.println("company is:"+Cname);
		System.out.println("the amount is:"+amount);
		System.out.println("Type of insurance:"+tyepeofinsurance);
		System.out.println("Years are:"+years);
	}
}

public class MainDemo1 {
	public static void main(String[] args) {
		Employee obj1=new Employee();


		Department bwr=new Department();


		Insurance lic=new Insurance();

	}

}
