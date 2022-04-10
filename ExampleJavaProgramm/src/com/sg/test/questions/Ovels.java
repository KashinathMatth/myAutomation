package com.sg.test.questions;
class Owels
{
	boolean vowel (char ch)
	{
		boolean vowel;
		switch (ch)
		{
		case 'a': case 'e': case 'i': case'o': case 'u':
			vowel = true;
             break;
             default:
             vowel = false;
		}
		return vowel;
	}
}

public class Ovels {

	public static void main(String[] args) {
		Owels obj=new Owels();
		char a='u';
		boolean val=obj.vowel(a);
		System.out.println(val);
		

	}

}
