package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage3;
import Pages.LoginPage;
import Pages.inventorycontainerPage2;
import Utility.ReadData;

public class InventoryPage3Test extends TestBase {
	
	LoginPage login;
	inventorycontainerPage2 inventory;
	InventoryPage3 loginPa3 ;
	
    @BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
		inventory = new inventorycontainerPage2();
		loginPa3 = new InventoryPage3();
		login.LoginToPage1();
		inventory.verifyThirdPage();
		
	}
	
    @Test(enabled=false)
	public void verifyPageThreeapplogoTest() throws Exception
	{
	//	login.LoginToPage1();
	//	inventory.verifyinventoryitemdesc2();		
		boolean lOGO = loginPa3.verifyPageThreeapplogo();
		Assert.assertEquals(lOGO,true);
	}
    
    @Test(enabled=false)
    public void verifyPageThreemenuBtnTest() throws Exception
    {

	//	login.LoginToPage1();
	//	inventory.verifyinventoryitemdesc2();
    	boolean Btn1 = loginPa3.verifyPageThreemenuBtn();
    	Assert.assertEquals(Btn1, true);
    }
    @Test(enabled=false)
    public void verifyPageThreeCartTest() throws Exception
    {

	//	login.LoginToPage1();
	//	inventory.verifyinventoryitemdesc2();
    	boolean Cart = loginPa3.verifyPageThreeCart();
    	Assert.assertEquals(Cart, true);
    }
    
    @Test(enabled=false)
    public void verifyPageThreeQuantityLabelTest() throws Exception
    {

	//	login.LoginToPage1();
	//	inventory.verifyinventoryitemdesc2();
    	boolean Label0 = loginPa3.verifyPageThreeQuantityLabel();
    	Assert.assertEquals(Label0, true);
    }
    
    @Test(enabled=false)
    public void verifyPageThreeDescLabelTest() throws Exception
    {

	//	login.LoginToPage1();
	//	inventory.verifyinventoryitemdesc2();
    	boolean Label1 = loginPa3.verifyPageThreeDescLabel();
    	Assert.assertEquals(Label1, true);
    }
      
    @Test(enabled=false)
    public void verifyAddmoreProTest()
    {
    	 String Add = loginPa3.verifyAddmorePro();
    	 Assert.assertEquals(Add, "2");
    }
    
    @Test(enabled=true)
    public void verifyCheckOutTest() throws Exception
    {
    	String Page4Index = loginPa3.verifyCheckOut();
    	Thread.sleep(10000);
    	Assert.assertEquals(Page4Index, "CHECKOUT: YOUR INFORMATION");
    	Thread.sleep(10000);
    }
    
    @AfterMethod
    public void CloseBrowser()
    {
    	driver.close();
    }

}
