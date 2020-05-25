package com.reguluit.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.reguluit.common.WebDriverFactory;

public class AddUserPage {

	@FindBy(id="systemUser_userType") WebElement userRole;
	
	@FindBy(id="systemUser_employeeName_empName") WebElement employeeName;
	
	@FindBy(id="systemUser_userName") WebElement userName;
	
	@FindBy(id="systemUser_status") WebElement userStatus;
	
	@FindBy(id="systemUser_password") WebElement userPassword;
	
	@FindBy(id="systemUser_confirmPassword") WebElement userConfirmPassword;	
	
	@FindBy(id="btnSave") WebElement saveButton;
	
	public AddUserPage()
	{
		PageFactory.initElements(WebDriverFactory.dr.get(),this);
	}
	
	public void addUser(int index,String stremployeeName,String struserName, String struserStatus, String struserPassword,String struserConfirmPassword)
	{
		Select userRoleDropdown=new Select(userRole);
				userRoleDropdown.selectByIndex(index);
				employeeName.sendKeys(stremployeeName);
				userName.sendKeys(struserName);
				Select userStatusDropDown = new Select(userStatus);
				userStatusDropDown.selectByValue(struserStatus);
				userPassword.sendKeys(struserPassword);
				userConfirmPassword.sendKeys(struserConfirmPassword);
				saveButton.click();

	}
}
