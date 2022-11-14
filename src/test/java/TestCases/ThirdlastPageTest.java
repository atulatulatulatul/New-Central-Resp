package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage3;
import Pages.LoginPage;
import Pages.ThirdLastPage;
import Pages.inventorycontainerPage2;

public class ThirdlastPageTest extends TestBase{
	
	LoginPage login ;
	inventorycontainerPage2	inventory;
	InventoryPage3 loginPa3;
	ThirdLastPage third ;
	
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
		inventory = new inventorycontainerPage2();
		loginPa3 = new InventoryPage3();
		third = new ThirdLastPage();
		login.LoginToPage1();
		inventory.verifyThirdPage();
		loginPa3.verifyCheckOut();
				
	}
	
	@Test(priority=1)
	public void OrderPlacedTest() throws InterruptedException
	{
		String Placed = third.OrderPlaced();
		Thread.sleep(10000);
		Assert.assertEquals(Placed, "CHECKOUT: OVERVIEW");
		Thread.sleep(10000);
	}
	
	@Test(priority=2)
	public void OrderCanclledTest()
	{
		String X = third.OrderCanclled();
		Assert.assertEquals(X,"YOUR CART");
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}

}
