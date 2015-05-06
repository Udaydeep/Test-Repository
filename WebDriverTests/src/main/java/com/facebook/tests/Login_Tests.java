package com.facebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Tests {

	private WebDriver driver;

	@BeforeClass(alwaysRun=true)
	public void SetUp() {
		driver = new FirefoxDriver();
	}

	@AfterClass(alwaysRun=true)
	public void TearDown() {
		driver.quit();
	}

	@Test(groups={"p1","FirstGroup"})
	public void loadPage() {
		System.out.println("Testing the first program..");
		driver.get("http://www.facebook.com");
		Assert.assertEquals(driver.getTitle(),
				"Welcome to Facebook - Log In, Sign Up or Learn More");

	}

	@Test(groups={"p2","SecondGroup"},dependsOnMethods = "loadPage")
	public void emailID() {
		String email = "udaydeep.thota@gmail.com";
		WebElement EmailID = driver.findElement(By.cssSelector("#email"));
		EmailID.sendKeys("udaydeep.thota@gmail.com");
		Assert.assertEquals(EmailID.getAttribute("value"), email);
	}

	@Test(groups={"p2","SecondGroup"},dependsOnMethods ="emailID")
	public void passwordTokens() {

		String password="123456";
		WebElement passwordElement=driver.findElement(By.cssSelector("#pass"));
		passwordElement.sendKeys("123456");
		Assert.assertEquals(passwordElement.getAttribute("value"), password);
	}


}
