package com.cyient.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderUtils 
{
	@DataProvider
	public Object [][] userExcelData() throws IOException
	{
		Object[][] main= ExcelUtils.getSheetIntoObjectArray("src/test/resources/testdata/RelianceApplication.xlsx", "ValidUserTestData");
		return main;
		
	}
}
