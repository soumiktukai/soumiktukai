package com.nagento.qa.pages;



import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.qa.base.TestBase;
import com.magento.qa.util.TestUtil;


public class HomePage extends TestBase {
	
	//pagefactory--OR
	
	
	@FindBy(xpath="//button[@class=\"action-close\"]")
	WebElement closepopup;
	
	//reload data
	@FindBy(xpath="//button[@class=\"action-primary\"]")
	WebElement reloaddata;
	
	
	@FindBy(xpath="//li[@id='menu-magento-backend-dashboard' and @role='menu-item']")
	WebElement ManueDashboardButton;
	
	@FindBy(xpath="//h1[@class='page-title']")
	WebElement Dashboard;
	
	@FindBy(xpath="//li[@id='menu-insync-pricelist-advanced-pricing']")
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
  			public PriceListPage SelectAdvancePricing() throws InterruptedException {
  				Actions act= new Actions(driver);
  				Thread.sleep(1000);
  				act.moveToElement(AdvancePricing).click().perform();
  				driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
  				//reloaddata.click();
  				System.out.println("test1");
  				//AdvancePricing.click();
                Actions act1= new Actions(driver);
                Thread.sleep(1000);
  				act1.moveToElement(PriceLits).click().perform(); 
  				System.out.println("test2");
  				driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
  				//PriceLits.click();
  				return new PriceListPage();
  			}
   //Also go to product page from here like before
  			

}
