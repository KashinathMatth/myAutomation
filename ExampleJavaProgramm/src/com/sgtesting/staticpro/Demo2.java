package com.sgtesting.staticpro;
class Demoxr
{
	static String name;
		static int age;
		static void addition (int v,int u)
		{
			int res=(u+v)-(u*v);
			System.out.println("The result is:"+res);
		}
}

public class Demo2 {

	public static void main(String[] args) {
		Demoxr.name="kiccha";
		Demoxr.age=28;
		System.out.println(Demoxr.name+"    "+Demoxr.age);
		Demoxr.addition(25, 10);
		

	}

}
