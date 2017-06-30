/**
 * 
 */
package com.uat.feedback;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * @author suchita.nikhade
 *
 */
public class TestStepFeedback {
	
	
	@FindBy(linkText="Test Step Feedback")
	@CacheLookup
	WebElement testStepFeedback;
	
	@FindBy(id="projSelect")
	@CacheLookup
	WebElement selectProjectForStepFeedback;
	
	@FindBy(id="versionSelect")
	@CacheLookup
	WebElement selectVersionForStepFeedback;
	
	@FindBy(id="testPasSelect")
	@CacheLookup
	WebElement selectTestPassForStepFeedback;
	
	@FindBy(id="testerSelect")
	@CacheLookup
	WebElement selectTesterForStepFeedback;
	
	@FindBy(id="roleSelect")
	@CacheLookup
	WebElement selectRoleForStepFeedback;
	
	@FindBy(id="goImg2")
	@CacheLookup
	WebElement clickStepGoButton;
	


}
