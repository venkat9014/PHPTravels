package com.PHPTravels.TestScripts.Accounts.Admins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Reusable.ApplicationCommonMethods;
import com.Reusable.ApplicationSpecificMethods;
import com.Reusable.ReusableMethods;

public class CreateAdminUser {
	public static WebDriver driver;
	public static final String INPUT_PATH="./Scripts/TestData.xlsx";
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public void Execute() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ApplicationCommonMethods.Login(driver);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		//wait.until((ExpectedConditions.visibilityOfElementLocated("//a[@href='')(element))"
		ApplicationSpecificMethods.createUser(driver);
		ApplicationCommonMethods.Logoff(driver);
		ReusableMethods.closeBrowser(driver);
		ReusableMethods.closeAllBrowsers(driver);
	}
	public static void main(String[] args) throws InterruptedException {
		CreateAdminUser ca = new CreateAdminUser();
		ca.Execute();
		try
		{
			Thread.sleep(2000);
		}catch (Exception e) {
			
		}
		
	}
	
}
