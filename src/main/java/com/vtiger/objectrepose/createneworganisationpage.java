package com.vtiger.objectrepose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createneworganisationpage {
//declaration
	@FindBy(xpath="//input[@name='accountname']")private WebElement orgnameedt;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")private WebElement savebtn;
	
	//initialisation
	public createneworganisationpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//getter
	public WebElement orgnameedt() {
		return orgnameedt;
	}
	public WebElement savebtn() {
		return savebtn;
	}
	//bl
	public void createneworganisation(String ORGNAME) {
		orgnameedt.sendKeys(ORGNAME);
		savebtn.click();
		
	}
	
	
	
	
}
