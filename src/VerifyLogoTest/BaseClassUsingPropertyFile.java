package VerifyLogoTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassUsingPropertyFile  
{
	WebDriver driver;
	public void browser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(UtilityClass.readPropertyFile("URL"));
		
	}
	
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.close();
	}

}
