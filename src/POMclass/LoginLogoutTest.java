package POMclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginLogoutTest extends BaseClass
{

	@Test
	public void TestLoginLogout() throws EncryptedDocumentException, IOException, InterruptedException
	{
		browser();
		FileInputStream file=new FileInputStream("D:\\opencart.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		Thread.sleep(1000);
		loginpage login=new loginpage(driver);
		login.inpusername(sh.getRow(0).getCell(0).getStringCellValue());
		
		Thread.sleep(1000);
		login.inppwd(sh.getRow(0).getCell(1).getStringCellValue());
		
		Thread.sleep(1000);
		login.clicklogin();
		
		HomePage home= new HomePage(driver);
		home.clickpopup();
		Thread.sleep(1000);
		home.clicklogout();
		
		closebrowser();
		

	}

}
