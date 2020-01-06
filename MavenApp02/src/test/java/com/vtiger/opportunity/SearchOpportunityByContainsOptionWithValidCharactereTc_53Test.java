package com.vtiger.opportunity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
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
	public void SearchOpportunityByContainsOptionWithValidCharacterTc_53() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException {
		
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

		/*click on search now button*/							
		/*opportunity=PageFactory.initElements(dr, Opportunity.class);*/
		opportunity.clickOnSearchBtn();
		webDriverCommonUtil1.waitForPageToLoad();
		
		Reporter.log("Search button clicked succesfully..",true);
		
		
		/*String method_Name = SearchOpportunityByContainsOptionWithValidCharactereTc_53.class.getName();
		soft.assertEquals(opportunity.getFailureMsg(), msg, "'"+method_Name+"'Test Case Failed..");*/
		soft.assertEquals(opportunity.getMessage(), "ShowingRecords");
		soft.assertAll();
		
		
		
		
		
			String expg1 ="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
			String expg2 ="Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM";
			String expg3 = "Administrator - Invoice - vtiger CRM 5 - Commercial Open Source CRM";
			WebDriver driver =null;
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("http://localhost:8888/index.php");
			driver.manage().window().maximize();
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("root");
			driver.findElement(By.id("submitButton")).click();
			String actpg1 =driver.getTitle();
			System.out.println(actpg1);
			if (expg1.equals(actpg1))
			{
				System.out.println("Home Page Title is Verified ======> Pass ");
			}else
			{
				System.out.println("Home Page Title is Not Verified ======> Fail ");	
			}
			Actions act = new Actions(driver);
			WebElement wb = driver.findElement(By.xpath("//a[text()='More']"));
			act.moveToElement(wb).perform();
			driver.findElement(By.xpath("//a[text()='Products']")).click();
			String actpg2 =driver.getTitle();
			System.out.println(actpg2);
			if (expg2.equals(actpg2))
			{
				System.out.println("Products Page Title is Verified ======> Pass ");
			}else
			{
				System.out.println("Products Page Title is Not Verified ======> Fail ");	
			} 
			driver.findElement(By.xpath("//img[@title='Create Product...']")).click();
			driver.findElement(By.name("productname")).sendKeys("Laptops");
			driver.findElement(By.name("unit_price")).sendKeys("100");
			driver.findElement(By.xpath("(//input[@type ='submit'])[2]")).click();
			driver.findElement(By.xpath("//table[@class='hdrTabBg']//a[text()='Organizations']")).click();
			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
			driver.findElement(By.name("accountname")).sendKeys("TCS5");
			driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
		
			while(true)
			{
				try
				{
					driver.findElement(By.xpath("//a[text()='More']")).click();
					break;
				}
				catch(Exception e)
				{
					
				}
			}
				
								
					driver.findElement(By.name("Invoice")).click();
					String actpg3 =driver.getTitle();
					System.out.println(actpg3);
					if (expg3.equals(actpg3))
					{
						System.out.println("Invoice Page Title is Verified ======> Pass ");
					}else
					{
						System.out.println("Invoice Page Title is Not Verified ======> Fail ");	
					}
					driver.findElement(By.xpath("//img[@title='Last Viewed']")).click();
					
					List<WebElement> lst = driver.findElements(By.xpath("//table[@class='hdrNameBg']/tbody/tr/td[*]"));
					for(WebElement wbl :lst) {
						System.out.println(wbl.getText());
					}
					driver.findElement(By.xpath("//a[text()='Laptops']")).click();
					String	actpg4 = driver.getTitle();
					System.out.println(actpg4);
					if (expg2.equals(actpg4)){
						System.out.println("Products Page Title is Verified ======> Pass ");
					}else
					{
						System.out.println("Products Page Title is Not Verified ======> Fail ");	
					} 
			
			
					driver.findElement(By.xpath("//a[text()='Create Invoice']")).click();
					String actpg5 = driver.getTitle();
					System.out.println(actpg5);
					if (expg3.equals(actpg5))
					{
						System.out.println("Create Invoice Page Is Verified =====> Pass ");
					}else {
						System.out.println("Create Invoice Page Is Not Verified =====> Fail ");
					}	
					driver.findElement(By.name("subject")).sendKeys("Inv_001");	
					driver.findElement(By.xpath("//input[@name='account_name']/following-sibling::img")).click();				
					Set<String> set2 =driver.getWindowHandles();
					Iterator<String> it2= set2.iterator();
					String parrentId2 = it2.next();
						String childId2 = it2.next();
					driver.switchTo().window(childId2);
					String n2 ="//a[text()='TCS']";
					WebDriverWait waitorg = new WebDriverWait(driver, 20);
					waitorg.until(ExpectedConditions.elementToBeClickable(By.xpath(n2)));
					driver.findElement(By.xpath(n2)).click();
					Alert alt1 =driver.switchTo().alert();
					alt1.accept();
					driver.switchTo().window(parrentId2);
					driver.findElement(By.name("bill_street")).sendKeys("Qspiders OAR , MurgeshPlaya");
					driver.findElement(By.name("ship_street")).sendKeys("Qspiders OAR , MurgeshPlaya");
					driver.findElement(By.xpath("//img[@title='Products']")).click();
					Set<String> set3 =driver.getWindowHandles();
					Iterator<String> it3= set3.iterator();
					String parrentId3 = it3.next();
					String childId3 = it3.next();
					driver.switchTo().window(childId3);
					String n3 ="//a[text()='Laptops']";
					WebDriverWait wait3 = new WebDriverWait(driver, 20);
					wait3.until(ExpectedConditions.elementToBeClickable(By.xpath(n3)));
					driver.findElement(By.xpath(n3)).click();
					driver.switchTo().window(parrentId3);
					driver.findElement(By.xpath("(//input[@type ='submit'])[2]")).click();
					String actproductpg =driver.getTitle();
					System.out.println(actproductpg);
					if (expg2.equals(actproductpg)) {
						System.out.println("Products Page Is Verified =======> Pass ");
					}else {
						System.out.println("Products Page Is Not Verified =======> Fail ");
					}
					Actions act2 =new Actions(driver);
					act2.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
					driver.findElement(By.linkText("Sign Out")).click();
					driver.close();

		}
		
		/*logout and close browser.*/
				
	}


/*System.out.println("***************************************************************************************************");System.out.println("MESSAGE FROM METHOD ::::: "+Opportunity.getFailureMsg());System.out.println("MESSAGE FROM DATA MEMBER-----    "+msg);System.out.println("***************************************************************************************************");*/
/*String searchby = FileLib.getExcelData("Sheet1", 9, 2);WebElement name = dr.findElement(By.id("fcol0"));Select s1=new Select(name);s1.selectByVisibleText(searchby);*/
/*String searchcriteria = FileLib.getExcelData("Sheet1", 9, 3);WebElement option = dr.findElement(By.id("fop0"));Select s2=new Select(option);s2.selectByVisibleText(searchcriteria);		*/
/*String orgname = FileLib.getExcelData("Sheet1", 9, 4);WebDriverWait wait5=new WebDriverWait(dr, 20);try {		WebElement input = wait5.until(ExpectedConditions.visibilityOfElementLocated((By.name("fval0"))));		input.sendKeys(orgname);}catch(NoSuchElementException ex) {   }*/
/*Reporter.log("Navigated to opportunity & clicked successfully.. ",true);Reporter.log("Clicked on advance search icon succesfully..",true);Reporter.log("Opportunity name selected from dropdown list succesfully..",true);Reporter.log("Search option selected from dropdown list succesfully..",true);Reporter.log("Opportunity character name entered in textbox",true);Reporter.log("Search button clicked succesfully..",true);*/
