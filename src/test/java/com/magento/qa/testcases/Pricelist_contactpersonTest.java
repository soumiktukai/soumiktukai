package com.magento.qa.testcases;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.qa.base.TestBase;
import com.nagento.qa.pages.AdminLoginPage;
import com.nagento.qa.pages.Contactperson_DashboardPage;
import com.nagento.qa.pages.CustomerLoginPage;
import com.nagento.qa.pages.CustomerPage;
import com.nagento.qa.pages.HomePage;
import com.nagento.qa.pages.PriceListPage;

public class Pricelist_contactpersonTest extends TestBase {

	AdminLoginPage loginpage;
	CustomerLoginPage Contactlogin;
	  HomePage Homepage;
	  PriceListPage pricelistpage;
	  WebElement element;
	  CustomerPage Custpage;
	  
	  Contactperson_DashboardPage Contactdashboardpage;
	  
 // WebDriver driver;
	  
	  public Pricelist_contactpersonTest() {
		  
		  super();
	  }
	
	  
	  @BeforeMethod
		public void SetUp() {
			
			initialization();
			Contactlogin=new CustomerLoginPage();
			
		}
	 /* 
		@Test(priority=1)	
		
		public void PageTitleTest() {
			
			String title= Contactlogin.ValidatecustomerloginPageTitle();
			Assert.assertEquals(title, "Home page");
		}
		
		
		@Test(priority=2)
		public void  ValidateMagentoImage() {
			
			boolean flag= Contactlogin.validateLogo();
			Assert.assertTrue(flag);
		}
		
		*/
		@Test(priority=3)
		
		public void Logintest() throws InterruptedException {
			
			Contactlogin.signin_contactperson();
			Contactdashboardpage= Contactlogin.contact_person(prop.getProperty("Con_username"), prop.getProperty("Con_passwrd"));
			
			String title= Contactdashboardpage.ContactPageTile();
			Assert.assertEquals(title, "My Dashboard");
			Contactdashboardpage.searchproduct();
			System.out.println("search3");
			Thread.sleep(1000);
			Contactdashboardpage.click_product();
			System.out.println("click");
			
			String title1=Contactdashboardpage.validate_price();
			Assert.assertEquals(title1, "$360.00");
			System.out.println("value checked and passed");
			
			
			
			
		}
		
		
		
		
		@AfterMethod
		
		public void teardown() {
			
			driver.quit();
		}
	
}
