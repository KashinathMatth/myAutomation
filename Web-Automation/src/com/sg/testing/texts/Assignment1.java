package com.sg.testing.texts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Assignment1
{
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser();
		modifiuser();
		//deleteuser();
		//logout();
		//closeApplication();

	}
	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");	
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Drivers\\chromedriver.exe");
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
			oBrowser.findElement(By.linkText("Login")).click();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
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

	private static void createuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Demo");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("user1@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("12345");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(1000);



		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifiuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("User2");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Demo2");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("user2@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("12345");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String strContent=oAlert.getText();
			System.out.println(strContent);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
