package com.sg.files;

import java.io.File;

public class WithoutUsingMkdirs {
	public static void main(String[] args) {
		try
		{
			String s ="F:\\Greek\\zeus";
			File f1=new File(s);
			f1.mkdir();
			for(int i=0;i<5;i++)
			{
				s=s+"\\sons"+i;

				File f2=new File(s);
				f2.mkdir();
			}


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
