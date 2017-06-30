/**
 * 
 */
package com.uat.query;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * @author suchita.nikhade
 * Date- 30-06-2017
 */
public class Query {
		
		
	@FindBy(id="qury")
	@CacheLookup
	WebElement queryTab;
	
	@FindBy(id="projSelect")
	@CacheLookup
	WebElement selectProjectVersion;
	
	@FindBy(id="changeCriteriaDrDo")
	@CacheLookup
	WebElement selectCriteria;
	
	@FindBy(id="ddlOp")
	@CacheLookup
	WebElement selectOperator;
	
	@FindBy(id="selectValue")
	@CacheLookup
	WebElement selectValue;
	
	@FindBy(xpath=".//*[@id='queryPanelTab']/tbody/tr[2]/td[4]/select")
	@CacheLookup
	WebElement selectClause;
	
	@FindBy(id="btnAddQuery")
	@CacheLookup
	WebElement addQueryButton;
	
	@FindBy(id="runQ")
	@CacheLookup
	WebElement findButton;
	
	@FindBy(id="clear")
	@CacheLookup
	WebElement clearAllButton;
	
	
	
}
