package com.sgtesting.constructorprograms;
class Addition1
{
	Addition1(int a[], int b[])
	{
		for(int i=0; i<a.length; i++)
		{
			int r=a[i]+b[i];
			System.out.println(r+"   ");  
		}
	}
}



public class AdditionDemo {

	public static void main(String[] args) {
		int a[]= {10,20,40};
		int b[]= {50,60,80};
		Addition1 ob1=new Addition1(a,b);
	}

}
