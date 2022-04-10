package com.sgtesting.programm2;
class Employee
{
	String name;
	int idnumber;
	int age;
	String shift;
}
class Department
{
	String Dname;
	int numofworkers;
	String workplace;
	int sallary;
}
class Insurance
{
	String Cname;
	int amount;
	String tyepeofinsurance;
	int years;
}

public class MainDemo1 {
	public static void main(String[] args) {
		Employee obj1=new Employee();
		obj1.name= "kashinath";
		obj1.idnumber=85;
		obj1.age=26;
		obj1.shift="Ashift";
		System.out.println("name:"+obj1.name);
		System.out.println("in number:"+obj1.idnumber);
		System.out.println("age is:"+obj1.age);
		System.out.println("shift is:"+obj1.shift);

		Department bwr=new Department();
		bwr.Dname="Design";
		bwr.numofworkers=400;
		bwr.workplace="ps1";
		bwr.sallary= 12000;
		System.out.println("Dname is:"+bwr.Dname);
		System.out.println("No of workers are:"+bwr.numofworkers);
		System.out.println("Work place is:"+bwr.workplace);
		System.out.println("Sallary is:"+bwr.sallary);

		Insurance lic=new Insurance();
		lic.Cname="Lic";
		lic.amount=50000;
		lic.tyepeofinsurance="Health and accidental";
		lic.years=10;
		System.out.println("company is:"+lic.Cname);
		System.out.println("the amount is:"+lic.amount);
		System.out.println("Type of insurance:"+lic.tyepeofinsurance);
		System.out.println("Years are:"+lic.years);
	}

}
