package com.cyient.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {
	
	@DataProvider
	public Object[][] validCredentialExcelData() throws IOException
	{
		Object[][] main=ExcelUtils.getSheetIntoObjectArray("src/test/resources/testdata/Data.xlsx", "validCredentialTest");
		return main;
	}
	
	@DataProvider
	public Object[][] validCredentialData() {
		Object[][] main = new Object[1][9];

		main[0][0] = "Mayank";
		main[0][1] = "Mishra";
		main[0][2] = "8871163949";
		main[0][3] = "01-04-1997";
		main[0][4] = "Male";
		main[0][5] = "464770";
		main[0][6] = "Online Store";
		main[0][7] = "mak01mishra@gmail.com";
		main[0][8] = "Mak010101";
		
		return main;}}

