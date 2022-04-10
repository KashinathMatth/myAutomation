package com.sg.streamassign;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileReader;
public class Assin1 {

	public static void main(String[] args) {
		
			readContent();
		}

		private static void readContent()
		{
			BufferedReader br=null;
			int count=0;
			try
			{
				br=new BufferedReader(new FileReader("F:\\Sample1\\Demo\\Test1.txt"));
				String sLine=null;
				
				while((sLine=br.readLine())!=null)
				{
					count++;
					System.out.println(sLine);
										
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
			finally
			{
				try
				{
					br.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			System.out.println("-----------------------------------------------------------------");	
			System.out.println("Number  of lines:"+count);
		}
	}



	
