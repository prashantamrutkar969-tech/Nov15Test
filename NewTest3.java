package com.testing;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest3 {
	  WebDriver dr = new ChromeDriver();
  @Test
  public void f() throws InterruptedException {
	  dr.get("https://practice.expandtesting.com/login");
	  	JavascriptExecutor js=(JavascriptExecutor)dr;
	  //js.executeScript("arguments[0].scollIntoView(true");dr);	  
	 js.executeScript("window.scrollBy(0,700)"); 
	   Thread.sleep(3000);
	 js.executeScript("window.scrollBy(0,-300)");
	      
}
}