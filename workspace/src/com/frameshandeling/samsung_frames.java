package com.frameshandeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class samsung_frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Library\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
		driver.manage().window().maximize();
		Thread.sleep(500);

		//frames
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[contains(text(),'Beginners Guide')]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		


	}

}
