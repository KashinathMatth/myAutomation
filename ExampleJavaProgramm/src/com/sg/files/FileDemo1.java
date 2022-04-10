package com.sg.files;

import java.io.File;

public class FileDemo1 {
	public static void main (String args[]) {

		createFolder();
		createNestedFolder();
	

	}
	private static void createFolder()
	{
		File f1=new File("F:\\Sample\\Demo\\God");
		f1.mkdir();
	}
	private static void createNestedFolder()
	{
		File f1=new File("F:\\Sample\\Demo\\God\\Krishna\\Ganesh\\Shiva\\Hanuman\\");
		f1.mkdirs();
	}

	private static void folderCollections()
	{
		try
		{
			File f1=new File("F:\\Sample\\Demo");
			File f[]=f1.listFiles();
			for(int i=0;i<f.length;i++)
			{
				if(f[i].isDirectory())
				{
					String s=f[i].getPath();
					System.out.println(s);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

