package com.qa.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LoginActv8 {
	

    WebDriver driver;
  @Test
  public void Login() {
	  
	 driver.findElement(By.xpath("//a[@title='My Account']")).click();
	  driver.findElement(By.xpath("//input[@id='log']")).sendKeys("test");
      driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("password");
      driver.findElement(By.xpath("//input[@id='login']")).click();
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chorme.driver", "D:/Pritam/CD/chromedriver");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();

	  driver.get("http://store.demoqa.com/");
  }

  @AfterClass
  public void Teardown() {
	  
	  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  driver.quit();
  }

}
