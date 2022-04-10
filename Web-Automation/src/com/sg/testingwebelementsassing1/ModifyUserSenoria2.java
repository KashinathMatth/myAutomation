package com.sg.testingwebelementsassing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUserSenoria2 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		launchBrowser();

	}
	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver(); 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:81/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimize()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Kiccha");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("Sudeep");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("kich@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("Kashinath");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("123456");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123456");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
