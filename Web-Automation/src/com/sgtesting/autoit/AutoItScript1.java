package com.sgtesting.autoit;

public class AutoItScript1 {

	public static void main(String[] args) {
		excicuteAutoIt();

	}
	private static void excicuteAutoIt() {
		try
		{
			Runtime.getRuntime().exec("D:\\ExampleAutomation\\AutoIT\\ExampleAutoItScript2.exe");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
