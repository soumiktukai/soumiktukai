package com.nagento.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PriceListPage {
	
	WebDriver driver;
	
	
	//Pagefactory--OR
	
	
	
	
	
	
	
	
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
	WebElement Savecontinue_button;
	
	@FindBy(name="test_tab")
	WebElement ProductDetails;
	
	
	@FindBy(xpath="//button[@class=\"action-default scalable action-reset action-tertiary\"]")
	WebElement ResetFilter;
	
	@FindBy(name="product_id")
	WebElement Checkbox;
	
	@FindBy(xpath="//select[@id=\"ProductGrid_massaction-select\"]")
	WebElement Actiondropdown;

	@FindBy(xpath="//button[@id=\"save\"]")
	WebElement Save;
	
	@FindBy(xpath="//input[@class=\"admin__control-text data-grid-search-control\"]")
	WebElement searchpricelist;
	
	@FindBy(xpath="//div[@class=\"data-grid-search-control-wrap\"]//button[@class=\"action-submit\" and @type=\"button\"]")
	WebElement searchbutton;
	
	@FindBy(xpath="//div[contains(text(),'Pricelist')]")
	WebElement DuplicatePlMessage;
	
	
	//initializing the page object
		public PriceListPage() {
			
			PageFactory.initElements(driver, this);
		}
	
	
	//Action 
		
        
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
    		
    		Savecontinue_button.click();
    	} 
    	
    	//Click on product details for assign
    	
    	public void clickprodDetails() {
    		
    		ProductDetails.click();
    	}
    	
    	// click on reset filter
    	public void clickresetfilter() {
    		
    		ResetFilter.click();
    	}
    	//click on check box
    	
    	public void checkbox() {
    		
    		Checkbox.click();
    		
    	}
    	
    	//action dropdown selection
    	
    	public void ActionDD()
    	{
    		Select  ActionDD = new Select(Actiondropdown);
    		 
    		
    		//before select dropdown it should return No
    		WebElement Action_dd= ActionDD.getFirstSelectedOption();
    		System.out.println("before selection dropdown values =" +Action_dd.getText());
    		
    		ActionDD.selectByVisibleText("Assign");
    		
    		//after  select dropdown it should return Yes
    	    WebElement Action_dd1= ActionDD.getFirstSelectedOption();
    	    System.out.println("before selection dropdown values =" +Action_dd1.getText());
    		
    		
    		
    	}
    	
    	//Click final save
    	
    	public void Save() {
    		
    		Save.click();
    	}
    	
        //search pricelist 
    	public void search() {
    		searchpricelist.sendKeys("test1");
    		searchbutton.click();
    	}
    	
    	//for duplicate check message 
    	
    	public void Duplicatemessage() {
    		
    		DuplicatePlMessage.getText();
    	}
    	
}
