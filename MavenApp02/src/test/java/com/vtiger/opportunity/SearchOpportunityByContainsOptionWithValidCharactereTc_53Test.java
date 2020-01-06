package com.vtiger.opportunity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.vtiger.GenericLib.BaseClass;
import com.vtiger.GenericLib.FileLib;
import com.vtiger.GenericLib.webDriverCommonUtil1;
import com.vtiger.pageObjectRepo1.Home;
import com.vtiger.pageObjectRepo1.Opportunity;
/**
 * Search the Opportunity using Contains Option With a Valid Character.
 * @author Manoj
 *
 */

@Listeners(com.vtiger.GenericLib.ListnerImplClass.class)
public class SearchOpportunityByContainsOptionWithValidCharactereTc_53Test extends BaseClass {
	
	@Test
	public void SearchOpportunityByContainsOptionWithValidCharacterTc_53() throws  FileNotFoundException, IOException, InterruptedException {
		
		/*PAGE LOAD WAIT*/
		/*webDriverCommonUtil1.waitForPageToLoad();*/
		
		Opportunity opportunity = new Opportunity(dr);
				/*PageFactory.initElements(dr, Opportunity.class);*/
		Home home = PageFactory.initElements(dr, Home.class);						
		SoftAssert soft = new SoftAssert();
		String msg = "Marvel Corp";
		
		/*Login into application using url.
		login to CRM with valid data*/
				
		/*navigate to opportunity & click.*/											
		home.opportunity();
		Reporter.log("navigated to opportunity & clicked successfully.. ",true);
		
		/*click in go to advance search icon.*/		
	    home.advanceSearch();			    			    			    
		Reporter.log("clicked on advance search icon succesfully..",true);
		
		/*select opportunity name  from dropdown list*/		
		opportunity.selectOpportunityName(9);
		Reporter.log("Opportunity name selected from dropdown list succesfully..",true);
			
		/*select contains option from another dropdown  box*/					
		opportunity.selectCriteria(9);
		Reporter.log("Contains option selected from dropdown list succesfully..",true);
			
		/*enter any valid character name of opportunity related to into text box.*/		
		String orname=opportunity.enterOrganisationName(9);
		System.out.println("********Organisation Name: "+orname);

		
		Reporter.log("Opportunity character name entered in textbox",true);
		Reporter.log("Opportunity character name entered in textbox");
		Reporter.log("Opportunity character name entered in textbox=======");
	

		/*click on search now button*/							
		/*opportunity=PageFactory.initElements(dr, Opportunity.class);*/
		opportunity.clickOnSearchBtn();
		webDriverCommonUtil1.waitForPageToLoad();
		
		Reporter.log("Search button clicked succesfully..",true);
		System.out.println("Search button clicked succesfully..");
		
		/*String method_Name = SearchOpportunityByContainsOptionWithValidCharactereTc_53.class.getName();
		soft.assertEquals(opportunity.getFailureMsg(), msg, "'"+method_Name+"'Test Case Failed..");*/
		soft.assertEquals(opportunity.getMessage(), "ShowingRecords");
		soft.assertAll();
		
		
		Reporter.log("Search button clicked succesfully..jjjj");
		Reporter.log("Search button ======================clicked succesfully..");
		
		
		
	}
		
		/*logout and close browser.*/
				
	}


/*System.out.println("***************************************************************************************************");System.out.println("MESSAGE FROM METHOD ::::: "+Opportunity.getFailureMsg());System.out.println("MESSAGE FROM DATA MEMBER-----    "+msg);System.out.println("***************************************************************************************************");*/
/*String searchby = FileLib.getExcelData("Sheet1", 9, 2);WebElement name = dr.findElement(By.id("fcol0"));Select s1=new Select(name);s1.selectByVisibleText(searchby);*/
/*String searchcriteria = FileLib.getExcelData("Sheet1", 9, 3);WebElement option = dr.findElement(By.id("fop0"));Select s2=new Select(option);s2.selectByVisibleText(searchcriteria);		*/
/*String orgname = FileLib.getExcelData("Sheet1", 9, 4);WebDriverWait wait5=new WebDriverWait(dr, 20);try {		WebElement input = wait5.until(ExpectedConditions.visibilityOfElementLocated((By.name("fval0"))));		input.sendKeys(orgname);}catch(NoSuchElementException ex) {   }*/
/*Reporter.log("Navigated to opportunity & clicked successfully.. ",true);Reporter.log("Clicked on advance search icon succesfully..",true);Reporter.log("Opportunity name selected from dropdown list succesfully..",true);Reporter.log("Search option selected from dropdown list succesfully..",true);Reporter.log("Opportunity character name entered in textbox",true);Reporter.log("Search button clicked succesfully..",true);*/
