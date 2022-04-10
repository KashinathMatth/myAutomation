package com.frameshandeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames_deomo {

	public static void main(String[] args) throws
	InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "Library\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//frames
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[contains(text(),'org.openqa.selenium.chromium')]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//a[contains(text(),'ChromiumDriver')]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement frame=driver.findElement(By.name("classFrame"));
		driver.switchTo().frame(frame);
		String content=driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/ul/li/div")).getText();
		System.out.println(content);
		Thread.sleep(2000);
		driver.quit();
		Thread.sleep(500);
		
		

	}

}
