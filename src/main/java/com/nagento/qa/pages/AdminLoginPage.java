package com.nagento.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.qa.base.TestBase;

public class AdminLoginPage extends TestBase {
	
	//pagefactory--OR
	
	@FindBy(name="login[username]")
	WebElement UserName;
	
	@FindBy(name="login[password]")
	WebElement Password;
	 
	@FindBy(xpath="//button[@class='action-login action-primary']")
	WebElement LoginButton;
	
	@FindBy(xpath="//a[@class='action-forgotpassword']")
	WebElement ForgetPassword;
	
	@FindBy(xpath="//img[@class='logo-img']")
	WebElement VerifyLogo;
	
	
	//initializing the page object
	public AdminLoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//Action
	public String ValidateloginPageTitle() {
		return driver.getTitle();		
		
	}
	
	public  boolean validateMagentoLogo() {
		
		return VerifyLogo.isDisplayed();
	}
    
	
	// actual test
	public HomePage Login(String un, String pwd) {
		
		UserName.sendKeys(un);
		
		Password.sendKeys(pwd);
		LoginButton.click();
		
		return new HomePage();
		
	}
}
