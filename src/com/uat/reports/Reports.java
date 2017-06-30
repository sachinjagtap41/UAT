/**
 * 
 */
package com.uat.reports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * @author suchita.nikhade
 * Date- 30-06-2017
 */
public class Reports {
	
	
	@FindBy(id="rpt")
	@CacheLookup
	WebElement reportTab;
	
	@FindBy(id="projSelect")
	@CacheLookup
	WebElement projectSelectDropdown;
	
	@FindBy(id="versionSelect")
	@CacheLookup
	WebElement versionSelectDropdown;
	
	@FindBy(id="scenSelect")
	@CacheLookup
	WebElement testPassSelectDropdown;
	
	@FindBy(id="tester")
	@CacheLookup
	WebElement testerSelectDropdown;
	
	@FindBy(id="roleList")
	@CacheLookup
	WebElement roleSelectDropdown;
	
	@FindBy(id="status")
	@CacheLookup
	WebElement statusSelectDropdown;
	
	@FindBy(xpath=".//*[@id='wrapper-hd']/div[2]/div/div[2]/h1/span[2]/img[1]")
	@CacheLookup
	WebElement goButton;
	
	@FindBy(xpath=".//*[@id='wrapper-hd']/div[2]/div/div[2]/h1/span[2]/img[2]")
	@CacheLookup
	WebElement exportButton;
	
}
