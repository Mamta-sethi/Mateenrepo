package com.vtiger.objectrepose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class homepage {
//declaration
	@FindBy(linkText = "Organizations")
	private WebElement organisationlink;
	@FindBy(linkText = "Contacts")
	private WebElement contactlink;
	@FindBy(linkText = "Opportunities")
	private WebElement opportunitylink;
	@FindBy(linkText = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administatorimg ;
	@FindBy(linkText = "Sign Out")
	private WebElement signoutlink;
	
	//initialisation
	public homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilisation

	public WebElement getOrganisationlink() {
		return organisationlink;
	}

	public WebElement getContactlink() {
		return contactlink;
	}

	public WebElement getOpportunitylink() {
		return opportunitylink;
	}

	public WebElement getAdministatorimg() {
		return administatorimg;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}
	//bl
	public void clickonorglink() {
		organisationlink.click();
	}
	public void clickoncantactlink() {
		contactlink.click();
	}
	public void logoutfromapp(WebDriver driver) {
		
		signoutlink.click();
	}
	
	

	
}
