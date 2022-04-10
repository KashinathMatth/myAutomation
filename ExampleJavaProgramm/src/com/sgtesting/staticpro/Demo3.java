package com.sgtesting.staticpro;
class Demox
{
	void divvision(int y, int z)
	{
		int res=(y/z);
		System.out.println("the division result is"+res);
	}
	static void addition(int q, int w)
	{
		int res=(q+w);
		System.out.println("the addition result is:"+res);
	}
}

public class Demo3 {

	public static void main(String[] args) {
		Demox t=new Demox();
		t.divvision(85,2);
		
		Demox.addition(15, 25);
	

	}

}
