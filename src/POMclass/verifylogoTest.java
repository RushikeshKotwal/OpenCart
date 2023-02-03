package POMclass;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verifylogoTest extends BaseClass
{
	HomePage home;
	loginpage login;
	int TCID;
	
	@BeforeClass
	public void browseropen() 
	{
		browser();
		login=new loginpage(driver);
		home=new HomePage(driver);
	}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		
		login.inpusername(UtilityClass.data(0, 0));
		Thread.sleep(500);
		login.inppwd(UtilityClass.data(0, 1));
		login.clicklogin();
	}
	
	@Test
	public void VerifyLogo() 
	{
	
	TCID=101;
	home.clickpopup();
	
	boolean actresult = home.verifylogo();
	Assert.assertFalse(actresult,"Failed:actual result is false");
				
	}
	
	@AfterMethod
	public void logout(ITestResult s1) throws IOException 
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.SS(driver, TCID);
		}
		
		home.clicklogout();
	}
	
	@AfterClass
	public void browserclose() throws InterruptedException 
	{
		closebrowser();
	}
	
	

}
