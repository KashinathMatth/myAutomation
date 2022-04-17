package com.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_dismiss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Library\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//click
		driver.findElement(By.xpath("//button[contains(@onclick,'jsConfirm()')]")).click();
		Thread.sleep(200);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		//getText
		driver.findElement(By.xpath("//button[contains(@onclick,'jsPrompt()')]")).click();
		Thread.sleep(500);
		Alert window=driver.switchTo().alert();
		String s=window.getText();
		System.out.println(s);
		window.sendKeys("Kiccha Sudeep");
		Thread.sleep(5000);
		window.accept();
		

	}

}
