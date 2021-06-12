package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DslrCameraPage 
{
	private WebDriver driver;
	private By FirstDslrCamerasLocator=By.xpath("//*[contains(text(),'Canon EOS 200')]");
	
	public DslrCameraPage (WebDriver driver)
	{
		this.driver=driver;
	}

	public void clickOnFirstDslrCameras() 
	{
		driver.findElement(FirstDslrCamerasLocator).click();
		
	}

}
