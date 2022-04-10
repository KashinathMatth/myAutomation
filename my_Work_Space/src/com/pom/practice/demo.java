package com.pom.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) 
			throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "Library\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		pom_script kpage = new pom_script(driver);

		driver.navigate().to("http://localhost:81/login.do");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//user name and password:
		kpage.getUname().sendKeys("admin");
		Thread.sleep(500);
		kpage.getpword().sendKeys("manager");
		Thread.sleep(500);
		kpage.getclic().click();
		Thread.sleep(500);
		kpage.getminimize().click();
		Thread.sleep(500);
		
		//craete Task
		kpage.gettask().click();
		Thread.sleep(500);
		kpage.getadd().click();
		Thread.sleep(500);
		kpage.getadd2().click();
		Thread.sleep(500);
		
		
        

	}

}
