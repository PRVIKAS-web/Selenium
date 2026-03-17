package com.comcast.HMS.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Doctor 
{
	WebDriver driver ;
	public Add_Doctor(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	// WebElement for Patient Name text field
	@FindBy(name = "patname")
	private WebElement patientName;

}
