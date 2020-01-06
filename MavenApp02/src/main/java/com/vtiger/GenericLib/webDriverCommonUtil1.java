package com.vtiger.GenericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webDriverCommonUtil1 {

	public static void waitForPageToLoad() {
		BaseClass.dr.manage().deleteAllCookies();
		BaseClass.dr.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		BaseClass.dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void waitForElementPresent(WebElement element) {		
		WebDriverWait wait1 = new WebDriverWait(BaseClass.dr, 20);
		try {
				wait1.until(ExpectedConditions.visibilityOf(element));
		}
		catch(NoSuchElementException e) {}

	}
	
	public static void action(WebElement element) {
		Actions a = new Actions(BaseClass.dr);
		a.moveToElement(element).perform();
		element.click();
	}
		// 	Overloading action method 
	public static void action(WebElement pointer, WebElement element) {
		Actions a1 = new Actions(BaseClass.dr);
		a1.moveToElement(pointer).perform();
		element.click();
	}
	
	public static void select(WebElement element, String searchCriteria) {		
		Select s1 = new Select(element);
		s1.selectByVisibleText(searchCriteria);
	}
		
}