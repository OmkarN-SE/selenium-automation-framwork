package com.reguluit.test;

import org.testng.annotations.Test;

import com.reguluit.common.BaseTest;
import com.reguluit.page.AddEmployee;
import com.reguluit.page.HomePage;
import com.reguluit.page.LoginPage;
import com.reguluit.page.PIMPage;

public class AddNewEmployee extends BaseTest {
	@Test
	public void addEmployee()
	{
		LoginPage lp=new LoginPage();
		lp.navigateToLoginPage();
		lp.login("OmkarN", "Omkar@123");
		
		HomePage hp=new HomePage();
		hp.verifyWelcomeText("Welcome Admin");
		hp.navigatePIMUserPage();
		
		PIMPage pp=new PIMPage();
		pp.navigateTOAddEmployee();
		
		AddEmployee ae=new AddEmployee();
		ae.addEmployee("Sam", "Jack","Tester");
		
		
		
	}
}
