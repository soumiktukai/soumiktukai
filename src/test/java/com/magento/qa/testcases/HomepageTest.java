package com.magento.qa.testcases;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.magento.qa.base.TestBase;
import com.nagento.qa.pages.AdminLoginPage;
import com.nagento.qa.pages.HomePage;

public class HomepageTest extends TestBase {
	
	     AdminLoginPage loginpage;
	     HomePage Homepage;
	
          public HomepageTest() {
		
		  super();
	      }
	
          @BeforeMethod
          public void SetUp() {
	
	        initialization();
            loginpage=new AdminLoginPage();
            Homepage= loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	
            }
         
        
           
         
          
         @Test(priority=1)
         
          public void DashoboardValidation() {
      		
      		String title= Homepage.PageTile();
      		Assert.assertEquals(title, "Dashboard");
      	}
      	
          
          @AfterMethod
          
          public void teardown() {
        	  
        	  driver.quit();
          }
          

}
