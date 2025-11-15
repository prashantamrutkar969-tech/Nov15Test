package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v140.input.model.DragData;
import org.testng.annotations.AfterTest;

public class Login {
	 WebDriver dr = new ChromeDriver();
  @Test
  public void f	() { 
	 
	  WebElement we=dr.findElement(By.name("username"));
      we.sendKeys("Admin");
      WebElement we1=dr.findElement(By.name("password"));
      we1.sendKeys("admin123");
      WebElement we2=dr.findElement(By.xpath("//button[@type='submit']"));
      we2.click();
	  
	  

  }
  @BeforeTest
  public void beforeTest() {
	  WebDriver dr = new ChromeDriver();
	 //dr.get("https://practicetestautomation.com/practice-test-login/");
	  dr.get("https://practice.expandtesting.com/login/");
}

  @AfterTest
  public void afterTest() {
	dr.close();
  }

}
