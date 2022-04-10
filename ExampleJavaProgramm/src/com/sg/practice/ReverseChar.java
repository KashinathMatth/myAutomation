package com.sg.practice;

public class ReverseChar {
		 public void reverseWordInMyString(String str)
		   {
			String[] words = str.split(" ");
			String reversedString = "";
			for (int i = 0; i < words.length; i++)
		        {
		           String word = words[i]; 
		           String reverseWord = "";
		           for (int j = word.length()-1; j >= 0; j--) 
			   {
				reverseWord = reverseWord + word.charAt(j);
			   }
			   reversedString = reversedString + reverseWord + " ";
			}
			System.out.println(str);
			System.out.println(reversedString);
		   }
		   public static void main(String[] args) 
		   {
			   ReverseChar obj = new ReverseChar();
			obj.reverseWordInMyString("The temple is at the top of the hill");
		
		   }
		}

