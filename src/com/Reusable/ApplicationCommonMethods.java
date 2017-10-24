package com.Reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplicationCommonMethods {
	public static String parent;
	
	public static void Invoke(WebDriver driver)
	{
		 parent = driver.getWindowHandle();
		driver.manage().deleteAllCookies();
		driver.get("http://www.phptravels.net/admin");
		driver.manage().window().maximize();
	}
	public static void Login(WebDriver driver)
	{
		driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demoadmin");
		driver.findElement(By.xpath("//button[@type='submit")).click();
	}	
	public static void Logoff(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@class='drop-down-toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class=fa fa -sign-out']")).click();
	}

}


//a[@class='dropdown-toggle']/..//ul/..//i[@class='fa fa-caret-down fa-lg']
