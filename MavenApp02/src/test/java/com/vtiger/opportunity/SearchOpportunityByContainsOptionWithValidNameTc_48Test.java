package com.vtiger.opportunity;

import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.NoSuchElementException;
import com.vtiger.GenericLib.BaseClass;
import com.vtiger.GenericLib.FileLib;
import com.vtiger.pageObjectRepo1.Home;
import com.vtiger.pageObjectRepo1.Opportunity;
/**
 * Search the Opportunity using Contains Option With a Valid Name.
 * @author Manoj
 *
 */
@Listeners(com.vtiger.GenericLib.ListnerImplClass.class)
public class SearchOpportunityByContainsOptionWithValidNameTc_48Test extends BaseClass {
	/**
	 * 		
	 */
	@Test
	public void SearchOpportunityByContainsOptionWithValidNameTc_48() throws InterruptedException, FileNotFoundException, IOException {
		
		Opportunity opportunity = new Opportunity(dr);
				/*PageFactory.initElements(dr, Opportunity.class);*/
		Home home = PageFactory.initElements(dr, Home.class);						
		SoftAssert soft = new SoftAssert();
		String msg = "Marvel Corp";

		/* Login into application using url		
		 login to CRM with valid data*/
		
        /* navigate to opportunity & click.*/
		home.opportunity();
		Reporter.log("Navigated to opportunity & clicked successfully.. ",true);

	    /*  click in go to advance search icon.*/
		home.advanceSearch();
		Reporter.log("Clicked on advance search icon succesfully..",true);

        /*  select opportunity name from dropdown list*/
		opportunity.selectOpportunityName(4);
		Reporter.log("Opportunity name selected from dropdown list succesfully..",true);

	    /*	select equals to option from another dropdown box*/
		opportunity.selectCriteria(4);
		Reporter.log("search option selected from dropdown list succesfully..",true);

	    /*  enter any valid name of opportunity related to into text box*/
		opportunity.enterOrganisationName(4);
		Reporter.log("Opportunity character name entered in textbox",true);
		
        /* click on search now button*/
		opportunity.clickOnSearchBtn();
		Thread.sleep(5000);											/////////////////////////////////////
		Reporter.log("Opportunity character name entered in textbox",true);
	
		/*String method_Name = SearchOpportunityByContainsOptionWithValidCharactereTc_53.class.getName();		
		soft.assertEquals(opportunity.getFailureMsg(), opportunity.orgName, "'"+method_Name+"' *Test Case Failed..");*/
		soft.assertEquals(opportunity.getMessage(), "ShowingRecords");		
		soft.assertAll();
		
		Reporter.log("====================================================");
   	    /* logout and close browser.*/

	}	
}

// contains     marvel
/*
String searchby = FileLib.getExcelData("Sheet1", 4, 2); 
String searchcriteria = FileLib.getExcelData("Sheet1", 4, 3);
String oppname = FileLib.getExcelData("Sheet1", 4, 4);
*/