package com.sg.practice;

public class NoOfWords {

	public static void main(String[] args) {
        String s = "welcome to Prabhakar in SG Testing";
 
        int count = 1;
 
        for (int i = 0; i < s.length() - 1; i++)
        {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);
    }
}
		

	
