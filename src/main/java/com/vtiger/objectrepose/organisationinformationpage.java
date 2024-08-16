package com.vtiger.objectrepose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory; 

public class organisationinformationpage {
//declaration
	@FindBy(xpath="//span[@class='dvHeaderText']")private WebElement orgheadertext;
	 
	//initialisation
	public organisationinformationpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getorgheadertext() {
		return orgheadertext;
	}
	//bl
	public String getheader() {
		return orgheadertext.getText();
	}
	
	
	
	
	
	
	
}
