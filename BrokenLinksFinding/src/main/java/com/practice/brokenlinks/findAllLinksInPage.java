package com.practice.brokenlinks;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class findAllLinksInPage {
	
	public static List<WebElement> findAllLinks(WebDriver driver)
	{
			List<WebElement> allElementList=new ArrayList<WebElement>();
			allElementList=driver.findElements(By.tagName("a"));
			
			allElementList.addAll(driver.findElements(By.tagName("img")));
			
			List<WebElement> validElementList=new ArrayList<WebElement>();
			for(WebElement element:allElementList)
			{
				if(element.getAttribute("href")!=null)
				{
					validElementList.add(element);
				}
			}
			
			return validElementList;
			
			
	}

}
