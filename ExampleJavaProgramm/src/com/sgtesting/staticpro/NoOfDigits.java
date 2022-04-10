package com.sgtesting.staticpro;
class NoOfDigitss
{
	static int getDigit(int num)
	{
		int digcount=0;
		while(num>0)
		{
			digcount++;
			num=num/10;
		}
		return digcount; 
	}
}

public class NoOfDigits {

	public static void main(String[] args) {
		int num=789456123;
		int val=NoOfDigitss.getDigit(num);
		System.out.println("number of digits in"+num+"is"+val);
	

	}

}
