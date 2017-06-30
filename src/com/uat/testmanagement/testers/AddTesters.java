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
public class AddTesters {

		
	@FindBy(xpath=".//*[@id='createT']")
	@CacheLookup
	WebElement addTester;
	
	@FindBy(id="Auto")
	@CacheLookup
	WebElement addTesterFromAddressBook;
	
	@FindBy(id="testerRoles")
	@CacheLookup
	WebElement selectTesterRole;
	
	@FindBy(id="addRole")
	@CacheLookup
	WebElement addRole;
	
	@FindBy(id="txtNewRole")
	@CacheLookup
	WebElement addTextNewRole;
	
	@FindBy(id="txtDescription")
	@CacheLookup
	WebElement addTextDescription;
	
	@FindBy(id="btnAdd")
	@CacheLookup
	WebElement addRoleButton;
	
	@FindBy(id="btnCancel")
	@CacheLookup
	WebElement cancelRoleButton;
	
	@FindBy(id="editRole")
	@CacheLookup
	WebElement editTesterRole;
	
	@FindBy(id="delRole")
	@CacheLookup
	WebElement deleteTesterRole;
	
	@FindBy(id="area")
	@CacheLookup
	WebElement selectArea;
	
	@FindBy(id="btnSave")
	@CacheLookup
	WebElement saveTesterButton;
	
	@FindBy(id="btnNewCancel")
	@CacheLookup
	WebElement cancelTesterButton;
	
	
	
	
	
	
	
}
