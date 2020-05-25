package com.reguluit.common;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedMethodListenerImpl implements IInvokedMethodListener {

	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		WebDriverFactory.dr.get().close();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		 //WebDriverFactory.dr.set(new ChromeDriver());
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("Chrome");
		capabilities.setVersion("72");
		capabilities.setPlatform(Platform.WINDOWS);
		
		// TODO Auto-generated method stub
		
	}

}
