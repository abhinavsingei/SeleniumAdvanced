package com.accenture.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Cookies {
	
	WebDriver driver;
  @Test
  public void cookies() {
	  driver.manage().deleteAllCookies();
	  Cookie c = new Cookie("Test", "MYCookies");
	  driver.manage().addCookie(c);
	  
	  Set<Cookie> allcookies = driver.manage().getCookies();
			  for(Cookie cook:allcookies)
			  {
				  System.out.println("Cookie Name ="+cook.getName());
				  System.out.println("Cookie Path ="+cook.getPath());
				  System.out.println("Cookie Value ="+cook.getValue());
				  System.out.println("Cookie Expiary date ="+cook.getExpiry());
			  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.timesjobs.com/candidate/register.html");
  }

  @AfterTest
  public void afterTest() {
  }

}
