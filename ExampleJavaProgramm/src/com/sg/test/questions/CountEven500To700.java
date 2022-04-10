package com.sg.test.questions;
class Even
{
	int total()
	{
		int count=0;
		for(int i=500; i<=700; i++)
		{
			count++;
		}
		return count;
	}
	
}

public class CountEven500To700 {

	public static void main(String[] args) {
		Even obj=new Even ();
		int a=obj.total();
		{
			System.out.println(a);
		}
		
	}

}
