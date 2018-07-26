package com.accenture.test;

import org.testng.annotations.Test;

import net.sourceforge.htmlunit.cyberneko.HTMLScanner.CurrentEntity;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.omg.CORBA.Current;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ActionTestNG {
	
	WebDriver driver;

  @Test
  public void f() throws AWTException, InterruptedException, IOException	 {
	  
	  WebElement email = driver.findElement(By.id("emailAdd"));
	  
	  Actions act = new Actions(driver);
	  act.moveToElement(email).keyDown(email, Keys.SHIFT).sendKeys("newuser").perform();
	  act.doubleClick(email);
	  Thread.sleep(2000);
	  //driver.findElement(By.id("resumeFile_basic")).sendKeys("C:\\Abhinav\\testresume.txt");
	  
	  int y= email.getLocation().getY();
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("confirm('Hi this is Abhinav')");
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  
	  Thread.sleep(2000);
	  jse.executeScript("window.scrollBy(0,"+y+")");
	  
	  TakesScreenshot ts = (TakesScreenshot) driver;
	  File srcFile = ts.getScreenshotAs(OutputType.FILE);
	  File destFile = new File("C:\\Abhinav\\fileout.png");
	  
	  
	  FileUtils.copyFile(srcFile, destFile);
	  
	  Point p = new Point(200, 200);
	  driver.manage().window().setPosition(p);
	  
	  Dimension d = new Dimension(0, 0);
	  driver.manage().window().setSize(d);
	  
	  
	  
	/*  Robot r = new Robot();
	  
	  
	  for(int i=0;i<9;i++)
	  {
		  Thread.sleep(2000);
		  r.keyPress(KeyEvent.VK_TAB);
	  }
	  r.keyRelease(KeyEvent.VK_TAB);*/
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
