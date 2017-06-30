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
public class Feedback {
		
	
	@FindBy(id="fee")
	@CacheLookup
	WebElement feedbackTab;
	
	
	
	
	
	
	
}
