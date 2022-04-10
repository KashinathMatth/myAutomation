package com.sg.filepractice;

import java.io.File;

public class Creation {

	public static void main(String[] args) {
		//createFile();
		//renameFile();
		//deleteFile();
		fileCollections();

	}
	private static void createFile()
	{
		try
		{
			File f1=new File ("F:\\Sample\\Demo\\High.txt");
			f1.createNewFile();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void renameFile()
	{
		try
		{
			File f1=new File("F:\\Sample\\Demo\\High.txt");
			File f2=new File("F:\\Sample\\Demo\\Low.txt");
			f1.renameTo(f2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteFile()
	{
		File f2=new File("F:\\Sample\\Demo\\low.txt");
		f2.delete();
	}
	private static void fileCollections()
	{
		try
		{
			File f1=new File("F:\\Sample\\Demo");
			File f[]=f1.listFiles();
			for(int i=0; i<f.length; i++)
			{
				if(f[i].isFile())
				{
					String s=f[i].getPath();
					System.out.println(s);
				}
			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
