package com.accenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registeration {
	WebDriver driver;
	
@FindBy(id="gender-male")
 static WebElement gender;
@FindBy(id="FirstName")
 static WebElement firstname;
@FindBy(id="LastName")
 static WebElement lastname;
@FindBy(xpath="//input[@id='Email']")
static WebElement email;
@FindBy(id="Password")
static WebElement pwd;
@FindBy(id="ConfirmPassword")
static WebElement cnfrmpwd;
@FindBy(id="register-button")
static WebElement Clickregtrbtn;


public static void register()
{
	gender.click();
	firstname.sendKeys("Abhinav");
	lastname.sendKeys("Singh");
	email.sendKeys("@mail");
	pwd.sendKeys("P$ssword!");
	cnfrmpwd.sendKeys("P$ssword!");
	Clickregtrbtn.click();
	
}
public static void registerbyEXcel(String F, String L, String E, String P, String CP)
{
	gender.click();
	firstname.sendKeys(F);
	lastname.sendKeys(L);
	email.sendKeys(E);
	pwd.sendKeys(P);
	cnfrmpwd.sendKeys(CP);
	Clickregtrbtn.click();
	
}

public Registeration(WebDriver driver)
{
	this.driver=driver;
}
}
