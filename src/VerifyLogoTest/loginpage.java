package VerifyLogoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage 
{
	@FindBy(xpath = "//input[@name='username']") private WebElement UN;
	@FindBy(xpath = "//input[@name='password']") private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']") private WebElement Login;
	
	public loginpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpusername(String un) 
	{
		UN.sendKeys(un);
	}
	
	public void inppwd(String pwd) 
	{
		PWD.sendKeys(pwd);
	}
	
	public void clicklogin() 
	{
		Login.click();
	}


}
