/**
 * 
 */
package com.uat.feedback;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * @author suchita.nikhade
 * Date- 30-06-2017
 */
public class TestPassFeedback {
	
	
	@FindBy(linkText="Test Pass Feedback")
	@CacheLookup
	WebElement testPassFeedback;
	
	@FindBy(id="projSelectTC")
	@CacheLookup
	WebElement selectProjectForPassFeedback;
	
	@FindBy(id="versionSelectTC")
	@CacheLookup
	WebElement selectVersionForPassFeedback;
	
	@FindBy(id="testPasSelectTC")
	@CacheLookup
	WebElement selectTestPassForPassFeedback;
	
	@FindBy(id="testerSelectTC")
	@CacheLookup
	WebElement selectTesterForPassFeedback;
	
	@FindBy(id="roleSelectTC")
	@CacheLookup
	WebElement selectRoleForPassFeedback;
	
	@FindBy(id="goImg1")
	@CacheLookup
	WebElement clickPassGoButton;
	
	@FindBy(id="expImg1")
	@CacheLookup
	WebElement clickPassExportButton;

}
