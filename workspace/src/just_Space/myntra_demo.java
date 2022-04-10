package just_Space;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class myntra_demo {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "Library\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.google.com/webhp");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("myntra");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@class='x2VHCd OSrXXb qzEoUe']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products, brands and more')]")).sendKeys("t shirts");
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite desktop-iconSearch sprites-search')]")).click();
		Thread.sleep(500);
		


	}

}
