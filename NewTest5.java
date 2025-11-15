package com.testing;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewTest5 {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  	WebDriver dr = new ChromeDriver();
		dr.get("https://practicetestautomation.com/practice-test-login");
		dr.manage().window().maximize();
		dr.findElement(By.id("username")).sendKeys("student");
		dr.findElement(By.id("password")).sendKeys("pasword123");
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abcd", "xyz" },
      new Object[] { "pqrs", "lmop" },
    };
  }
}
