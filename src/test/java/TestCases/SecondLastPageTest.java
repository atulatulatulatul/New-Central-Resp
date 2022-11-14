package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage3;
import Pages.LoginPage;
import Pages.SecondLastPage;
import Pages.ThirdLastPage;
import Pages.inventorycontainerPage2;

public class SecondLastPageTest extends TestBase {
	

	LoginPage login ;
	inventorycontainerPage2	inventory;
	InventoryPage3 loginPa3;
	ThirdLastPage third ;
	SecondLastPage second;
	
	
	@BeforeMethod
	public void setup() throws Exception
	{
		
		initialization();
		login = new LoginPage();
		inventory = new inventorycontainerPage2();
		loginPa3 = new InventoryPage3();
		third = new ThirdLastPage();
		second = new SecondLastPage();
		login.LoginToPage1();
		inventory.verifyThirdPage();
		loginPa3.verifyCheckOut();
		third.OrderPlaced();
		
	}
	
	@Test(enabled=true,priority=1)
	public void OverviewTextTest()
	{
		boolean Overview = second.OverviewText();
		Assert.assertEquals(Overview,true);
	}
	
	@Test(enabled=true,priority=3)
	public void FinishTest()
	{
		String FinalOrderPlaced = second.Finish();
		Assert.assertEquals(FinalOrderPlaced, "CHECKOUT: COMPLETE!");
	}
	@Test(enabled=true,priority=2)
	public void CanclledTest()
	{
		String NotIntersted = second.Canclled();
		Assert.assertEquals(NotIntersted, "PRODUCTS");
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}

}
