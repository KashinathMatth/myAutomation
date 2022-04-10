package com.sg.filepractice;

import java.io.File;

public class FoldersCreation {

	public static void main(String[] args) {
		//createFloder();
		//createNestedFolder();
		renameFolder();
		//deleteFolder();

	}
	private static void createFloder()
	{
		File f1=new File("F:\\Kiccha\\Legend\\Cinema");
		f1.mkdir();
	}
	private static void createNestedFolder()
	{
		File f1=new File("F:\\Kiccha\\Legend\\Cinema\\Kotigobba\\Manikya\\Ranna\\VK Rona");
		f1.mkdirs();
	}
	private static void renameFolder()
	{
		File f1=new File("F:\\Kiccha\\Legend\\Kotigobba");
		File f2=new File("F:\\Kiccha\\Legend\\Kashinath");
		f1.renameTo(f2);
	}
	private static void deleteFolder()
	{
		File f1=new File("F:\\Kiccha\\Legend\\Cinema\\Ranna");
		File f2=new File("F:\\Kiccha\\Legend\\Cinema\\Ranna");
		f2.delete();
		
	}

}
