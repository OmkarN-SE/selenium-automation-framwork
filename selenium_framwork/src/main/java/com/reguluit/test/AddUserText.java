package com.reguluit.test;
import org.testng.annotations.Test;

import com.reguluit.common.BaseTest;
import com.reguluit.page.AddUserPage;
import com.reguluit.page.AdminPage;
import com.reguluit.page.HomePage;
import com.reguluit.page.LoginPage;


public class AddUserText extends BaseTest {
	@Test
    public void verifyAddUserTest()
    {
		LoginPage lp=new LoginPage();//Step-1Launch Browser
		lp.navigateToLoginPage()
		  .login("OmkarN","Omkar@123")//Step-2: Login
		  	.verifyWelcomeText("Welcome Admin")//Step-3: Verify Admin Login Text
				.navigateAdminPage()//Step - 4: Click on Admin Button
					.navigateToAdminPage()   //Step-5: Click on Add User Button
						.addUser(0,"SachinS","Sachin","Enabled","Pass@123","Pass@123");//Step-6:Add User Details
							
}
   /* @Test
    public void verifyAddUser()
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
    	WebDriver dr=new ChromeDriver();
    	dr.manage().window().maximize();
    	dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login/");
    	
    	WebElement userName=dr.findElement(By.xpath("//input[@id='txtUsername']"));
    	userName.sendKeys("OmkarN");
    	WebElement userPassword=dr.findElement(By.xpath("//input[@id='txtPassword']"));
    	userPassword.sendKeys("Omkar@123");
    	
    	WebElement userLogin=dr.findElement(By.xpath("//input[@id='btnLogin']"));
    	userLogin.click();
    	WebElement Admin=dr.findElement(By.id("menu_admin_viewAdminModule"));
    	Admin.click();
    	WebElement buttonAdd=dr.findElement(By.name("btnAdd"));
    	buttonAdd.click();
    	
    	WebElement empRole=dr.findElement(By.xpath("//select[@id='systemUser_userType']"));
		Select userRoleDropDown=new Select(empRole);
		userRoleDropDown.selectByVisibleText("Admin");
    	
    	WebElement empName=dr.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']"));
    	empName.sendKeys("tester");
    	WebElement empUname=dr.findElement(By.xpath("//input[@id='systemUser_userName']"));
    	empUname.sendKeys("");
    	WebElement empPassword=dr.findElement(By.xpath("//input[@id='systemUser_password']"));
    	empPassword.sendKeys("Pass@123");
    	WebElement empConfirmpassword=dr.findElement(By.xpath("//input[@id='systemUser_confirmPassword']"));
    	empConfirmpassword.sendKeys("Pass@123");
    	
    	WebElement empSave=dr.findElement(By.xpath("//input[@id='btnSave']"));
    	empSave.click();
    	
    	WebElement invalidUname=dr.findElement(By.xpath("//span[@class='systemUser_confirmPassword']"));
		boolean status=invalidUname.isDisplayed();
		if(status==true)
			System.out.println("Invalid Confirm Password.TEST CASE IS PASS");
		else
			System.out.println("TEST CASE IS FAIL");
		dr.close();
		   	
}*/
}