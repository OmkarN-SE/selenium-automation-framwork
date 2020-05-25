package com.reguluit.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reguluit.common.WebDriverFactory;

public class AddEmployee {
	
	@FindBy(id="firstName")
	WebElement userName;
	
	@FindBy(id="middleName")
    WebElement userMiddleName;
	
	@FindBy(id="lastName")
    WebElement userLastName;
	
	@FindBy(id="btnSave")
	WebElement saveButton;
	
	public AddEmployee()
	{
		PageFactory.initElements(WebDriverFactory.dr.get(), this);
	}
	
	public AddEmployee addEmployee(String struserName,String struserMiddleName,String struserLastName)
	{
		userName.sendKeys("Sachin");
		userMiddleName.sendKeys("Ravindra");
		userLastName.sendKeys("Nanaware");
		saveButton.click();
		return this;
	}
}
