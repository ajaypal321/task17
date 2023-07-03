package com.task.seventeen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) throws InterruptedException {
		//set the path a the chromediver
				System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver.exe");
				// instance of chromedriver 
				WebDriver driver = new ChromeDriver();
				//nevigate to dEMOBLAZE
				driver.get("https://www.demoblaze.com/");
				//navigate to sign in 
				driver.findElement(By.id("signin2")).click();
	
				//enter the user name
				Thread.sleep(5000);
				WebElement username=driver.findElement(By.id("sign-username"));
				username.sendKeys("ajay");
				//entering the password
			WebElement password=	driver.findElement(By.id("sign-password"));
			password.sendKeys("Pal12345");
			// click on sign in button
			WebElement button=driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]"));
			button.click();
	}

}
