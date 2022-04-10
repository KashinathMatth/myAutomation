package com.sgtesting.methods;
class MultiMatrix{
	void multy(int a[][],int b[][]) {
		
		int c[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=0;
				for(int k=0;k<3;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		displayMatrix(c);
	}
	void displayMatrix(int a[][]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}


public class MatrixMultiplication {

	public static void main(String[] args) {
		int a[][]= {{1,1,2},{2,5,6},{8,9,7}};
		int b[][]= {{1,1,2},{2,5,6},{8,9,7}};
		MultiMatrix o=new MultiMatrix();
		o.multy(a,b);
		
	}

}
