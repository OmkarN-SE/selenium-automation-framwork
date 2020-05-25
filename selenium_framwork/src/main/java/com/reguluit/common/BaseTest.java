package com.reguluit.common;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

@Listeners(IInvokedMethodListenerImpl.class)
public class BaseTest
{
	@DataProvider(name="excelData")
	public String[][] getExcelData() throws Exception
	{
		String fileName="C:\\Users\\omnan\\eclipse-workspace\\selenium_framwork\\src\\main\\java\\com\\reguluit\\page\\LoginTest.xlsx";
		return ExcelReader.getExcelTableArray(fileName, "verifyAdminLogin");
		
	}
	//WebDriver dr; /*<Global variable.....><Global Scope>*/
	/*@BeforeTest
	public void beforeEveryTestMethod()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		 dr=new ChromeDriver();
		
		
	}*/
	/*@AfterTest
	public void afterEveryTestMethod()
	{
		dr.close();
	}*/
	

}
