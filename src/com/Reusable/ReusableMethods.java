package com.Reusable;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class ReusableMethods {
	//Close Browser is used to close all Browsers
		public static void closeBrowser(WebDriver driver)
		{
			driver.quit();
		}
		
		//Close Browsers will close current Browser
		public static void closeCurrentBrowserTab(WebDriver driver)
		{
			driver.close();
		}
		
		//Close Browsers will close current Browser
		public static void closeAllBrowsers(WebDriver driver)
		{
			Set<String> winHandles = driver.getWindowHandles();
			for(String a:winHandles)
			{
				driver.switchTo().window(a);
				String stitle = driver.getTitle();
				System.out.println(stitle);
				driver.close();
			}
		}
		

}
