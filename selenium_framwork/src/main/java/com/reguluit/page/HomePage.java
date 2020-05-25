package com.reguluit.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.reguluit.common.WebDriverFactory;

public class HomePage {
	@FindBy(id="welcome")
	WebElement WelcomeText;
	
	@FindBy(id="menu_pim_viewPimModule")
	WebElement PIM;
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement adminButton;

	
	public HomePage()
	{
		PageFactory.initElements(WebDriverFactory.dr.get(), this);
	}
	
	public HomePage verifyWelcomeText(String expectedWelcomeText)
	{
		Assert.assertEquals(WelcomeText.getText(), expectedWelcomeText);
		return this;
	}
	
	public PIMPage navigatePIMUserPage()
	{
		PIM.click();
		return new PIMPage();
	}
	
	public AdminPage navigateAdminPage()
	{
		adminButton.click();
		return new AdminPage();
	}
	
 
}
