package com.magento.qa.testcases;

import org.junit.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.magento.qa.base.TestBase;
import com.nagento.qa.pages.AdminLoginPage;
import com.nagento.qa.pages.HomePage;

public class LoginTest extends TestBase{
	AdminLoginPage loginpage;
	HomePage homepage;
	
	
	public LoginTest() {
		
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		
		initialization();
	     loginpage=new AdminLoginPage();
		
	}
	
	
	@Test(priority=1)	
	
	public void PageTitleTest() {
		
		String title= loginpage.ValidateloginPageTitle();
		Assert.assertEquals(title, "Magento Admin");
	}
	
	
	@Test(priority=2)
	public void  ValidateMagentoImage() {
		
		boolean flag= loginpage.validateMagentoLogo();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=3)
	
	public void Logintest() {
		
		homepage= loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	
	public void teardown() {
		
		driver.quit();
	}
	

}
