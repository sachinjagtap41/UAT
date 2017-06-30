package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pages.LoginPage;

public class VerifyLoginPage {
	
	@Test
	public void verifyLoginPageActitime() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C://GeckoDriver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(4000L);
		LoginPage login=new LoginPage(driver);
		login.loginToActitime("admin" ,"manager");
		login.clickLoginButton();
		//login.testCheckBox();
		//login.testCheckBoxText();
		//login.clickForgotPasswordLink();
		driver.quit();
	}

}
