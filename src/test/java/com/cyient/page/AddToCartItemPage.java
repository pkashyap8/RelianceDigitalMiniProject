package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartItemPage
{
	private By RemoveLocator=By.xpath("//span[contains(text(),'Remove')]");
	private By AcceptLocator=By.xpath("(//button[@ theme='primary'])[1]");
	private By MessageLocator=By.xpath("//*[contains(text(),'Your')]");
	private WebDriver driver;
	
	public AddToCartItemPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnRemove() 
	{
		driver.findElement(RemoveLocator).click();
	}
	
	public void clickOnAccept() 
	{
		driver.findElement(AcceptLocator).click();
	}
	
	public String Message() 
	{
		return driver.findElement(MessageLocator).getText().trim();
		
	}
}
