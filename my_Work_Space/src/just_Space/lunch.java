package just_Space;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lunch {

	public static void main(String[] args) 
			throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "Library\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("amazon");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3")).click();
		Thread.sleep(500);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung s22");
		Thread.sleep(500);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Thread.sleep(500);
		driver.quit();
		

	}

}
