package com.magento.qa.testcases;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.qa.base.TestBase;
import com.nagento.qa.pages.AdminLoginPage;
import com.nagento.qa.pages.HomePage;
import com.nagento.qa.pages.PriceListPage;

public class PricelistTest extends TestBase {
	  AdminLoginPage loginpage;
	  HomePage Homepage;
	  PriceListPage pricelistpage;
	  WebElement element;
	 // WebDriver driver;
	  
	  public PricelistTest() {
		  
		  super();
	  }
	
	  @BeforeMethod
      public void SetUp() throws InterruptedException {

        initialization();
        loginpage=new AdminLoginPage();
        Homepage=new HomePage();
        pricelistpage =new PriceListPage();
       // WebDriverWait wait = new WebDriverWait(driver, 100);
        
        Homepage= loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
        String title= Homepage.PageTile();
  		Assert.assertEquals(title, "Dashboard");
  		
  		Homepage.closepoup();
  		
  		System.out.println("open pricelist page");
  		Homepage.SelectAdvancePricing();
  		//element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='add' and @title='Add New Pricelist']")));
  	
  	    }
	  

	  
	  
	  @Test(priority=1)
	  public void priceList_Title_Validation() {
		  
		  
		String title1 =pricelistpage.PricelistPageTile();
		System.out.println("Finally able to verify");
		//Assert.assertEquals(title1, "Manage Pricelist");
		Assert.assertEquals(title1, "Manage Pricelist / Magento Admin");
		//  System.out.println("faild");
		 //Assert.assertTrue( pricelistpage.PricelistPageTile());
		  
		  }
	  
	  @Test(priority=2)
	  
	  public void priceList_Add() {
		
		  System.out.println("pricelist add");
		  
		  pricelistpage.AddnewPriceList();
		   
		  pricelistpage.WebsiteDD();
		  
		  pricelistpage.PriceListName();
		  
		  pricelistpage.PriceListDDvalue();
		  
		  pricelistpage.discountpercent();
		  
		  pricelistpage.IsactiveDDvalue();
		  
		  pricelistpage.clicksaveandContinue();
		  
		  
	  }
	  
	  @Test(priority=3)
	  
	  public void PriceList_Del() throws InterruptedException {
		  
		  pricelistpage.filterWith_name();
		  
		  pricelistpage.edit();
		  
		  pricelistpage.delete();
		  
	  }
	  
	  
	  @AfterMethod
      
      public void teardown() {
    	  
    	  driver.quit();
      }
      

}
