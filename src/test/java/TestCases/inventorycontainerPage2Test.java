package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.inventorycontainerPage2;
import Utility.ReadData;

public class inventorycontainerPage2Test extends inventorycontainerPage2 {
	
	inventorycontainerPage2 inventory ;
	LoginPage login;
	
	@BeforeMethod
	public void setup() throws Exception 
	{
		initialization();
		inventory = new inventorycontainerPage2();
	    login = new LoginPage();    // LoginPage is class
	}
	
	@Test(enabled =false)
	public void VerifyNextPageUrlTest() throws Exception
	{
		login.LoginToPage1();
		String URL = inventory.VerifyNextPageUrl();
		Assert.assertEquals(URL, ReadData.readExcelFile(13, 0));
	}
	@Test(enabled = false)
	public void verifyAppLgoTest() throws Exception
	{
		login.LoginToPage1();
		boolean Applogo = inventory.verifyAppLgo();
		Assert.assertEquals(Applogo, true);
	}
	
	@Test(enabled = false)
	public void verifyPeekLogTest() throws Exception
	{
		login.LoginToPage1();
		  boolean Peeklogo = inventory.verifyPeekLog();
		  Assert.assertEquals(Peeklogo, true);
	}
	
	@Test(enabled = false)
	public void verifyMenuBtnDropDownBoxTest() throws Exception
	{
		login.LoginToPage1();
		boolean Dropbox = inventory.verifyMenuBtnDropDownBox();
		Assert.assertEquals(Dropbox, true);
	}
	
	@Test(enabled = false)
	public void verifyshoppingcartlinkTest()  throws Exception
	{
		login.LoginToPage1();
		boolean Shoppingcardlogo = inventory.verifyshoppingcartlink();
		Assert.assertEquals(Shoppingcardlogo, true);
	}
	
	@Test(enabled = false)
	public void verifyproductsortcontainerDropDownBoxTest()  throws Exception
	{
		login.LoginToPage1();
		 boolean dROPdOWNbOX = inventory.verifyproductsortcontainerDropDownBox();
		 Assert.assertEquals(dROPdOWNbOX, true);
	}
	
	@Test(enabled = false)
	public void verifySauceLabsBackpackTest()  throws Exception
	{
		login.LoginToPage1();
		boolean IMG1 = inventory.verifySauceLabsBackpack();
		Assert.assertEquals(IMG1, true);
	}
	
	@Test(enabled = false)
	public void verifyinventoryitemnameTest()  throws Exception
	{
		login.LoginToPage1(); 
		 String ITEAMNAME = inventory.verifyinventoryitemname();
		 Assert.assertEquals(ITEAMNAME, "Sauce Labs Backpack");
	}
	
	@Test(enabled = false)
	public void verifyinventoryitemdescTest()  throws Exception
	{
		login.LoginToPage1();
		String fullinfoiteam = inventory.verifyinventoryitemdesc();
		Assert.assertEquals(fullinfoiteam,  "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");
	}
	
	@Test(enabled = false)
	public void verifyAddtocartTest()  throws Exception
	{
		login.LoginToPage1(); 
		boolean Addcard0 = inventory.verifyAddtocart();
		Assert.assertEquals(Addcard0, true);
	}
	
	@Test(enabled = false)
	public void verifySauceLabsBikeLighttEST()  throws Exception
	{
		login.LoginToPage1();
		boolean IMG1 = inventory.verifySauceLabsBikeLight();
		Assert.assertEquals(IMG1, true);
	}
	
	@Test(enabled=false)
	public void verifyinventoryitemname1Test()  throws Exception
	{
		login.LoginToPage1();
		String ITEAMNAME1 = inventory.verifyinventoryitemname1();
		Assert.assertEquals(ITEAMNAME1, "Sauce Labs Bike Light");
	}
	
	@Test(enabled=false)
	public void verifyinventoryitemdesc1Test()  throws Exception
	{
		login.LoginToPage1();
		String fullinfoiteam1 = inventory.verifyinventoryitemdesc1();
		Assert.assertEquals(fullinfoiteam1, "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.");
	}
	
	@Test(enabled=false)
	public void verifyAddtocart1Test()  throws Exception
	{
		login.LoginToPage1();
		boolean Addcard1 = inventory. verifyAddtocart1();
		Assert.assertEquals(Addcard1, true);
	}
	
	@Test(enabled=false)
	public void verifySauceLabsBoltTShirtTest()  throws Exception
	{
		login.LoginToPage1(); 
		boolean IMG2 = inventory. verifySauceLabsBoltTShirt();
		Assert.assertEquals(IMG2, true);
	}
	
	@Test(enabled=false)
	public void verifyinventoryitemname2Test()  throws Exception
	{
		login.LoginToPage1();
		String ITEAMNAME2 = inventory.verifyinventoryitemname2();
		Assert.assertEquals(ITEAMNAME2, "Sauce Labs Bolt T-Shirt");
	}
	
	@Test(enabled=false)
	public void verifyinventoryitemdesc2Test()  throws Exception
	{
		login.LoginToPage1();
		String fullinfoiteam2 = inventory.verifyinventoryitemdesc2();
		Assert.assertEquals(fullinfoiteam2, "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.");
	}
	
	@Test(enabled=false)
	public void verifyAddtocart2Test()  throws Exception
	{
		login.LoginToPage1();
		boolean Addcard2 = inventory.verifyAddtocart2();
		Assert.assertEquals(Addcard2, true);
	}
	
	@Test(enabled=false)
	public void verifySauceLabsFleeceJacketTest()  throws Exception
	{
		login.LoginToPage1();
		boolean IMG3 = inventory.verifySauceLabsFleeceJacket();
		Assert.assertEquals(IMG3, true);
	}
	
	@Test(enabled=false) 
	public void verifyinventoryitemname3Test()  throws Exception
	{
		login.LoginToPage1();
		String ITEAMNAME3 = inventory.verifyinventoryitemname3();
		Assert.assertEquals(ITEAMNAME3, "Sauce Labs Fleece Jacket");
	}
	
	
	@Test(enabled=false)
	public void verifyAddtocart3Test()  throws Exception
	{
		login.LoginToPage1();
		boolean Addcard3 = inventory.verifyAddtocart3();
		Assert.assertEquals(Addcard3, true);
	}
	
	@Test(enabled = false)
	public void verifySauceLabsOnesieTest()   throws Exception
	{
		login.LoginToPage1();
		boolean IMG4 = inventory.verifySauceLabsOnesie();
		Assert.assertEquals(IMG4, true);
	}
	
	@Test(enabled = false)
	public void verifyinventoryitemname4Test()  throws Exception
	{
		login.LoginToPage1();
		String ITEAMNAME4 = inventory.verifyinventoryitemname4();
		Assert.assertEquals(ITEAMNAME4, "Sauce Labs Onesie");
	}
	
	@Test(enabled = false)
	public void verifyAddtocart4Test()  throws Exception
	{
		login.LoginToPage1();
		boolean Addcard4 = inventory.verifyAddtocart4();
		Assert.assertEquals(Addcard4, true);
	}
	
	@Test(enabled = false)
	public void verifyTestallTheThingsTShirtRedTest()  throws Exception
	{
		login.LoginToPage1();
		boolean IMG5 = inventory.verifyTestallTheThingsTShirtRed();
		Assert.assertEquals(IMG5, true);
	}
	
	@Test(enabled = false)
	public void verifyinventoryitemname5Test()  throws Exception
	{
		login.LoginToPage1();
		String ITEAMNAME5 = inventory.verifyinventoryitemname5();
		Assert.assertEquals(ITEAMNAME5, "Test.allTheThings() T-Shirt (Red)");
	}
	
	@Test(enabled = false)
	public void verifyinventoryitemdesc5Test()  throws Exception
	{
		login.LoginToPage1();
		String fullinfoiteam5 = inventory.verifyinventoryitemdesc5();
		Assert.assertEquals(fullinfoiteam5, "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.");
	}
	@Test(enabled = false)
	public void verifyAddtocart5Test()  throws Exception
	{
		login.LoginToPage1();
		boolean Addcard5 = inventory.verifyAddtocart5();
		Assert.assertEquals(Addcard5, true);
	}
	
	@Test(enabled = false)
	public void verifyfooterrobotlOGOTEST()  throws Exception
	{
		login.LoginToPage1();
		boolean Logo3 = inventory.verifyfooterrobotlOGO();
		Assert.assertEquals(Logo3, true);
	}	
	@Test (enabled = false)                                                                 //kuhiuhg
	public void verifyfootercopytEXTtEST()  throws Exception
	{
		login.LoginToPage1();
		String Text = inventory.verifyfootercopytEXT();
		Assert.assertEquals(Text, "Twitter\r\n" + 
				"Facebook\r\n" + 
				"LinkedIn\r\n" + 
				"© 2022 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy] but found [© 2022 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy");
				
	}
	
	@Test(enabled = false)
	public void verifyTwitterlINKTest()  throws Exception
	{
		login.LoginToPage1();
		boolean Link1 = inventory.verifyTwitterlINK();
		Assert.assertEquals(Link1, true);
	}
	
	@Test(enabled = false)
	public void verifyFacebooklINKTest()  throws Exception
	{
		login.LoginToPage1();
		boolean Link2 = inventory.verifyFacebooklINK();
		Assert.assertEquals(Link2, true);
	}
	
	@Test(enabled = false)
	public void verifyLinkedInLinkTest()  throws Exception
	{
		login.LoginToPage1();
		boolean Link3 = inventory.verifyLinkedInLink();
		Assert.assertEquals(Link3, true);
	}
	
	@Test(enabled=true,priority=1)
	public void AddProductTest() throws Exception
	{
		login.LoginToPage1();
		 String SelectedProduct = inventory.AddProduct();
		 Assert.assertEquals(SelectedProduct, "5");
	}
	
	@Test(enabled=false,priority=2)
	public void removeProductTest() throws Exception
	{
		login.LoginToPage1();
		String remainp = inventory.removeProduct();
		Assert.assertEquals(remainp, "YOUR CART");
		
	}
	
	@Test(enabled=false,priority=3)
	public void verifyThirdPageTest() throws Exception 
	{
		login.LoginToPage1();
		String ThirdPage = inventory.verifyThirdPage();
		Assert.assertEquals(ThirdPage, "YOUR CART");
	   
		
		
	}
	
		
	
	
	@AfterMethod
	
	public void closeBrowser(ITestResult it) throws Exception
	
	{
		if(ITestResult.FAILURE == it.getStatus());
		Thread.sleep(10000);
		{
			ReadData.Screenshots(it.getName());
		}
		
		driver.close();
	}
	
	
	

}
