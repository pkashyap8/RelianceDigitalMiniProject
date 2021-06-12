package com.cyient.test;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base.WebDriverWrapper;
import com.cyient.page.AddToCartItemPage;
import com.cyient.page.AddToCartPage;
import com.cyient.page.DslrCameraPage;
import com.cyient.page.SigninPage;
import com.cyient.utilities.DataProviderUtils;
import com.cyient.utilities.ScreensortUtils;

public class AddToCartTestCase extends WebDriverWrapper
{
	@Test
	public void AddToCartTest() throws Exception 
	{
		SigninPage Dslr=new SigninPage (driver);
		
		ScreensortUtils.captureScreenShot(driver,"LaunchBrowser");
		Dslr.performonCamera();
		Thread.sleep(5000);
		Dslr.clickOnDslrCameras();
		
		
		DslrCameraPage camera=new DslrCameraPage (driver);
		camera.clickOnFirstDslrCameras();
		
		
		
		
		//Tab Change
		String oldTab = driver.getWindowHandle();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		driver.switchTo().window(newTab.get(0));
		
		
		AddToCartPage Cart=new AddToCartPage(driver);
		ScreensortUtils.captureScreenShot(driver,"AddToCart");
		Cart.sendPinNumber("845101");
		Thread.sleep(5000);
		Cart.clickOnAddToCart();
		Thread.sleep(5000);
		
		
		AddToCartItemPage item=new AddToCartItemPage(driver);
		ScreensortUtils.captureScreenShot(driver,"AddToCartItem");
		item.clickOnRemove();
		Thread.sleep(5000);
		item.clickOnAccept();
		
		Assert.assertEquals(item.Message(),"Your Shopping Cart is Empty");
		
		
		
		
	
		}


	}

