package com.sgtesting.staticpro;
class Msse
{
	static int  getMissed()
	{
		int arr[]= {1,2,3,4,6,7,8,9,10};
		int n=arr.length+1;
		int sum=(n* (n+1))/2;
		for(int i=0; i<arr.length;i++)
		{
			sum=sum-arr[i];
		}
		return sum;
	}
}

public class Missu {

	public static void main(String[] args) {
		int v=Msse.getMissed();
		System.out.println(v);
		
	}

}
