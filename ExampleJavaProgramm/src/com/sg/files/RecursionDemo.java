package com.sg.files;

import java.io.File;

public class RecursionDemo {
	private static void getFolderTree(File f2) {

		File f[]=f2.listFiles();
		for(int i=0;i<f.length;i++)
		{
			if(f[i].isDirectory())
			{
				String s=f[i].getPath();
				System.out.println(s);
				getFolderTree(f[i]);
			}else if(f[i].isFile())
			{
				String s=f[i].getPath();
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) {
		File f1=new File("F:\\EXAMPLE");
		getFolderTree(f1);
	}

}
