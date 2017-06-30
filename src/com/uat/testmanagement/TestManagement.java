/**
 * 
 */
package com.uat.testmanagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * @author suchita.nikhade
 * Date- 30-06-2017
 *
 */
public class TestManagement {

	WebDriver driver;
	
	
	
	@FindBy(id="testMgnt")
	@CacheLookup
	WebElement testManagement;
	
}
