package TestCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Utility.ReadData;

public class LoginPageTest extends TestBase  {
	
	
	LoginPage login;
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
	    login = new LoginPage();
	}
	
	@Test(enabled=false,/*dependsOnMethods="LoginToPage1Test",*/priority=2)
	public void verifyLoginPageURLTest() throws Exception
	{
         String Url = login.verifyLoginPageURL();
         Assert.assertEquals(Url, ReadData.readExcelFile(6, 0));
	}
	
	@Test(enabled=true,/*dependsOnMethods="LoginToPage1Test",*/priority=1)
	public void verifyLoginPageTitleTest() throws Exception
	{
		 String Title = login.verifyLoginPageTitle();
		 Assert.assertEquals(Title, ReadData.readPropertyFile("TITLE"));
	}
	
	@Test(enabled = false)
	public void verifyLoginLogoTest()
	{
		boolean Logo1 = login.verifyLoginLogo();
		Assert.assertEquals(Logo1, true);
	}
	
	@Test(enabled = false)
	public void verifyBotColumnLogoTest()
	{
		boolean logo2 = login.verifyBotColumnLogo();
		Assert.assertEquals(logo2, true);
	}
	
	@Test(enabled=false/*,dependsOnMethods="LoginToPage1Test"*/,priority=0)
	public void LoginToPage1Test() throws Exception
	{
		String label = login.LoginToPage1();
		Assert.assertEquals(label, ReadData.readExcelFile(8, 0));
	}
	
	@AfterMethod
	public void closeBrowser(ITestResult it) throws Exception
	{
		if(ITestResult.FAILURE==it.getStatus())
		Thread.sleep(10000);
		{
			ReadData.Screenshots(it.getName());
		}
		
		driver.close();
	}
	
	
}
