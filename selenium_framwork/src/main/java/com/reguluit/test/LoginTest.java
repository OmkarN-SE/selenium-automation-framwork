package com.reguluit.test;
import org.testng.annotations.Test;

import com.reguluit.common.BaseTest;
import com.reguluit.page.HomePage;
import com.reguluit.page.LoginPage;

public class LoginTest extends BaseTest
	{
			@Test(dataProvider="excelData")
			public void verifyAdminLoginSuccessfull()
			{
			  LoginPage lp=new LoginPage();
			  lp.navigateToLoginPage();
			  lp.printLinks();
			  lp.login("OmkarN","Omkar@123");
				
			  HomePage hp=new HomePage();
			  hp.verifyWelcomeText("Welcome Admin");
			}
			/*
			@Test
			public void verifyUserPassword()
			{
				//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
				//WebDriver dr=new ChromeDriver();
				//beforeEveryTestMethod();
				WebDriverFactory.dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login/");
				
				
				WebElement userName=WebDriverFactory.dr.findElement(By.id("txtUsername"));
				userName.sendKeys("OmkarN");
				
				WebElement userPassword=WebDriverFactory.dr.findElement(By.id("txtPassword"));
				userPassword.sendKeys("");
				
				WebElement loginButton=WebDriverFactory.dr.findElement(By.id("btnLogin"));
				loginButton.click();
				
				 WebElement welcomeText=WebDriverFactory.dr.findElement(By.xpath("//span[@id='spanMessage']"));
					
				boolean status=welcomeText.isDisplayed();
				Assert.assertEquals(status, true);
				//afterEveryTestMethod();
				//dr.quit();
			}*/
			/*
			@Test(enabled=false,priority=1)
			public void verifyUserName()
			{
				//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
				//WebDriver dr=new ChromeDriver();
				//beforeEveryTestMethod();
				WebDriverFactory.dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login/");
				
				WebElement userName=WebDriverFactory.dr.findElement(By.id("txtUsername"));
				userName.sendKeys("OmkarN234");
				
				WebElement userPassword=WebDriverFactory.dr.findElement(By.id("txtPassword"));
				userPassword.sendKeys("Omkar@123");
				
				WebElement loginButton=WebDriverFactory.dr.findElement(By.id("btnLogin"));
				loginButton.click();
				
				 WebElement welcomeText=WebDriverFactory.dr.findElement(By.xpath("//span[@id='spanMessage']"));
					
				boolean status=welcomeText.isDisplayed();
				Assert.assertEquals(status, true);
				//afterEveryTestMethod();
				//dr.quit();
			}*/
/*
			@Test
			public void verifyUName()
			{
				//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
				//WebDriver dr=new ChromeDriver();
				//beforeEveryTestMethod();
				WebDriverFactory.dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login/");
				
				WebElement userName=WebDriverFactory.dr.findElement(By.id("txtUsername"));
				userName.sendKeys("");
				
				WebElement userPassword=WebDriverFactory.dr.findElement(By.id("txtPassword"));
				userPassword.sendKeys("Omkar@123");
				
				WebElement loginButton=WebDriverFactory.dr.findElement(By.id("btnLogin"));
				loginButton.click();
				
				 WebElement welcomeText=WebDriverFactory.dr.findElement(By.xpath("//span[@id='spanMessage']"));
					
				boolean status=welcomeText.isDisplayed();
				Assert.assertEquals(status, true);
				//afterEveryTestMethod();
				//dr.quit();
			}*/

			/*
			@Test
			public void verifyUserNamePassword()
			{
				//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
				//WebDriver dr=new ChromeDriver();
				//beforeEveryTestMethod();
				WebDriverFactory.dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login/");
				
				WebElement userName=WebDriverFactory.dr.findElement(By.id("txtUsername"));
				userName.sendKeys("");
				
				WebElement userPassword=WebDriverFactory.dr.findElement(By.id("txtPassword"));
				userPassword.sendKeys("");
				
				WebElement loginButton=WebDriverFactory.dr.findElement(By.id("btnLogin"));
				loginButton.click();
				
				 WebElement welcomeText=WebDriverFactory.dr.findElement(By.xpath("//span[@id='spanMessage']"));
					
				boolean status=welcomeText.isDisplayed();
				Assert.assertEquals(status, true);
				//afterEveryTestMethod();
				//dr.quit();
			}*/
			/*
			@Test
			public void verifyPassword()
			{
				//System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
				//WebDriver dr=new ChromeDriver();
				//beforeEveryTestMethod();
				WebDriverFactory.dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login/");
				
				WebElement userName=WebDriverFactory.dr.findElement(By.id("txtUsername"));
				userName.sendKeys("OmkarN");
				
				WebElement userPassword=WebDriverFactory.dr.findElement(By.id("txtPassword"));
				userPassword.sendKeys("Pass");
				
				WebElement loginButton=WebDriverFactory.dr.findElement(By.id("btnLogin"));
				loginButton.click();
				
				 WebElement welcomeText=WebDriverFactory.dr.findElement(By.xpath("//span[@id='spanMessage']"));
					
				boolean status=welcomeText.isDisplayed();
				Assert.assertEquals(status, true);
				//afterEveryTestMethod();
				//dr.quit();
			}*/
		}

	