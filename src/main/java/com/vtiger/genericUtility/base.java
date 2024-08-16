package com.vtiger.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.objectrepose.homepage;
import com.vtiger.objectrepose.loginpage;

public class base {
public PropertyFileUtility putil=new PropertyFileUtility();
public ExcelFileUtility eutil=new ExcelFileUtility();
public JavaUtility jutil=new JavaUtility();
public webdriver_utility wutil=new webdriver_utility();
//runtime polymorphism
public WebDriver driver=null;

@BeforeSuite
public void bsconfig() {
	Reporter.log("db connected",true);
	
}
@AfterSuite
public void asconfig() {
	Reporter.log("db disconnected",true);
}
@BeforeClass
public void bcconfig() throws Throwable {
	String BROWSER = putil.readDatafrompf("browser");
	String URL = putil.readDatafrompf("url");
	if(BROWSER.equals("chrome")){
		driver=new ChromeDriver();
		Reporter.log( "chrome BROWSER has lunched",true);
	}
	else if(BROWSER.equals("edge")) {
		driver=new EdgeDriver();
		Reporter.log("edge browser has lunched",true);
	
	}
	else if(BROWSER.equals("firefox")) {
		driver=new FirefoxDriver();
		Reporter.log("firefox browser has lunch",true);
	}
	else {
		System.out.println("u have given invalid browser name into pf file");
	}
	driver.get(URL);
	wutil.maximizewindow(driver);
	wutil.waitforpageload(driver);
	
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
		Reporter.log("close browser",true);
	}
	@BeforeMethod
	public void loginToApp() throws Throwable {
		String UN = putil.readDatafrompf("un");
		String PWD = putil.readDatafrompf("pwd");
		loginpage lp=new loginpage(driver);
		lp.loginToApp(UN,PWD);
		Reporter.log("user can login to app successfully",true);
	}
	@AfterMethod
	public void logoutfromapp()  {
	homepage hp=new homepage(driver);
	   hp.logoutfromapp(driver);
	   Reporter.log("user can log out app successfully",true);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
