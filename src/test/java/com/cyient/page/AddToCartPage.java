package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage 
{
	private WebDriver driver;
	private By PinCodeLocator=By.id("RIL_PDPInputPincode");
	private By clickOnAddToCartLocator=By.xpath("//button[@id='add_to_cart_main_btn']");
	
	
	public AddToCartPage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public  void sendPinNumber(String pinNumber) 
	{
		driver.findElement(PinCodeLocator).sendKeys(pinNumber);
		
	}
	
	public void clickOnAddToCart() 
	{
		driver.findElement(clickOnAddToCartLocator).click();
	}
}
