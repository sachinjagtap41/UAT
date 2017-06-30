/**
 * 
 */
package com.uat.testmanagement.testers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * @author suchita.nikhade
 * Date- 30-06-2017
 */
public class EditTesterDetails {

	
	@FindBy(xpath=".//*[@id='testerGrid']/table/tbody/tr/td[4]/img[1]")
	@CacheLookup
	WebElement edittesterDetails;
	
	@FindBy(id="Auto")
	@CacheLookup
	WebElement addTesterFromAddressBook;
	
	@FindBy(id="testerRoles")
	@CacheLookup
	WebElement selectTesterRole;
	
	@FindBy(id="area")
	@CacheLookup
	WebElement selectArea;
	
	@FindBy(id="btnUpdate")
	@CacheLookup
	WebElement updateTesterButton;
	
	@FindBy(id="btnReset)
	@CacheLookup
	WebElement resetTesterButton;
	
}
