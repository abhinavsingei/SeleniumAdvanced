package com.accenture.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Calc {
	WebDriver driver;
  @Test
  public void f() {
	  
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  Runtime.getRuntime().exec("C:\\Abhinav\\Autoit\\Calc.exe");
  }

  @AfterTest
  public void afterTest() {
  }

}
