package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	By username=By.id("username");
	By pwd=By.name("pwd");
	By LoginButton=By.id("loginButton");
	By KeepMeLoggedInCheckBox=By.id("keepLoggedInCheckBox");
	By KeepMeLoggedInCheckBoxText=By.id("keepLoggedInLabel");
	By ForgotPasswordLink=By.id("toPasswordRecoveryPageLink");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void loginToActitime(String userid, String passwd)
	{
		driver.findElement(username).sendKeys(userid);
		driver.findElement(pwd).sendKeys(passwd);
	}
	public void clickLoginButton()
	{
		driver.findElement(LoginButton).click();
	}
	/*public void testCheckBox()
	{
		driver.findElement(KeepMeLoggedInCheckBox).click();
	}
	public void testCheckBoxText()
	{
		driver.findElement(KeepMeLoggedInCheckBoxText).click();
	}
	public void clickForgotPasswordLink()
	{
		driver.findElement(ForgotPasswordLink).click();
	}*/
	
}
