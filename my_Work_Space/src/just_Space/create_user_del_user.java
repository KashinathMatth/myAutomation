package just_Space;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class create_user_del_user {

	public static void main(String[] args)
			
			throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Library\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//navigate
		driver.navigate().to("http://localhost:81/login.do");
		driver.manage().window().maximize();
		Thread.sleep(500);
		//log in
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(500);
        driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
        Thread.sleep(500);
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(500);
        
        //create user
        driver.findElement(By.linkText("USERS")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@id='gettingStartedShortcutsPanelId']")).click();
        Thread.sleep(500);
        driver.findElement(By.className("buttonText")).click();
        Thread.sleep(500);
        driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("kashi");
        Thread.sleep(500);
        driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("matth");
        Thread.sleep(500);
        driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("kk@gmail.com");
        Thread.sleep(500);
        driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("kashinath");
        Thread.sleep(500);
        driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("kk123456");
        Thread.sleep(500);
        driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("kk123456");
        Thread.sleep(500);
        driver.findElement(By.className("buttonTitle")).click();
        Thread.sleep(500);
        
        //delete user
        driver.findElement(By.xpath("//span[@class='userNameSpan']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//button[contains(text(),'Delete User')]")).click();
        Thread.sleep(500);
        
        Alert oAlert=driver.switchTo().alert();
        String strContent=oAlert.getText();
        oAlert.accept();
        Thread.sleep(500);
        
        //create task
        driver.findElement(By.xpath("//div[contains(text(),'TASKS')]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[contains(text(),'Add New')]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name']")).sendKeys("Modi king");
        Thread.sleep(500);
        driver.findElement(By.xpath("//textarea[@placeholder='Add Customer Description']")).sendKeys("Sunil isb chutya");
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Create Customer')]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[contains(@class,'node allCustomersNode selected')]")).click();
        Thread.sleep(500);
	}

}
