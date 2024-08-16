package com.vtiger.objectrepose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organisationpage {

//declaration
	@FindBy(xpath = "//img[@src='orglookupimg']")
	private WebElement orglookupimg;
	//initialisation
	public organisationpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getorgLookUpImg() {
		return orglookupimg;
	}
	//bl
	public void clickonorglookupimg() {
		orglookupimg.click();
	}
	
	
}
