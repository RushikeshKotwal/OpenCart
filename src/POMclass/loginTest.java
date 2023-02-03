package POMclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class loginTest  extends BaseClass
{
	loginpage login;
	HomePage home;
	
	@BeforeClass
	public void openbrowser() 
	{
		browser();
	}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException 
	{
		login=new loginpage(driver);
		login.inpusername(UtilityClass.data(0, 0));
		login.inppwd(UtilityClass.data(0, 1));
		login.clicklogin();
	}
	
	@Test
	public void Test()
	{
		home= new HomePage(driver);
		home.clickpopup();
		
	}
	
	@AfterMethod
	public void logout() throws InterruptedException 
	{
		
		Thread.sleep(2000);
		home.clicklogout();
		
	}
	
	@AfterClass
	public void close() throws InterruptedException
	{
		closebrowser();
	}
	

}
