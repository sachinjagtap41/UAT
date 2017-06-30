package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.Browser_Factory;
import pages.Login;

public class VerifyLoginPageNew {
	
	@Test
	public void checkValidUser()
	{
		System.setProperty("webdriver.gecko.driver", "C://GeckoDriver//geckodriver.exe");
		
		WebDriver driver= Browser_Factory.startBrowser("firefox", "https://demo.actitime.com/login.do");
		
		Login login_page=PageFactory.initElements(driver, Login.class);
		
		login_page.loginToActitime("admin", "manager");
	}

}
