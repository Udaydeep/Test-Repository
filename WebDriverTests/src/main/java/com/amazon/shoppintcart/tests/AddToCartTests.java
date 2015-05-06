package com.amazon.shoppintcart.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AddToCartTests {

	private  By searchFieldLocator = By.id("twotabsearchtextbox");

	private  By searchButtonLocator = By.xpath("//input[@type='submit']");
			
	
	private String product = "tv";
	
	@Test
	public void searchProduct() throws InterruptedException{
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.amazon.com");
		
		
		 
		//close the browser
		
		WebElement searchField = driver.findElement(searchFieldLocator);
		searchField.sendKeys(product);
		
	
		
		//Click on search image
		WebElement searchButton = driver.findElement(searchButtonLocator);
		searchField.click();
		
		//Sychronization (hard)
		Thread.sleep(9000);
				
		driver.quit();
		
	}
}
