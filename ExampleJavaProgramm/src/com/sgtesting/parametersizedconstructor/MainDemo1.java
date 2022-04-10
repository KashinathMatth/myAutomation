package com.sgtesting.parametersizedconstructor;
class Employee
{
	String name;
	int idnumber;
	int age;
	String shift;
	Employee (String name,int idnumber,int age,String shift)
	{
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
	Department (String Dname,int numofworkers,String workplace,int sallary)
	{
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
	Insurance (String Cname,int amount,String tyepeofinsurance,int years)
	{
		System.out.println("company is:"+Cname);
		System.out.println("the amount is:"+amount);
		System.out.println("Type of insurance:"+tyepeofinsurance);
		System.out.println("Years are:"+years);
	}
}

public class MainDemo1 {
	public static void main(String[] args) {
		Employee obj1=new Employee("kashinath",8105,26,"B shift");


		Department bwr=new Department("Design",100,"ps 1",1200);


		Insurance lic=new Insurance("LIC",70000,"Health and accidental",7);

	}

}
