package com.nagento.qa.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.qa.base.TestBase;

public class CustomerLoginPage extends TestBase {
	
	@FindBy(xpath="//strong[@class=\"logo\"]")
	WebElement Logo;
	
	@FindBy(xpath="//body[@class=\"cms-home cms-index-index page-layout-1column\"]//div[1]/header/div[1]/div/ul//li[@class=\"authorization-link\"]/a")
    WebElement Signin;
	
	@FindBy(name="login[username]")
	WebElement contact_UserName;
	
	@FindBy(name="login[password]")
	WebElement contact_pwd;
	
	
	@FindBy(xpath="//button[@class=\"action login primary\"]")
	WebElement login;
   
       public CustomerLoginPage() {
 		
		PageFactory.initElements(driver, this);
	       }
       
       public String ValidatecustomerloginPageTitle() {
   		return driver.getTitle();		
   		
   	}
   	
   	public  boolean validateLogo() {
   		
   		return Logo.isDisplayed();
   	}
   	
   	public void signin_contactperson()
   	{
   		Signin.click();
   		
   	}
   	
   	
   	public  Contactperson_DashboardPage  contact_person(String Con_username, String Con_passwrd) {
   		
   		contact_UserName.sendKeys(Con_username);
		
   		contact_pwd.sendKeys(Con_passwrd);
   		login.click();
		
   		return new Contactperson_DashboardPage();
		
   		
   	}
       
}
