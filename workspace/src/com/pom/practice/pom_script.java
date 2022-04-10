package com.pom.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_script {
	public pom_script (WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}
	
	//user name and password
	private WebElement username;
	public WebElement getUname()
	{
		return username;
	}
	@FindBy (xpath="//input[@name='pwd']")
	private WebElement pwd;
	public WebElement getpword()
	{
		return pwd;
	}
	@FindBy (xpath="//div[contains(text(),'Login')]")
	private WebElement clickbutton;
	public WebElement getclic()
	{
		return clickbutton;
	}
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getminimize()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//task Scripts
	@FindBy (xpath="//div[text()='TASKS']")
	private WebElement task;
	public WebElement gettask()
	{
		return task;	
	}
	@FindBy (xpath="//div[contains(text(),'Add New Task')]")
	private WebElement add;
	public WebElement getadd()
	{
		return add;
	}
	@FindBy (xpath="//div[contains(@class,'item createNewTask ellipsis')]")
	private WebElement add2;
	public WebElement getadd2()
	{
		return add2;
	}

}
