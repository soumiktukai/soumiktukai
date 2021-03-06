package com.nagento.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.magento.qa.base.TestBase;
import com.magento.qa.util.TestUtil;

public class PriceListPage extends TestBase {
	
	//WebDriver driver;
	
	
	//Pagefactory--OR
	
	
	//Pricelist page logo
	
	@FindBy(xpath="//h1[@class='page-title' and text()='Manage Pricelist']")
	//@FindBy(xpath="//div[@class=\"page-title-wrapper\"]//h1[contains(text(),'Manage Pricelist')]")
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
	
	@FindBy(xpath="//button[@class=\"action-default\" and text()=\"Filters\"]")
	WebElement Filter;
	
	@FindBy(name="pricelist_name")
	WebElement namesreach_field;
	
	
	//xpath if need ://input[@name="pricelist_name"]
	
	
	@FindBy(xpath="//span[contains(text(),'Apply')]")
	WebElement Applyfilters;
	
	@FindBy(xpath="//a[@class=\"action-menu-item\"]")
	WebElement Edit;
	
	@FindBy(xpath="//span[text()=\"Delete Pricelist Price\"]")
	WebElement Delete;
	
	@FindBy(xpath="//button[@class=\"action-primary action-accept\" and @type=\"button\"]")
	WebElement popup_confirmation;
	
	@FindBy(name="test_tab")
	WebElement product_details;
	
	@FindBy(xpath="//button[@class=\"action-default scalable action-reset action-tertiary\" and contains(@title,'Reset') and @type='button']")
	WebElement reset_filter;
	
	@FindBy(xpath="//input[@name=\"product_id\" and @value=\"471\"]")
	WebElement check_box_product;
	
	@FindBy(xpath="//select[@id=\"ProductGrid_massaction-select\" and @class=\"local-validation admin__control-select \"]")
	WebElement Assign_Dropdown;
	
	@FindBy(xpath="//button[@class=\"action-default scalable\" and @title=\"Submit\"]")
	WebElement click_submit;
	
	@FindBy(xpath="//button[@class=\"action-primary action-accept\" and @type=\"button\"]")
	WebElement confirm_popup;
	
	
	@FindBy(xpath="//div[contains(text(),'Selected items')]")
	WebElement confirm_message;
	
	@FindBy(xpath="//button[@class=\"action-remove\"]")
	WebElement clear_filter;
	
	
	@FindBy(xpath="//div[text()=\"The pricelist has been saved.\"]")
	WebElement save_confirm_message;
	
	//initializing the page object
		public PriceListPage() {
			
			PageFactory.initElements(driver, this);
		}
	
	
	//Action 
		
        
        //again validate price list page title
        public  String PricelistPageTile() {
			
        	return driver.getTitle();
        	//return PriceListPageTitle.getText();
				
	
		}
	   
        //CLick on add new price list
        
        public void AddnewPriceList() {
        	
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
    	
    	
    	PricelistDropdownbtn.selectByValue("0");
    	
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
    	    System.out.println("after selection dropdown values =" +selected_DD1.getText());
    		
    		
    		
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
    	    System.out.println("after selection dropdown values =" +Action_dd1.getText());
    		
    		
    		
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
    	
    	//filter with name 
    	
    	public void filterWith_name() throws InterruptedException {
    		Thread.sleep(5000);
    		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
    		Filter.click();
    		Thread.sleep(1000);
    		namesreach_field.sendKeys("test1");
    		Thread.sleep(1000);
    		Applyfilters.click();
    		Thread.sleep(1000);
    	}
    	
    	//Click on edit 
    	
    	public void edit() throws InterruptedException {
    		Thread.sleep(1000);
    		Edit.click();
    		
    	}
    	// click on delete 
    	public void delete() throws InterruptedException {
    		
    		Delete.click();
    		Thread.sleep(2000);
    		popup_confirmation.click();
    	}
    	
    	
    	public void product_assign() throws InterruptedException {
    		
    		product_details.click();
    		Thread.sleep(1000);
    		reset_filter.click();
    		Thread.sleep(1000);
    		check_box_product.click();
    		Thread.sleep(1000);
    		
    	} 
    	
    	//product assign dropdown
    	public void productassign_action() throws InterruptedException {
            Select  Assign_DD = new Select(Assign_Dropdown);
    		 
    		
    		//before select dropdown it should return No
    		WebElement Assigndd= Assign_DD.getFirstSelectedOption();
    		System.out.println("before selection dropdown values =" +Assigndd.getText());
    		
    		Assign_DD.selectByVisibleText("Assign");
    		Thread.sleep(1000);
    		
    		//after  select dropdown it should return Yes
    	    //WebElement Assigndd1= Assign_DD.getFirstSelectedOption();
    	   // System.out.println("after selection dropdown values =" +Assigndd1.getText());
    		
        }
    	
    	public void click_submit() throws InterruptedException {
    		
    		Thread.sleep(1000);
    		click_submit.click();
    		Thread.sleep(1000);
    		confirm_popup.click();
    		
    	}
    	
    	
    		
    	
    	
    	public boolean verify_message() {
            try {
            	confirm_message.getText();
            } catch (Exception e) {
                System.out.println("text is not matched ");
                return false;
            }

            return true;
        }

    	
    	
    	public boolean ProdCreation_confirm_message() {
            try {
            	save_confirm_message.getText();
            } catch (Exception e) {
                System.out.println("text is not matched ");
                return false;
            }

            return true;
        }

    	
    	


		public void clr_filter() throws InterruptedException {
    		
    		Thread.sleep(5000);
    		clear_filter.click();
    		Thread.sleep(1000);
    	}
    	
    	
    	public void customer_tab() {
    		
    		
    	}
    	
}
