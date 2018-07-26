package com.accenture.test;

import org.testng.annotations.Test;

import com.accenture.pages.HomePage;
import com.accenture.pages.Registeration;
import com.accenture.utilities.ExcelUtility;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class Registeration_test {
	WebDriver driver;
	HomePage hmpage;//declaration of object
	Registeration register;
	ExcelUtility excelut;
  @Test
  public void TestRegstr() throws IOException {
	  hmpage.clickRegistration();
	  excelut.getTestData();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	  hmpage = PageFactory.initElements(driver, HomePage.class);
	  register = PageFactory.initElements(driver, Registeration.class);
	  excelut = new ExcelUtility();
  }

@AfterTest
  public void afterTest() {
  }

}
