package com.magento.qa.testcases;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.qa.base.TestBase;
import com.nagento.qa.pages.AdminLoginPage;
import com.nagento.qa.pages.CustomerPage;
import com.nagento.qa.pages.HomePage;
import com.nagento.qa.pages.PriceListPage;

public class PricelistTest extends TestBase {
	  AdminLoginPage loginpage;
	  HomePage Homepage;
	  PriceListPage pricelistpage;
	  WebElement element;
	  CustomerPage Custpage;
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
	  

	
	/* 
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
		  
		  
		  boolean title4 =pricelistpage.ProdCreation_confirm_message();
		 
		  if(title4==true) {
			System.out.println("verified the message");
			//Assert.assertEquals(title1, "Manage Pricelist");
			//Assert.assertEquals(title4, "The pricelist has been saved.");
		  }
		  else{
			   System.out.println("Item already created, please delete previous one");

			}
		  
		  
		  
	  }
	  
	*/  
	  
	 /* @Test(priority=3)
	  
	  public void assignment() throws InterruptedException {
		  
          pricelistpage.filterWith_name();
		  
		  pricelistpage.edit();
		  
		  
	  }*/
	
/*
	  @Test(priority=3)
	  
	  public void prod_assign() throws InterruptedException {
		  
		  pricelistpage.clr_filter();
		  
		  pricelistpage.filterWith_name();
		  
		  pricelistpage.edit();
		  
		  pricelistpage.product_assign();
		  
		  pricelistpage.productassign_action();
		  
		  pricelistpage.click_submit();
		  
		  
		  boolean title2 =pricelistpage.verify_message();
		 
		  if(title2==true) {
			System.out.println("verified the message");
			//Assert.assertEquals(title1, "Manage Pricelist");
			//Assert.assertEquals(title2, "Selected items has been assigned");
		  }
		  else{
			   System.out.println("element not present -- so it entered the else loop");

			}
		  
		  
	  }

	  
	*/
	  
	  @Test(priority=4)
	  
	  public void pricelisAssign_customer() throws InterruptedException{
		  
		  //local object creation of CustomerPage class
		  CustomerPage Custpage =new CustomerPage();
		  
		  //open customer page from left pane 
		  Homepage.selectcustomeroption();
		  
		  //page title verification
		  String title3 =Custpage.CustomerPageTile();
		  System.out.println("verify the message");
		  //Assert.assertEquals(title1, "Manage Pricelist");
		  Assert.assertEquals(title3, "Customers / Customers / Magento Admin");
		  
		  boolean title = Custpage.availability_clear();
		  
		  if(title==true) {
				System.out.println("clear the filter");
				  Custpage.clear();
				//Assert.assertEquals(title1, "Manage Pricelist");
				//Assert.assertEquals(title2, "Selected items has been assigned");
			  }
			  else{
				   System.out.println("nothing left to clear ");

				}
		  
		//  Custpage.clear();
		  
		  Custpage.filter_customer();
		  
		  Custpage.Pricelist_DD();
		  
		  Custpage.save();
		  
		  boolean title4 =Custpage.validate_message();
			 
		  if(title4==true) {
			System.out.println("verified the message");
			//Assert.assertEquals(title1, "Manage Pricelist");
			//Assert.assertEquals(title2, "Selected items has been assigned");
		  }
		  else{
			   System.out.println("element not present -- so it entered the else loop");

			}
		  
		  
		  
		  
		  
	  }
	  
	  
	  
	
/*	
	  
    @Test(priority=5)
	  
	  public void PriceList_Del() throws InterruptedException {
	 
	      pricelistpage.clr_filter();
		  
		  pricelistpage.filterWith_name();
		  
		  pricelistpage.edit();
		  
		  pricelistpage.delete();
		  
		  pricelistpage.clr_filter();
	  }
*/
	  @AfterMethod
      
      public void teardown() {
    	  
    	  driver.quit();
      }
      

}
