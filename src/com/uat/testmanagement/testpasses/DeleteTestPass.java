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
public class DeleteTestPass {
	
	
	@FindBy(xpath=".//*[@id='2496']/td[6]/a[2]/img")
	@CacheLookup
	WebElement deleteTestPass;
	

}
