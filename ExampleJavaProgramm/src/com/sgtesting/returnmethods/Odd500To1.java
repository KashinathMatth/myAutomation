package com.sgtesting.returnmethods;
class Odd
{
	int odd()
	{
		int count=0;
		for(int i=500;i>=1;i--)
		{
			if(i%2!=0) 
			{
				count=count+1;
				
			}
		}
		return count;
		
	}
}

public class Odd500To1 {

	public static void main(String[] args) {
		  
		Odd obj=new Odd();
		int a=obj.odd();
		System.out.println(a);

	

	}

}
