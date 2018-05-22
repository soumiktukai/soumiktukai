package com.nagento.qa.pages;

import com.magento.qa.base.TestBase;
import org.openqa.selenium.*;
import org.eclipse.jetty.util.annotation.Name;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends TestBase {
	
	//pagefactory--OR
	
	
	@FindBy(xpath="//button[@class=\"action-close\"]")
	WebElement closepopup;
	
	
	@FindBy(xpath="//li[@id='menu-magento-backend-dashboard' and @role='menu-item']")
	WebElement ManueDashboardButton;
	
	@FindBy(xpath="//h1[@class='page-title']")
	WebElement Dashboard;
	
	@FindBy(xpath="//li[@id='menu-insync-pricelist-advanced-pricing']/a/span")
	WebElement AdvancePricing;
	
	@FindBy(xpath="//li[@class='item-pricelist-manage    level-1']/a")
	WebElement PriceLits;
	
    public  HomePage() {
    	
    	PageFactory.initElements(driver, this);
    }
	//close popup
    public void closepoup() {
    	
    	closepopup.click();
    }
    
    
  //1st dashboard manue select from left pane
  		public void PLManueSelect() {
  			
  			ManueDashboardButton.click();
  			
  		}
  		
  		//for verify get dashboard title
  		public String PageTile() {
  			
  			return Dashboard.getText();
  		}
  		
  	//SelectAdvancePricing  from left manue panel
  			public PriceListPage SelectAdvancePricing() {
  				
  				AdvancePricing.click();
  				PriceLits.click();
  				return new PriceListPage();
  			}
   //Also go to product page from here like before
  			

}
