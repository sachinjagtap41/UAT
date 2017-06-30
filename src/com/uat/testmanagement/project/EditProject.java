/**
 * 
 */
package com.uat.testmanagement.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * @author suchita.nikhade
 * Date- 30-06-2017
 */
public class EditProject {
		
	
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement editProject;
	
	@FindBy(id="group")
	@CacheLookup
	WebElement groupName;
	
	@FindBy(xpath=".//*[@id='addGroup']/img")
	@CacheLookup
	WebElement addGroup;
	
	@FindBy(id="process")
	@CacheLookup
	WebElement processName;
	
	@FindBy(xpath=".//*[@id='addPortfolio']/img")
	@CacheLookup
	WebElement addProcess;
	
	@FindBy(id="pName")
	@CacheLookup
	WebElement projectName;
	
	@FindBy(xpath=".//*[@id='addProject']/img")
	@CacheLookup
	WebElement addProject;
	
	@FindBy(id="version")
	@CacheLookup
	WebElement versionofProject;
	
	@FindBy(id="txtDescription")
	@CacheLookup
	WebElement descriptionOfProject;
	
	@FindBy(id="startDate")
	@CacheLookup
	WebElement startDateOfProject;
	
	@FindBy(id="endDate")
	@CacheLookup
	WebElement endDateOfProject;
	
	@FindBy(id="VersionLead")
	@CacheLookup
	WebElement versionLeadOfProject;
	
	@FindBy(id="VersionStakeholder")
	@CacheLookup
	WebElement versionStakeholderOfProject;
	
	@FindBy(id="status")
	@CacheLookup
	WebElement statusOfProject;
	
	@FindBy(id="divProjectUrl")
	@CacheLookup
	WebElement projectURL;
	
	@FindBy(xpath=".//*[@id='editProjectUrl']/img")
	@CacheLookup
	WebElement addProjectURL;
	
	@FindBy(id="divApplicationUrl")
	@CacheLookup
	WebElement applicationURL;
	
	@FindBy(xpath=".//*[@id='editApplicationUrl']/img")
	@CacheLookup
	WebElement addApplicationURL;
	
	@FindBy(id="btnSave")
	@CacheLookup
	WebElement saveButton;
	
	@FindBy(id="btnClear")
	@CacheLookup
	WebElement cancelButton;
	

}
