package com.vtiger.pageObjectRepo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.GenericLib.BaseClass;
import com.vtiger.GenericLib.webDriverCommonUtil1;

public class Home {

	@FindBy(xpath="(//a[text()='Opportunities'])[1]")
	private static WebElement opportunityEdt;
	
	@FindBy(xpath="//a[text()='Go to Advanced Search']")
	private static WebElement advanceSearchEdt;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private static WebElement userEdt;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private static WebElement signoutEdt;

	
	/*		GETTERS		*/
	public WebElement getOpportunityEdt() {
		return opportunityEdt;
	}
	
	public WebElement getAdvanceSearchEdt() {
		return advanceSearchEdt;
	}
	
	public WebElement userEdt() {
		return userEdt;
	}
	
	public WebElement getSignoutEdt() {
		return signoutEdt;
	}

		
	/*		Business Logic		*/
	public static void opportunity() {
		webDriverCommonUtil1.waitForElementPresent(opportunityEdt);
		webDriverCommonUtil1.action(opportunityEdt);		
	}
	
	public static void advanceSearch() {
		webDriverCommonUtil1.waitForElementPresent(advanceSearchEdt);
		webDriverCommonUtil1.action(advanceSearchEdt);		
	}
	
	public static void logout() {	/*WebElement pointer, WebDriver dr*/
		webDriverCommonUtil1.action(userEdt,signoutEdt);			
	}
	
}	
/*   Constructor   */	/*	public Home(WebDriver dr) {			PageFactory.initElements(dr, this);		}*/	
/*WebElement user = dr.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));Actions ua=new Actions(dr);ua.moveToElement(user).perform();dr.findElement(By.xpath("//a[text()='Sign Out']")).click();*/
