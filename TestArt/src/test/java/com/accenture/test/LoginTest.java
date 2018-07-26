package com.accenture.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void LoginValid() {
	  String EspectedRslt = "Tested";
	  String ActualRslt = "Tested";
	  Assert.assertEquals(ActualRslt, EspectedRslt);
	  System.out.println("LoginValid sucessful");
			  
  }
  @Test
  public void LoginInvalid() {
	  String EspectedRslt = "Tested";
	  String ActualRslt = "Tested123";
	  Assert.assertEquals(ActualRslt, EspectedRslt);
	  System.out.println("LoginInValid sucessful");
  }
}
