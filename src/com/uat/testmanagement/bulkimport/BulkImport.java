/**
 * 
 */
package com.uat.testmanagement.bulkimport;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * @author suchita.nikhade
 * Date- 30-06-2017
 */
public class BulkImport {
	
	@FindBy(id="tab7")
	@CacheLookup
	WebElement bulkImport;
	
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
	
	@FindBy(xpath=".//*[@id='btnDownloadTemplate']")
	@CacheLookup
	WebElement downloadTemplateButton;
	
	@FindBy(xpath=".//*[@id='btnUploadTemplate']")
	@CacheLookup
	WebElement uploadTemplateButton;
	
	
	

}
