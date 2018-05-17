package com.magento.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.magento.qa.util.TestUtil;

public class TestBase {

private static final TimeUnit SECONDS = null;
public static	WebDriver driver;
public static Properties prop;

	
	

	
	public TestBase()   {
		
	
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Soumik\\eclipse-workspace\\MagentoTest\\src\\main\\java\\com\\magento\\qa\\config\\config.properties");
			prop.load(ip);
			System.out.println(prop.getProperty("browser"));
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static void initialization() {
		
		//System.out.println(prop.getProperty("browser"));
		String BrowserName= prop.getProperty("browser");
		if (BrowserName.equals("chrome")) {
			System.out.println(prop.getProperty("browser"));
			System.setProperty("webdriver.chrome.driver", "C:\\bin\\chromedriver_win32\\chromedriver.exe");
			
			 driver =new ChromeDriver();
		} else if(BrowserName.equals("ff")) {
			System.setProperty("Webdriver.gecko.driver", "C:\\bin\\geckodriver-v0.19.1-win32");
			 driver =new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
}
