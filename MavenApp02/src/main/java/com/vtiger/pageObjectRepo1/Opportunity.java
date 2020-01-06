package com.vtiger.pageObjectRepo1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
//import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.vtiger.GenericLib.FileLib;
import com.vtiger.GenericLib.webDriverCommonUtil1;

public class Opportunity {
	public String orgName;
	
	@FindBy(id="fcol0")
	private  WebElement name;
	
	@FindBy(id="fop0")
	private  WebElement searchcriteria;

	@FindBy(name="fval0")
	private  WebElement organisationName;
	
	@FindBy(xpath="(//input[@value=' Search Now '])[2]")
	private  WebElement searchNow;
	
	/*  @FindBy(xpath="//table[@class='lvt small']/tbody/tr")*/
	/*//span[contains(text(),'No Opportunity Found !')]*/
	@FindBy(xpath="(//td[contains(text(),'Showing Records')])[last()]")
	private WebElement opportunities;
	
	
	/*		GETTERS MEHTOD		*/
	
	public WebElement getName() {
		return name;
	}
	
	public WebElement getSearchcriteria() {
		return searchcriteria;
	}
	
	public WebElement getOrganisationName() {
		return organisationName;
	}
	
	public WebElement getSearchNow() {
		return searchNow;
	}
	
	public WebElement getnoOpportunityFoundMsg() {
		return opportunities;
	}
	
	
	/*		Business Logic		*/
	public  void selectOpportunityName(int n) {		
		webDriverCommonUtil1.select(name, FileLib.getExcelData("Sheet1", n, 2));		 			
	}
	
	public  void selectCriteria(int n) {		
		webDriverCommonUtil1.select(searchcriteria, FileLib.getExcelData("Sheet1", n, 3));		
	}
	
	public  String enterOrganisationName(int n) {
		orgName = FileLib.getExcelData("Sheet1", n, 4);		
		webDriverCommonUtil1.waitForElementPresent(organisationName);
		organisationName.sendKeys(orgName);
		return orgName;
	}
	
	public  void clickOnSearchBtn() {
		searchNow.click();

	}

	String msg,ret, pass="ShowingRecords", fail="No Opportunity Found !";	boolean v;
	public String getMessage() {		
		
		webDriverCommonUtil1.waitForElementPresent(opportunities);
		msg = opportunities.getText().replace(" ", "").replace("1", "").replace("2", "").replace("-", "").replace("of","");
		if(msg.equals(pass)) 
			{	ret = pass;   System.out.println("*************"+ret+"****************");	  } 
		else 
			{	ret = fail;   System.out.println("*************"+ret+"****************");	  } 				
		return ret;
	}

	
	/*		Constructor			*/
	public Opportunity(WebDriver dr) {
		PageFactory.initElements(dr, this);
	}
	
}