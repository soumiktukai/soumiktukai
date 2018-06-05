package com.nagento.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.qa.base.TestBase;

public class Contactperson_DashboardPage extends TestBase {
	
	//pagefactory--OR
	
	@FindBy(xpath="//span[@class=\"base\" and text()=\"My Dashboard\"]")
	WebElement ContactPageTitle;
	
	@FindBy(xpath="//div[@class=\"panel wrapper\"]/div/ul/li[@class=\"greet welcome\"]/span[text()=\"Welcome, Milan! \"]")
	WebElement User_validation;

	
	
	@FindBy(xpath="//input[@class=\"input-text\" and @id=\"search\"]")
	WebElement searchfield;
	
	//button[@class="action search"]

   @FindBy(xpath="//input[@class=\"input-text\" and @id=\"search\"]")
    WebElement searchbutton;
   

   @FindBy(xpath="//body[@class=\"page-products catalogsearch-result-index page-layout-2columns-left\"]")
   WebElement productclick;
   

   @FindBy(xpath=" //span[@class=\"price\" and text()=\"$360.00\"]")
   WebElement productPrice;
   
   
   
   
   
 //initializing the page object
 	public Contactperson_DashboardPage() {
 		
 		PageFactory.initElements(driver, this);
 	}
 	
 	//Action
 	public String ValidateloginPageTitle() {
 		return driver.getTitle();		
 		
 	}
 	
 	public String ContactPageTile() {
			
			return ContactPageTitle.getText();
		}
 	
 	public void searchproduct() throws InterruptedException {
 		
 		searchfield.sendKeys("nokia");
 		searchfield.sendKeys(Keys.ENTER);
 		//Thread.sleep(3000);
 		System.out.println("search");
 		//searchbutton.click();
 		//System.out.println("search1");
 	}
 	
 	public void click_product() throws InterruptedException {
 		Thread.sleep(1000);
 		productclick.click();
 		Thread.sleep(1000);
 	}
 	
 	public String validate_price() {
 		
 		return productPrice.getText();
 	}
   
}