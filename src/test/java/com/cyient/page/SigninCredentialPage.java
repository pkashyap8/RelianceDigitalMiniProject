package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SigninCredentialPage
{
	private By continueLocator = By.xpath("//span[contains(text(),'Continue')]");
	private By errorMessageLocator=By.xpath("//div[contains(text(),'Mandatory')][1]");
	private By registerLocator=By.xpath("//span[contains(text(),'Register')]");
private WebDriver driver;
	
	public SigninCredentialPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnContinue() 
	{
		driver.findElement(continueLocator).click();
		
	}
	
	public String errorMessage() 
	{
		return driver.findElement(errorMessageLocator).getText().trim();
		
	}
	
	public void clickOnregister() 
	{
		driver.findElement(registerLocator).click();
		
	}
}
