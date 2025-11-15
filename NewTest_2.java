package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest_2 {
	 WebDriver dr = new ChromeDriver();
  @Test
  @Parameters({"username","password"})
  public void f(String username, String password) {
	 
	  WebElement we=dr.findElement(By.id("username"));
      we.sendKeys("username");
      WebElement we1=dr.findElement(By.id("password"));
      we1.sendKeys("password ");
      WebElement we2=dr.findElement(By.xpath("//button[@type='submit']"));
      we2.click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriver dr = new ChromeDriver();
	  dr.get("https://practice.expandtesting.com/login");
  }

  @AfterTest
  public void afterTest() {
	  dr.close();
  }

}
