package com.vtiger.genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class webdriver_utility {
	/**
	 * this method is used to maximize the window
	 * @param driver
	 * @author Mamta
	 */
public void maximizewindow(WebDriver driver) {
	driver.manage().window().maximize();
} 
    /**
     * this method is used to minimize the window
     * @param driver
     * @author Mamta
     */
	public void minimizewindow(WebDriver driver) {
		driver.manage().window().minimize();
	}
	/**
	 * this method is used to wiat for page loaded
	 * @param driver
	 * @author Mamta
	 */
	public void waitforpageload(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	/**
	 * this method is used to handle the DD with the help of index
	 * @param ele
	 * @param index
	 */
	
	public void handledropdown(WebElement ele,int index) {
		Select s=new Select(ele);
		s.selectByIndex(index);
	}
	/**
	 * this method is used to handle the DD with the help of value
	 * @param ele
	 * @param value
	 */
	public void handledropdown(WebElement ele,String value) {
		Select s1=new Select(ele);
	s1.selectByValue(value);
	}
	/**
	 * this method is used to handle the DD with the help of visibletext
	 * @param text
	 * @param ele
	 */
	public void handledropdown(String text,WebElement ele) {
		Select s2=new Select(ele);
	s2.selectByVisibleText(text);
	}
	public void movetoelement(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	public void rightclick(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
	}
	public void leftclick(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.click(element).perform();
	}
	public void doubleclick(WebDriver driver,WebElement element) {
		Actions a= new Actions(driver);
		a.doubleClick(element).perform();
	}
	public void dragandrop(WebDriver driver,WebElement srcele,WebElement desele) {
		Actions a=new Actions(driver);
		a.dragAndDrop(srcele, desele).perform();
		
	}
	public void getscreenshot(WebDriver driver) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./"+"\\screenshortfm\\vtiger.png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
