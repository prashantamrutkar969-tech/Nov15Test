package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTestNGClass {
  @Test
  public void f() {
	  System.out.println("I am in Test cases");
  }
  @Test
  public void login() {
	  System.out.println("I am in Test cases");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am test Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am test Aefore Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am test Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am test After Class");
  }
  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am test Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am test After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am in test Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am test After Suite");
  }

}
