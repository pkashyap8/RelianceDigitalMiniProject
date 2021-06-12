package com.cyient.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.RegisterPage;
import com.cyient.page.SigninCredentialPage;
import com.cyient.page.SigninPage;
import com.cyient.utilities.DataProviderUtils;
import com.cyient.utilities.ScreensortUtils;

public class SignupTestCase extends WebDriverWrapper
{
	@Test(dataProvider="userExcelData",dataProviderClass=DataProviderUtils.class)
	public void signupTest(String firstName, String lastName,String email, String password,String cPassword, String mobileNumber) throws Exception 
	{
		SigninPage  Signin=new SigninPage (driver);
		Signin.clickOnLogin();
		Thread.sleep(10000);
		SigninCredentialPage  Register=new SigninCredentialPage(driver);
		Register.clickOnregister();
		
		ScreensortUtils.captureScreenShot(driver,"RegisterPage");
		
		RegisterPage Register1=new RegisterPage(driver);
		Register1.sendFirstName(firstName);
		Register1.sendLirstName(lastName);
		Register1.sendEmail(email);
		Register1.sendPassword(password);
		Register1.sendconfirmPassword(cPassword);
		Register1.sendMobileNumber(mobileNumber);
		Register1.clickOnGenerateOtp();
		
		ScreensortUtils.captureScreenShot(driver,"RegisterPageAfterFilled");
		
		Assert.assertEquals(Register1.errorMessage(),"Please agree to the terms and conditions");
		System.out.println(Register1.errorMessage());
		
		
		
	}
}
