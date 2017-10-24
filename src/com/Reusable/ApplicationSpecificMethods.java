package com.Reusable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationSpecificMethods {
	public static void createUser(WebDriver driver) throws InterruptedException
	{
		driver.get("http://www.phptravels.net/admin");
		// MAximize the Browser Window
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.name("email"));
		un.sendKeys("admin@PHPtravels.com");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("demoadmin");
		
		driver.findElement(By.xpath("//span[.='Login']")).click();
		
		//click on Accounts Tab
		
		driver.findElement(By.xpath("//span[.='Accounts']")).click();
		
		//click on Admins Tab
		
		driver.findElement(By.xpath("//a[.='Admins']")).click();
		driver.findElement(By.xpath("//button[.=' Add']")).click();
		driver.findElement(By.name("fname")).sendKeys("pallavi");
		driver.findElement(By.name("lname")).sendKeys("latha");
		driver.findElement(By.name("email")).sendKeys("pallavi@gmail.com");
		driver.findElement(By.name("password")).sendKeys("sripppp");
		driver.findElement(By.name("mobile")).sendKeys("123456");
		Thread.sleep(2000);
		String var="India";
		driver.findElement(By.xpath("//span[.='Please Select']")).click();
		driver.findElement(By.xpath("//ul[@class='select2-results']//li[.='"+var+"']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("address1")).sendKeys("kdp");
		driver.findElement(By.name("address2")).sendKeys("bdvl");
		 WebElement status = driver.findElement(By.name("status"));
		//driver.findElement(By.xpath("//option[@value='yes']")).click();*/
		Select select = new Select(status);
		select.selectByVisibleText("Enabled");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='newssub']")).click();
		driver.findElement(By.xpath("//input[@value='editCars']")).click();
		//Select s1= new Select(status);
		//s1.selectByIndex(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.='Submit']")).click();
		
	}
		public static void DeleteUser(WebDriver driver)
		{
			driver.findElement(By.xpath("//span[.='Accounts']")).click();
			driver.findElement(By.xpath("//a[.='Admins']")).click();;
			//WebElement clickbtn = driver.findElement(By.xpath("//i[@class='fa fa-times']"));
			String email = "sree1234@gmail.com";
			
			//WebDriverWait wait = new WebDriverWait(driver, 10);
			try{
				//WebElement clickbtn = driver.findElement(By.xpath("//i[@class='fa fa-times']"));
				driver.findElement(By.xpath("//a[.='"+email+"']/../..//a[@title='DELETE']")).click();
//			wait.until(ExpectedConditions.elementToBeClickable(clickbtn));
//			driver.findElement(By.xpath("//i[@class='fa fa-times']")).click();
//			
			}catch (Exception e) {
				// TODO: handle exception
			}
			try{
			Alert a= driver.switchTo().alert();
			String b = a.getText();
			System.out.println(b);
			a.accept();
		
			}catch (Exception e) {
				
			}
		}

		public static void EditUser(WebDriver driver){
			driver.findElement(By.xpath("//span[.='Accounts']")).click();
			driver.findElement(By.xpath("//a[.='Admins']")).click();
			String email = "sree1234@gmail.com";
			try
			{
				driver.findElement(By.xpath("//a[.='"+email+"']/../..//a[@title='edit']")).click();
			}
			catch (Exception e) {
				
			}
		}
}
