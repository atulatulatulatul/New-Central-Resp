package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage3;
import Pages.LastPage;
import Pages.LoginPage;
import Pages.SecondLastPage;
import Pages.ThirdLastPage;
import Pages.inventorycontainerPage2;

public class LastPageTest extends TestBase {
	
	LoginPage login ;
	inventorycontainerPage2	inventory;
	InventoryPage3 loginPa3;
	ThirdLastPage third ;
	SecondLastPage second;
	LastPage last;
	
	
	@BeforeMethod
	public void setup() throws Exception
	{
		
		initialization();
		login = new LoginPage();
		inventory = new inventorycontainerPage2();
		loginPa3 = new InventoryPage3();
		third = new ThirdLastPage();
		second = new SecondLastPage();
		last = new LastPage();
		login.LoginToPage1();
		inventory.verifyThirdPage();
		loginPa3.verifyCheckOut();
		third.OrderPlaced();
		second.Finish();
		
	}
	
	
    @Test(enabled=true,priority=1)
	public void CompleteTest()
	{
		 String CompletedText = last.Complete();
		 Assert.assertEquals(CompletedText, "[CHECKOUT: COMPLETE!]");
	}
    @Test(enabled=true,priority=3)
    public void TextTest()
    {
    	    String Thanks = last.Text();
    		Assert.assertEquals(Thanks, "THANK YOU FOR YOUR ORDER");
    }
    @Test(enabled=true,priority=2)
    public void LogoText()
    {
    	boolean LastLogo = last.Logo();
    	Assert.assertEquals(LastLogo, "true");
    }
    @Test(enabled=true,priority=4)
    public void lastbtnTest()
    {
    	String FirstTestProduct = last.lastbtn();
    	Assert.assertEquals(FirstTestProduct, "PRODUCTS");
    }
    
    @AfterMethod
    public void ClosedBrowser()
    {
    	driver.close();
    }
	

}
