package com.vtiger.pageObjectRepo1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	@FindBy(name="user_name")
	private static WebElement usernameEdt;
	
	@FindBy(name="user_password")
	private static WebElement passwordEdt;
	
	@FindBy(id="submitButton")
	private static WebElement loginbtn;
	
	
	/*			GETTERS METHODS			*/
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}
	public WebElement getPasswordEdt() {
		return passwordEdt;
	}
	public WebElement getLoginBtn() {	
		return loginbtn;
	}
	
	/*			Business Logic			*/
	public static void loginToApp(String uname, String pass) {
		usernameEdt.sendKeys(uname);
		passwordEdt.sendKeys(pass);
		loginbtn.click();
	}
		
	/*  		Constructor				*/
	/* public Login(WebDriver dr) { 
	 		PageFactory.initElements(dr, this); 
	   }
	*/

}