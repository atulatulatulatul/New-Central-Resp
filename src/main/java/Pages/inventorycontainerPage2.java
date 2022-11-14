package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import Utility.ReadData;
import Utility.UtilityMethod;

public class inventorycontainerPage2 extends TestBase {
	
	
	                                      //TEST CASES
	//TC1= Verify URL                                         //TC14= Verify inventoryitemprice       //TC27= Verify inventoryitemname
	//TC2= Verify AppLgo                                     //TC15= Verify Addtocart                //TC28= Verify inventoryitemdesc
	//TC3= Verify PeekLog                                    //TC16= Verify SauceLabsBoltTShirt        //TC29= Verify inventoryitemprice
	//TC4= Verify MenuBtnDropDownBox                          //TC17= Verify inventoryitemname         //TC30= Verify Addtocart  
	//TC5= Verify shoppingcartlink                             //TC18= Verify inventoryitemdesc       //TC31= Verify TestallTheThingsTShirtRed
	//TC6= Verify productsortcontainerDropDownBox              //TC19= VerifY inventoryitemprice      //TC32= Verify  inventoryitemname 
	//TC7= Verify SauceLabsBackpack                            //TC20= Verify Addtocart                //TC33= Verify  inventoryitemdesc
	//TC8= Verify inventoryitemname                            //TC21= Verify SauceLabsFleeceJacket  //TC34= Verify  inventoryitemprice
	//TC9= Verify inventoryitemdesc                            //TC22=Verify inventoryitemname        //TC35= Verify Addtocart  
	//TC10= Verify inventoryitemprice                          //TC23=Verify inventoryitemdesc        //TC36= Verify  footerrobotlOGO
	//TC11= Verify Addtocart                                 //TC24= Verify inventoryitemprice      //TC37= Verify   footercopytEXT
	//TC12= Verify SauceLabsBikeLight                       //TC25= Verify Addtocart               //TC38= Verify  TwitterlINK
	//TC13= Verify inventoryitemname                          //TC26= VerifySauceLabsOnesie        //TC39= Verify  FacebooklINK
	//TC40=  Verify inventoryitemdesc                                                                 //TC41= Verify LinkedInLink
	

	@FindBy(xpath="//div[@class='app_logo']") private WebElement AppLgo;
	@FindBy(xpath="//div[@class='peek']") private WebElement PeekLog;
	@FindBy(xpath="//button[text()='Open Menu']") private WebElement MenuBtnDropDownBox;
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement shoppingcartlink;
	@FindBy(xpath="//select[@class='product_sort_container']") private WebElement productsortcontainerDropDownBox;
	@FindBy(xpath="//img[@alt='Sauce Labs Backpack']") private WebElement SauceLabsBackpack;
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']") private WebElement inventoryitemname;
	@FindBy(xpath="//div[text()='carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.']") private WebElement inventoryitemdesc;
	@FindBy(xpath="") private WebElement inventoryitemprice;
	@FindBy(xpath="//button[@data-test='add-to-cart-sauce-labs-backpack']") private WebElement Addtocart;
	@FindBy(xpath="//img[@alt='Sauce Labs Bike Light']") private WebElement SauceLabsBikeLight;
	@FindBy(xpath="//div[text()='Sauce Labs Bike Light']") private WebElement inventoryitemname1;
	@FindBy(xpath="//div[text()='A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.']") private WebElement inventoryitemdesc1;
	@FindBy(xpath="") private WebElement inventoryitemprice1;
	@FindBy(xpath="//button[@data-test='add-to-cart-sauce-labs-bike-light']") private WebElement Addtocart1;
	@FindBy(xpath="//img[@alt='Sauce Labs Bolt T-Shirt']") private WebElement SauceLabsBoltTShirt;
	@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']") private WebElement inventoryitemname2;
	@FindBy(xpath="//div[text()='Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.']") private WebElement inventoryitemdesc2;
	@FindBy(xpath="") private WebElement inventoryitemprice2;
	@FindBy(xpath="//button[@data-test='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement Addtocart2;
	@FindBy(xpath="//img[@alt='Sauce Labs Fleece Jacket']") private WebElement SauceLabsFleeceJacket;
	@FindBy(xpath="//div[text()='Sauce Labs Fleece Jacket']") private WebElement inventoryitemname3;
	@FindBy(xpath="") private WebElement inventoryitemdesc3;
	@FindBy(xpath="") private WebElement inventoryitemprice3;
	@FindBy(xpath="//button[@data-test='add-to-cart-sauce-labs-fleece-jacket']") private WebElement Addtocart3;
	@FindBy(xpath="//img[@alt='Sauce Labs Onesie']") private WebElement SauceLabsOnesie;
	@FindBy(xpath="//div[text()='Sauce Labs Onesie']") private WebElement inventoryitemname4;
	@FindBy(xpath="") private WebElement inventoryitemdesc4;
	@FindBy(xpath="") private WebElement inventoryitemprice4;
	@FindBy(xpath="//button[@data-test='add-to-cart-sauce-labs-onesie']") private WebElement Addtocart4;
	@FindBy(xpath="//img[@alt='Test.allTheThings() T-Shirt (Red)']") private WebElement TestallTheThingsTShirtRed;
	@FindBy(xpath="//div[text()='Test.allTheThings() T-Shirt (Red)']") private WebElement inventoryitemname5;
	@FindBy(xpath="//div[text()='This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.']") private WebElement inventoryitemdesc5;
	@FindBy(xpath="") private WebElement inventoryitemprice5;
	@FindBy(xpath="//button[@data-test='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement Addtocart5;
	@FindBy(xpath="//img[@alt='Swag Bot Footer']") private WebElement footerrobotlOGO;
	@FindBy(xpath="//div[@class='footer_copy']") private WebElement footercopytEXT;
	@FindBy(xpath="//a[text()='Twitter']") private WebElement TwitterlINK;
	@FindBy(xpath="//a[text()='Facebook']") private WebElement FacebooklINK;
	@FindBy(xpath="//a[text()='LinkedIn']") private WebElement LinkedInLink;
	@FindBy(xpath="//span[text()='Your Cart']") private WebElement YourCart;
	
	
	
	public inventorycontainerPage2()                                                             
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setup() throws Exception
	{
		try {
			initialization();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	public String VerifyNextPageUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean verifyAppLgo()
	{
		return AppLgo.isDisplayed();
	}
	
	 public boolean verifyPeekLog()
	  {
		 return PeekLog.isDisplayed();
	  }
	  
	  public boolean verifyMenuBtnDropDownBox()
	  {
		 return MenuBtnDropDownBox.isDisplayed();	  
	  }
	
	  public boolean verifyshoppingcartlink()
	  {
		 return shoppingcartlink.isDisplayed();
	  }
	
	  public boolean verifyproductsortcontainerDropDownBox()
	  {
		  return productsortcontainerDropDownBox.isDisplayed();
	  }
	
	  public boolean verifySauceLabsBackpack()
	  {
		 return SauceLabsBackpack.isDisplayed();
	  }
	
	  public String verifyinventoryitemname()
	  {
		 return inventoryitemname.getText();
	  }
	
	  public String verifyinventoryitemdesc()
	  {
		  return inventoryitemdesc.getText(); 
	  }
	
	  public boolean verifyAddtocart()
	  {   
		  return Addtocart.isDisplayed();
		 
	  }
	
	  public boolean verifySauceLabsBikeLight() 
	  {
		 return SauceLabsBikeLight.isDisplayed();
	  }
	   
	  public String verifyinventoryitemname1()
	  {
		 return inventoryitemname1.getText();
	  }
	
	  public String verifyinventoryitemdesc1()
	  {
		  return inventoryitemdesc1.getText();  
	  }
	
	  public boolean verifyAddtocart1()
	  {
		 return Addtocart1.isDisplayed();
	  }
	
	  public boolean verifySauceLabsBoltTShirt()
	  {
		  return SauceLabsBoltTShirt.isDisplayed(); 
	  }
	  
	  public String verifyinventoryitemname2()
	  {
		  return inventoryitemname2.getText();
	  }
	
	  public String verifyinventoryitemdesc2()
	  {
		  return inventoryitemdesc2.getText(); 
	  }
	
	  public boolean verifyAddtocart2()
	  {
		  return Addtocart2.isDisplayed();	  
	  }
	
	  public boolean verifySauceLabsFleeceJacket()
	  {
		  return SauceLabsFleeceJacket.isDisplayed();
	  }
	  
	  public String verifyinventoryitemname3()
	  {
		  return inventoryitemname3.getText();
	  }
	  
	  public boolean verifyAddtocart3()
	  {
		 return Addtocart3.isDisplayed();  
	  }
	  
	  public boolean verifySauceLabsOnesie()
	  {
		  return SauceLabsOnesie.isDisplayed();
	  }
	  
	  public String verifyinventoryitemname4()
	  {
		  return inventoryitemname4.getText();
	  }
	  
	  public boolean verifyAddtocart4()
	  {
		  return Addtocart4.isDisplayed(); 
	  }
	  
	  public boolean verifyTestallTheThingsTShirtRed()
	  {
		  return TestallTheThingsTShirtRed.isDisplayed(); 
	  }
	  
	  public String verifyinventoryitemname5()
	  {
		  return inventoryitemname5.getText(); 
	  }
	  
	  public String verifyinventoryitemdesc5()
	  {
		 return inventoryitemdesc5.getText();  
	  }
	  
	  
	  public boolean verifyAddtocart5()
	  {
		  return Addtocart5.isDisplayed();
	  }
	  
	  
	  public boolean verifyfooterrobotlOGO()
	  {
		  return footerrobotlOGO.isDisplayed();
	  }
	  
	  public String verifyfootercopytEXT()
	  {
		  return footercopytEXT.getText();
	  }
	  
	  public boolean verifyTwitterlINK()
	  {
		  return TwitterlINK.isDisplayed();  
	  }
	  
	  public boolean verifyFacebooklINK()
	  {
		  return FacebooklINK.isDisplayed();  
	  }
	  
	  public boolean verifyLinkedInLink()
	  {
		  return LinkedInLink.isDisplayed(); 
	  }
	  
	  public String AddProduct() throws Exception
	  {
	//	  Select s = new Select(productsortcontainerDropDownBox);
	//	  s.selectByVisibleText("Price (low to high)");
		  
		  UtilityMethod.SelectClass(productsortcontainerDropDownBox, "Price (low to high)");
		  
		  
		  Addtocart5.click();
		  Addtocart4.click();
		  Addtocart3.click();
		  Addtocart2.click();
		  Addtocart1.click();
		   String count = shoppingcartlink.getText();
		   return count;
		  	  
	  }
	  
	  public String removeProduct()
	  {
		  Addtocart5.click();
		  Addtocart4.click();
		  Addtocart3.click();
		  shoppingcartlink.click();
		  YourCart.getText();
		  return YourCart.getText();		 		  
	  }
	  
	  
	  public String verifyThirdPage()
	  {
		  
	  
		   shoppingcartlink.click();
		   return YourCart.getText();
		   
	  }
	  
	  
	  
	  
	  
	  
	  
	
}
