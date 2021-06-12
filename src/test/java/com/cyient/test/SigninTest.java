package com.cyient.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.SigninCredentialPage;
import com.cyient.page.SigninPage;
import com.cyient.utilities.ScreensortUtils;

public class SigninTest extends WebDriverWrapper
{
	@Test
	public void signinEmptyFieldTest() throws Exception 
	{
		
		SigninPage  Signin=new SigninPage (driver);
		Signin.clickOnLogin();
		
		
		SigninCredentialPage  Continue=new SigninCredentialPage(driver);
		
		ScreensortUtils.captureScreenShot(driver,"SignInCredentialPage");
		
		Continue.clickOnContinue();
		
		Assert.assertEquals(Continue.errorMessage(),"Mandatory fields cannot be empty.");
		
		
	}


}
