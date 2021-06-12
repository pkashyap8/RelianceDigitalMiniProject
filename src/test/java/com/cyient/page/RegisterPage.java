package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage 
{
	private By FirstNameLocator=By.id("fname");
	private By LastNameLocator=By.id("lname");
	private By EmailLocator=By.id("email");
	private By PasswordLocator=By.id("password");
	private By ConfirmPasswordLocator=By.id("cpassword");
	private By MobileNumberLocator=By.id("mnumber");
	private By GenerateOtpLocator=By.xpath("//span[contains(text(),'Generate')]");
	private By ErrorMsgLocator=By.xpath("//*[contains(text(),'Please')]");
	private WebDriver driver;
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void sendFirstName(String firstName) 
	{
		driver.findElement(By.id("fname")).sendKeys(firstName);
	}
	
	public void sendLirstName(String lastName) 
	{
		driver.findElement(LastNameLocator).sendKeys(lastName);
	}
	
	public void sendEmail(String email) 
	{
		driver.findElement(EmailLocator).sendKeys(email);
	}
	
	public void sendPassword(String password) 
	{
		driver.findElement(PasswordLocator).sendKeys(password);
	}
	
	public void sendconfirmPassword(String confirmPassword) 
	{
		driver.findElement(ConfirmPasswordLocator).sendKeys(confirmPassword);
	}
	
	public void sendMobileNumber(String mobileNumber) 
	{
		driver.findElement(MobileNumberLocator).sendKeys(mobileNumber);
	}
	
	public void clickOnGenerateOtp() 
	{
		driver.findElement(GenerateOtpLocator).click();
	}
	
	public String errorMessage() 
	{
		return driver.findElement(ErrorMsgLocator).getText().trim();
		
		
	}

}
