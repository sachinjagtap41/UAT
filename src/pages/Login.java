package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Login {

	WebDriver driver;
	
	
	
	/*@FindBy(id="headerContainer")
	WebElement headerOnActitimeLoginPage;*/
	@FindBy(id="Email")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="Password")
	@CacheLookup
	WebElement pwd;
	
	@FindBy(id="Login")
	@CacheLookup
	WebElement loginBtn;
	
	@FindBy(id="rememberMe")
	@CacheLookup
	WebElement checkBox;
	
	@FindBy(linkText="New Company")
	@CacheLookup
	WebElement newCompany;
	
	@FindBy(linkText="New User")
	@CacheLookup
	WebElement newUser;
	/*@FindBy(id="keepLoggedInLabel")
	WebElement checkBoxLabel;
	@FindBy(id="toPasswordRecoveryPageLink")
	WebElement forgotPasswordLink;*/
	
	
	public void loginToActitime(String userid, String passwd)
	{
		email.sendKeys(userid);
		pwd.sendKeys(passwd);
		loginBtn.click();
	}
	/*public void clickLoginButton()
	{
		driver.findElement(loginBtn).click();
	}*/
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

