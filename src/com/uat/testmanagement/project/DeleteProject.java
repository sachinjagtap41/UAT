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
public class DeleteProject {

	
	@FindBy(xpath=".//*[@id='pageTab']/h2[3]")
	@CacheLookup
	WebElement deleteProject;
		
	
	
}
