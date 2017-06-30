/**
 * 
 */
package com.uat.testmanagement.testpasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * @author suchita.nikhade
 * Date- 30-06-2017
 */
public class EditTestPass {
	
	
	
	@FindBy(xpath=".//*[@id='2496']/td[6]/a[1]/img")
	@CacheLookup
	WebElement editTestPasses;
	
	@FindBy(id="testPasNm")
	@CacheLookup
	WebElement editTestPassName;
	
	@FindBy(id="desc")
	@CacheLookup
	WebElement editTestPassDescription;
	
	@FindBy(id="status")
	@CacheLookup
	WebElement editTestPassStatus;
	
	@FindBy(id="Auto")
	@CacheLookup
	WebElement editTestManager;
	
	@FindBy(id="startDate")
	@CacheLookup
	WebElement editStartDate;
	
	@FindBy(id="endDate")
	@CacheLookup
	WebElement editEndDate;
	
	@FindBy(id="btnUpdate")
	@CacheLookup
	WebElement editUpdateButton;
	
	@FindBy(id="btnReset")
	@CacheLookup
	WebElement editResetButton;
	
	

}
