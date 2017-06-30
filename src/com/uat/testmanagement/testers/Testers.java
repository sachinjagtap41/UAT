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
public class Testers {
	
	@FindBy(id="tab3")
	@CacheLookup
	WebElement testers;
	
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
	
	@FindBy(xpath=".//*[@id='TestPassHead']/label")
	@CacheLookup
	WebElement selectTestPass;
	
	@FindBy(xpath=".//*[@id='allT']")
	@CacheLookup
	WebElement viewAllTesters;
	
	
	
	

}
