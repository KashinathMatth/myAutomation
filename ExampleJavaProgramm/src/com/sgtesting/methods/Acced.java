package com.sgtesting.methods;
class Accending {
	void Sort(int a[]) {
		int res=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(a[j]>a[i]) {
					res=a[i];
					a[i]=a[j];
					a[j]=res;
				}
			}
		}
		displayArray(a);
	}

	void displayArray(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" ");
		}
	}
}

public class Acced {

	public static void main(String[] args) {
		int arr[]= {1,9,4,7,3};
		Accending o=new Accending();
		o.Sort(arr);
	}
}

