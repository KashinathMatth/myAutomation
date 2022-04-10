package just_Space;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class x_Path_Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Library\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("amazon");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/input[@class='gNO89b']")).click();
		Thread.sleep(1000);
	}

}
