package com.reguluit.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reguluit.common.WebDriverFactory;

public class PIMPage {
	
	@FindBy(id="btnAdd")
	WebElement addButton;
	
	public PIMPage()
	{
		PageFactory.initElements(WebDriverFactory.dr.get(),this);
	}

	public AddEmployee navigateTOAddEmployee()
	{
		addButton.click();
		return new AddEmployee();
	}
}
