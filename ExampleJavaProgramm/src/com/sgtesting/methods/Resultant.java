package com.sgtesting.methods;
class ResultantArray
{
	void find(int a[],int b[]) {
		int c[]=new int[a.length+b.length];
		int index=0;
		for(int i=0; i<a.length; i++) {
			c[index]=a[i];
			index++;
		}
		for(int i=0;i<b.length;i++) {
			c[index]=b[i];
			index++;
		}
		displayArray(c);
	}
	void displayArray(int a[]) {
		for(int i=0;i<a.length; i++) {
			System.out.println(a[i]+"  ");
		}
	}
}

public class Resultant {

	public static void main(String[] args) {
		int a[]= {2,3,4,5};
		int v[]= {4,6,7};
		ResultantArray o1=new ResultantArray();
		o1.find(a, v);
	}

}
