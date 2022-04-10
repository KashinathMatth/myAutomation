package com.sg.files;

import java.io.File;

public class AssinFolders {
	public static void main(String[] args) {
		txtfilespath();
		System.out.println("***************");
		CheckRightPermission();
		System.out.println("***************");
		CheckExecutePermission();
		System.out.println("***************");
		rename();
		System.out.println("****************");
		deletefiles();
	}
	private static void txtfilespath()
	{
		try
		{
			File f1=new File("D:\\EXAMPLE\\IOFolder");
			File f[]=f1.listFiles();
			for(int i=0;i<f.length;i++)
			{
				if(f[i].isFile() )

				{
					if(f[i].getName().endsWith(".txt")){
						String s=f[i].getPath();
						System.out.println(s);

					}
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CheckRightPermission() {
		try
		{
			File f1=new File("D:\\EXAMPLE\\IOFolder");
			File f[]=f1.listFiles();
			for(int i=0;i<f.length;i++)
			{
				if(f[i].isFile() )

				{
					if(f[i].getName().endsWith(".xlsx")){
						boolean b=f[i].canWrite();
						System.out.println(f[i].getName()+" is having wirte permission :"+b);

					}
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CheckExecutePermission() {
		try
		{
			File f1=new File("D:\\EXAMPLE\\IOFolder");
			File f[]=f1.listFiles();
			for(int i=0;i<f.length;i++)
			{
				if(f[i].isFile() )

				{
					if(f[i].getName().endsWith(".docx")){
						boolean b=f[i].canWrite();
						System.out.println(f[i].getName()+" is having wirte permission ? :"+b);

					}
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void rename() {
		try
		{
			File f1=new File("D:\\EXAMPLE\\IOFolder");
			File f[]=f1.listFiles();
			for(int i=0;i<f.length;i++)
			{
				if(f[i].isFile() )

				{
					if(f[i].getName().endsWith(".txt")){

						String dir=f[i].getParent();
						File f2=new File(dir+"\\sample"+i+".txt");
						f[i].renameTo(f2);

						System.out.println("New Name:"+f[i].getName());

					}
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletefiles() {
		try
		{
			File f1=new File("D:\\EXAMPLE\\IOFolder");
			File f[]=f1.listFiles();
			for(int i=0;i<f.length;i++)
			{
				if(f[i].isFile() )

				{
					if(f[i].getName().endsWith(".png")){

						String dir=f[i].getName();
						f[i].delete();
						boolean b=f[i].exists();

						System.out.println(dir+"is exists : "+b);

					}
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
