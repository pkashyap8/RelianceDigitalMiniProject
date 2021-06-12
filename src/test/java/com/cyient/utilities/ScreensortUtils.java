package com.cyient.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreensortUtils 
{
	public static void captureScreenShot(WebDriver driver, String screensortName) throws Exception
	{
		TakesScreenshot screensort=(TakesScreenshot)driver;
		File source=screensort.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(source, new File("./screensort/"+screensortName+".png"));
		System.out.println("Screensort taken");
	}



}
