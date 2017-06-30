/**
 * 
 */
package com.uat.testmanagement.teststeps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * @author suchita.nikhade
 * Date- 30-06-2017
 */
public class TestSteps {

	
	
	
 		@FindBy(id="tab5")
 		@CacheLookup
 		WebElement testSteps;
 	
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
		
		@FindBy(xpath=".//*[@id='RightPanel']/div[4]/h2[1]")
		@CacheLookup
		WebElement viewAllTestSteps;
		
		@FindBy(xpath=".//*[@id='RightPanel']/div[4]/h2[2]")
		@CacheLookup
		WebElement createTestSteps;
		
		@FindBy(xpath=".//*[@id='btnDelete']")
		@CacheLookup
		WebElement deleteSelectedButton;
		
}
