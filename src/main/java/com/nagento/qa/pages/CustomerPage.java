package com.nagento.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.magento.qa.base.TestBase;

public class CustomerPage extends TestBase {
	
	
	
	@FindBy(xpath="//button[@class=\"action-default\"]")
	WebElement customer_filter;
	
	@FindBy(name="email")
	WebElement email_field;
	
	@FindBy(xpath="//span[text()=\"Apply Filters\"]")
	WebElement apply_customer_filter;
	
	@FindBy(xpath="//a[@class=\"action-menu-item\" and text()=\"Edit\"]")
	WebElement customer_edit;
	
	@FindBy(xpath="//a[@class=\"admin__page-nav-link\" and @id=\"tab_customer\"]")
	WebElement account_information;
	
	@FindBy(name="customer[pricelist_code]")
	WebElement pricelis_dd;
	
	@FindBy(xpath="//span[text()=\"Save and Continue Edit\"]")
	WebElement save;
	
	
	@FindBy(xpath="//div[@class=\"admin__data-grid-header\"]/div/div[4]/div[2]//button[@class=\"action-remove\"]")
	WebElement clear;
	
	public CustomerPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	 public  String CustomerPageTile() {
			
     	return driver.getTitle();
     	//return PriceListPageTitle.getText();
		}
	
	 public void filter_customer() throws InterruptedException {
		 
		 Thread.sleep(3000);
		 customer_filter.click();
		 Thread.sleep(1000);
		 email_field.sendKeys("insync@yopmail.com");
		 Thread.sleep(1000);
		 apply_customer_filter.click();
		 Thread.sleep(1000);
		 customer_edit.click();
		 Thread.sleep(2000);
		 account_information.click();
		 
	 }
	 
	//pricelist chose from dropdown
	 public void Pricelist_DD() throws InterruptedException
 	{
 		Select  ActionDD = new Select(pricelis_dd);
 		Thread.sleep(1000);
 		
 		//before select dropdown it should return No
 		WebElement Action_dd= ActionDD.getFirstSelectedOption();
 		System.out.println("before selection dropdown values =" +Action_dd.getText());
 		
 		ActionDD.selectByVisibleText("test1");
 		Thread.sleep(1000);
 		//after  select dropdown it should return Yes
 	    WebElement Action_dd1= ActionDD.getFirstSelectedOption();
 	    System.out.println("after selection dropdown values =" +Action_dd1.getText());
 		
 		
 	}
	 public void save() throws InterruptedException {
		 Thread.sleep(1000);
		 save.click();
	 }
	
	 public void clear() throws InterruptedException {
		 Thread.sleep(5000);
		 clear.click();
		 Thread.sleep(2000);
	 }
	 

 	public boolean availability_clear() {
         try {
        	 clear.equals(null);
         } catch (Exception e) {
             System.out.println("nothing to clear ");
             return false;
         }

         return true;
     }
	 
	 
}
