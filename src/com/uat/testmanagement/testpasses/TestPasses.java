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
public class TestPasses {
	
	
	@FindBy(id="tab2")
	@CacheLookup
	WebElement testPasses;
	
	@FindBy(xpath=".//*[@id='groupHead']/label")
	@CacheLookup
	WebElement selectGroup;
	
	@FindBy(xpath=".//*[@id='portfolioHead']/label")
	@CacheLookup
	WebElement selectPortfolio;
	
	@FindBy(xpath=".//*[@id='projectHead']/label")
	@CacheLookup
	WebElement selectProject;
	
	@FindBy(xpath=".//*[@id='versionHead']/label")
	@CacheLookup
	WebElement selectVersion;
	
	@FindBy(xpath=".//*[@id='pageTab']/h2[1]")
	@CacheLookup
	WebElement viewAllTestPasses;
	
	@FindBy(xpath=".//*[@id='pageTab']/h2[2]")
	@CacheLookup
	WebElement createNewTestPasses;
	
	@FindBy(id="begTest")
	@CacheLookup
	WebElement saendEmailToBeginTestingButton;
	
	@FindBy(id="testResult")
	@CacheLookup
	WebElement sendTestResultsEmailButton;
	
	
	
	
	

}
