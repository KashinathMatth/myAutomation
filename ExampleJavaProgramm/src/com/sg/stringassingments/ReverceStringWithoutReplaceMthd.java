package com.sg.stringassingments;

import java.util.regex.Pattern;

public class ReverceStringWithoutReplaceMthd {
	
	 static String reverseWords(String str)
	    {
	  
		 
	        Pattern pattern = Pattern.compile("\\s");
	  
		 
	        String[] temp = pattern.split(str);
	        String result = "";
	  
	      
	        for (int i = 0; i < temp.length; i++) 
	        {
	            if (i == temp.length - 1)
	                result = temp[i] + result;
	            else
	                result = " " + temp[i] + result;
	        }
	        return result;
	    }
	  
	    
	    public static void main(String[] args)
	    {
	        String s1 = "Bangaluru Mysore";
	        System.out.println(reverseWords(s1));
	  
	        String s2 = "Sunil Kiccha";
	        System.out.println(reverseWords(s2));
	    }
	}

