package com.practice.brokenlinks;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testMethod {
	static WebDriver driver = null;

	@BeforeMethod
	@Parameters({ "browserType" })
	public void instantiateWebBrowser(String browserType) {

		if (browserType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Uday Deep Thota/Downloads/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.facebook.com");
		} else {
			driver = new FirefoxDriver();
			driver.get("http://www.facebook.com");
		}
	}

	@Test
	public static void testForBrokenLinks() throws MalformedURLException, IOException {
		List<WebElement> allLinks = com.practice.brokenlinks.findAllLinksInPage
				.findAllLinks(driver);
		String expectedOutput="OK";
		String actualOutput=null;
		
		/* Use this to see the broken links on console
		 * 
		 * for (WebElement element : allLinks) {
			try {
				System.out.println("URL "
						+ element.getAttribute("href")
						+ " returned "
						+ com.practice.brokenlinks.checkForBrokenLinks
								.isLinkBroken(new URL(element
										.getAttribute("href"))));
			} catch (MalformedURLException e) {

				System.out.println("Exception occurred at "
						+ element.getAttribute("innerHTML"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		
		for(WebElement element:allLinks)
		{
			actualOutput=com.practice.brokenlinks.checkForBrokenLinks
					.isLinkBroken(new URL(element
							.getAttribute("href")));
			Assert.assertEquals(actualOutput, expectedOutput);
		}

	}

}
