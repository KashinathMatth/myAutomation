package com.sgtesting.methods;

public class Sample11 {

	public static void main(String[] args) 
	{
		int res=0;
		for(int i=1; i<=100; i++)
		{
			for(int j=2; j<=i-1; j++)
			{
				if(i%j==0)
				{
					res=res+1;
					{
						if(res==0)
						{
							System.out.println(i);
						}
						else
						{
							res=0;
						}
					}
				}
			}
		}
	}

}
