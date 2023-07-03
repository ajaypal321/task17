package com.task.seventeen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		//set the path a the chromediver
		System.setProperty("webdriver.chrome.driver","D://Driver//chromedriver.exe");	
// instance of chromedriver 
		WebDriver driver = new ChromeDriver();
		//nevigate to snapdeal
		driver.get("http://www.snapdeal.com");
		//navigate to sign in 
	driver.findElement(By.xpath("//div[@class='accountInner']")).click();
   // log in 
	driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']")).click();	
	// Enter valid Email Id and click on Continue
	Thread.sleep(10000);
	driver.switchTo().frame("iframeLogin");// 
	driver.findElement(By.id("userName")).sendKeys("8850243949");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']")).click();
	Thread.sleep(20000);
	//driver.findElement(By.xpath("//button[@class='continueBtn btn col-xs-24 btn-large btn-skyblue marT20 marB20']")).click();
	driver.findElement(By.id("loginUsingOtp")).click();
	if (driver.getTitle().equals("https://www.snapdeal.com/?loginSuccess=success&")) {
		System .out.println("we have landed th correct website");
		
		}else{
			System.out.println("we have not landed the correct website");
		}
		// close 
		//driver.close();
/*RESULT
 * Jul 03, 2023 4:47:32 PM org.openqa.selenium.remote.service.DriverService$Builder getLogOutput
INFO: Driver logs no longer sent to console by default; https://www.selenium.dev/documentation/webdriver/drivers/service/#setting-log-output
SLF4J: No SLF4J providers were found.
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.

we have not landed the correct websit
 * 
 */
	}

}
