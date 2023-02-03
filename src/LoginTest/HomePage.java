package LoginTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{	
	@FindBy(xpath = "//button[@class='btn-close']") private WebElement popup;
	@FindBy(xpath = "//img[@title='OpenCart']") private WebElement logo;
	@FindBy(xpath = "//span[text()='Logout']") private WebElement logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickpopup() 
	{
		popup.click();
	}
	
	public boolean verifylogo() 
	{
		return logo.isDisplayed();
	}
	
	public void clicklogout()
	{
		logout.click();
	}
	

}
