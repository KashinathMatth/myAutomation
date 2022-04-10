package just_Space;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_xpath {

	public static void main(String[] args) 
			throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Library\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//name
		driver.findElement(By.name("q")).sendKeys("flipkart");
		Thread.sleep(500);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(500);
		//x_path
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(500);
		//css selector
		driver.findElement(By.cssSelector("#container > div > div._331-kn._2tvxW > div > div > div:nth-child(3) > a > div._1mkliO > div > img")).click();
		Thread.sleep(500);
		

	}

}
