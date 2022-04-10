package com.sgtesting.returnmethods;

class Even
{
	int evencount()
	{
		int count=0;

		for(int i=100;i<=300;i++)
		{
			if(i%2==0)
			{
				count=count+1;
			}
		}
		return count;
	}
}

public class Even100To300 {

	public static void main(String[] args) {

		Even obj=new Even();
		int a=obj.evencount();
		System.out.println(a);


	}

}
