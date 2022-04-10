package com.sgtesting.returnmethods;
class Name
{
	String getname()
	{
		return "kashi";
	}
}


public class ReturnName {

	public static void main(String[] args) {
		Name o=new Name();
		String s=o.getname();
		System.out.println(s);

	}

}
