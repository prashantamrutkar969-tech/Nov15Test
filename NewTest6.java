package com.testing;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewTest6 {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  WebDriver dr = new ChromeDriver();
	  dr.get("https://practicetestautomation.com/practice-test-login/");
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  dr.findElement(By.id("username")).sendKeys("welcome");
	  //Thread.sleep(5000);
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
