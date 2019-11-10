package org.testNG.amit;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amittestNG {

	@BeforeTest
	public void someStuff()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\\\Java Videos and Notes\\\\6 Selenium - bhanu and edureka - notes\\\\Drivers and exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	
		WebElement x = driver.findElement(By.id("asdf"));
	
	}
	
  @Test(groups= {"Baby"})
  public void f() {

  }

  
  
  
  
//  @Test(groups= {"Plane"})
//  public void f1() {
//	  System.out.println("Hello f1.");
//  }
//  
//  @Test(groups= {"Car"})
//  public void f2() {
//	  System.out.println("Hello f2.");
//  }
//  
//  @BeforeTest
//  public void a() {
//	  System.out.println("Hello a.");
//  }
//  
//  @AfterTest
//  public void b() {
//	  System.out.println("Hello b.");
//  }
//  
//  @BeforeMethod
//  public void c() {
//	  System.out.println("Hello c.");
//  }
//  
//  @AfterMethod
//  public void d() {
//	  System.out.println("Hello d.");
//  }
  
  
  
}
