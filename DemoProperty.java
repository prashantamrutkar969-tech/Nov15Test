package com.testing;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoProperty {
  @Test
  public void f() throws IOException {
	  WebDriver dr = new ChromeDriver();
	  dr.manage().window().maximize();
	  Properties p = new Properties();
	  FileReader p1 = new FileReader("C:\\Users\\CDAC\\Desktop\\SDM_TestNg\\TestNGProject\\src\\input.properties");
	  p.load(p1); 
	  dr.get(p.getProperty("url"));
  }
}
