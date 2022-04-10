package com.sgtesting.methods;
class Decending {
	void Sort2(int a[]) {
		int res=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(a[j]<a[i]) {
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

public class Decend {

	public static void main(String[] args) {
		int arr[]= {1,9,4,7,3};
		Decending o=new Decending();
		o.Sort2(arr);
	}
}

