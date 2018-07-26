package com.accenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;
	@FindBy(xpath=("//a[.='Register']"))
	private WebElement Linkpage;

	public void clickRegistration()
	{
		Linkpage.click();
	}
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
}
