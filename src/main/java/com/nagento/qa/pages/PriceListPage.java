package com.nagento.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PriceListPage {
	
	WebDriver driver;
	
	
	//Pagefactory--OR
	
	
	@FindBy(xpath="//li[@id='menu-magento-backend-dashboard' and @role='menu-item']")
	WebElement ManueDashboardButton;
	
	@FindBy(xpath="//h1[@class='page-title']")
	WebElement Dashboard;
	
	@FindBy(xpath="//li[@id='menu-insync-pricelist-advanced-pricing']/a/span")
	WebElement AdvancePricing;
	
	@FindBy(xpath="//li[@class='item-pricelist-manage    level-1']/a")
	WebElement PriceLits;
	
	//Pricelist page logo
	
	@FindBy(xpath="//h1[@class='page-title' and text()='Manage Pricelist']")
	WebElement PriceListPageTitle;
	
	
	//Add pricelist button 
	@FindBy(xpath="//button[@id='add' and @title='Add New Pricelist']")
	WebElement AddPriceListButton;
	
	
	//all dropdown field xpath
	
	@FindBy(name="website_id")
	WebElement Websitedetails;
	

	@FindBy(name="pricelist_name")
	WebElement PricelistName;
	
	@FindBy(name="parent_id")
	WebElement ParentpricelistDropButton;
	
	@FindBy(name="discount_factor")
	WebElement discountfactor;
	
	@FindBy(name="is_active")
	WebElement is_active;
	
	@FindBy(xpath="//button[@id='saveandcontinue' and @title='Save and Continue Edit']")
	WebElement Save_button;
	
	@FindBy(name="test_tab")
	WebElement ProductDetails;
	
	
	@FindBy(xpath="//button[@class=\"action-default scalable action-reset action-tertiary\"]")
	WebElement ResetFilter;
	

	
	
	
	
	//initializing the page object
		public PriceListPage() {
			
			PageFactory.initElements(driver, this);
		}
	
	
	//Action 
		
		//1st dashboard manue select from left pane
		public void PLManueSelect() {
			
			ManueDashboardButton.click();
			
		}
		
		//for verify get dashboard title
		public String PageTile() {
			
			return Dashboard.getText();
		}
	  
		//SelectAdvancePricing  from left manue panel
		public void SelectAdvancePricing() {
			
			AdvancePricing.click();
		}
		
		//select sub manue
        public void SelectPriceList() {
			
        	PriceLits.click();
		}
		
        
        //again validate price list page title
        public String PricelistPageTile() {
			
			return PriceListPageTitle.getText();
		}
	   
        //CLick on add new price list
        
        public void AddewPriceList() {
        	
        	AddPriceListButton.click();
        }
	  //Select websites dropdown
        public void WebsiteDD() {
        	Select  WebsiteDropdown = new Select(Websitedetails);
   		 
    		
    		//before select dropdown it should return No
    		WebElement Choos_DD= WebsiteDropdown.getFirstSelectedOption();
    		 System.out.println("before selection dropdown values =" +Choos_DD.getText());
    		
    		WebsiteDropdown.selectByVisibleText("Main Website");
    		
    		//after  select dropdown it should return Yes
    	    WebElement Choos_DD1= WebsiteDropdown.getFirstSelectedOption();
    	    System.out.println("before selection dropdown values =" +Choos_DD1.getText());
        }
        
      //fill pricelist name 
        
        public void PriceListName() {
        	
        	PricelistName.sendKeys("test1");
        }
        
        
    	//Create method for pricelistdropdown
    	
    	public void PriceListDDvalue(){
    	
    	Select PricelistDropdownbtn = new Select(ParentpricelistDropButton);
    	
        //before select dropdown it should return baseprice
    	WebElement selcted_values =  PricelistDropdownbtn.getFirstSelectedOption();
    	
    	System.out.println("before selection dropdown values =" +selcted_values.getText());
    	
    	
    	PricelistDropdownbtn.selectByValue("1");
    	
    	//after select pricelist it should return Automation
    	
    	WebElement selcted_values1 =  PricelistDropdownbtn.getFirstSelectedOption();
    	
    	System.out.println("after selection dropdown values =" +selcted_values1.getText());
    	
    	}
    	
    	public void discountpercent() {
    		
    		discountfactor.sendKeys("10");
    	}
    	
    	//Create method for isactive 
    	public void IsactiveDDvalue()
    	{
    		Select  isactiveddbutton = new Select(is_active);
    		 
    		
    		//before select dropdown it should return No
    		WebElement selected_DD= isactiveddbutton.getFirstSelectedOption();
    		System.out.println("before selection dropdown values =" +selected_DD.getText());
    		
    		isactiveddbutton.selectByVisibleText("Yes");
    		
    		//after  select dropdown it should return Yes
    	    WebElement selected_DD1= isactiveddbutton.getFirstSelectedOption();
    	    System.out.println("before selection dropdown values =" +selected_DD1.getText());
    		
    		
    		
    	}
    	
    	
    	public void clicksaveandContinue() {
    		
    		Save_button.click();
    	} 
    	
    	//Click on product details for assign
    	
    	public void clickprodDetails() {
    		
    		ProductDetails.click();
    	}
    	// click on reset filter
    	
}
