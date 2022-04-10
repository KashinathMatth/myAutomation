package com.sgtesting.returnmethods;
class Sub
{
	int[][] sub1(int a[][],int b[][])
	{
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<a[i].length;k++)
			{
				c[i][k]=a[i][k]-b[i][k];
				
			}
		}
		
		return c;
		
		
	}
}
public class TwoDSubstraction {

	public static void main(String[] args) {
		
		Sub obj=new Sub();
		int a[][]= {{5,6,7,10,11},{9,8,12,15,17}};
		int b[][]= {{2,3,5,4,6},{2,3,5,4,6}};
	    int d[][]=obj.sub1(a, b);
	    
	    for(int k[]:d)
	    {
	    	for(int c:k)
	    	{
	    		System.out.print(c+" ");
	    	}
	    	System.out.println();
	    }
		

	}

}

