package com.testing;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class FindElement {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  WebDriver dr = new ChromeDriver();
	  dr.get("https://practicetestautomation.com/practice-test-login/");
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  List<WebElement> d1 = dr.findElements(By.tagName("input"));
	  System.out.println("The number of text are"+ d1.size());
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
