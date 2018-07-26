package com.accenture.test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChildBrowser {
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.naukri.com/");
	  
	 Set<String> allwh = driver.getWindowHandles();
	  
	  for(String wh:allwh)
	  {
		  String title = driver.switchTo().window(wh).getTitle();
//		  if(title.contains("Intellect"))
//		  {
//			  driver.switchTo().window(wh).close();
//			  Thread.sleep(2000);
//		  }
		  driver.switchTo().window(wh).close();
		  Thread.sleep(2000);
	  }
	  
	  
  }
}
