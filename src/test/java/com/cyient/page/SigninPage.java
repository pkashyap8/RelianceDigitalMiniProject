package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SigninPage 
{
	private By clickLocator = By.id("RIL_HeaderLoginAndMyAccount");
	private By performonCameraLocator = By.xpath("//div[contains(text(),'Cameras')]");
	private By DslrCamerasLocator=By.xpath("(//a[contains(text(),'DSLR Cameras')])[1]");
	
	private WebDriver driver;
	
	public SigninPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnLogin() 
	{
		driver.findElement(clickLocator).click();
		
	}
	
	public void performonCamera() 
	{
		Actions action1=new Actions(driver);
		action1.moveToElement(driver.findElement(performonCameraLocator)).perform();
		
	}
	
	public void clickOnDslrCameras() 
	{
		driver.findElement(DslrCamerasLocator).click();
		
	}


}
