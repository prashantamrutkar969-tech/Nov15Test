package com.testing;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test(priority = 'A')
  public void Login() {
	  System.out.println(" i am in login test case");
  }

@Test (priority = 4)
public void reg() {
	throw new SkipException("We an working");
	//System.out.println(" i am in reg test case");
}

@Test(priority = 2)
public void Home() {
	System.out.println(" i am in home test case");
}

@Test(priority = 3)
public void Logout() {
	System.out.println(" i am in logout test case");
}
}