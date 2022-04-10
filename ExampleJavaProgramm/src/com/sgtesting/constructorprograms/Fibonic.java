package com.sgtesting.constructorprograms;
class Feb
{
	Feb (int a)
	{
		int b[] =new int [10];
		for(int i=0; i<10; i++)
		{
			if(i==0)
			{
				b[i]=i;
				System.out.println(b[i]);			
			}
			else if(i==1)
			{
				b[i]=i;
				System.out.println(b[i]);
			}
			else
			{
				b[i]=b[i-1]+b[i-2];
				System.out.println(b[i]);
			}
		}
	}
}

public class Fibonic {

	public static void main(String[] args) {
		Feb oj1=new Feb (0);
	}

}

