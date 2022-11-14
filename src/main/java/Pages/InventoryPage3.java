package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class InventoryPage3 extends TestBase {
	
	//TEST CASES
	//TC1= Verify PageThreeapplogo
	//TC2= Verify PageThreemenuBtn
	//TC3= Verify PageThreeCart
	//TC4= Verify PageThreeQuantityLabel
	//TC5= Verify PageThreeDescLabel
	//TC6= Verify PageThree SauceLabsBoltTShirt
	//TC7= Verify PageThree continueshopping
	//TC8= Verify PageThree
	//TC9= Verify PageThree
	//TC10= Verify PageThree
	//TC11= Verify PageThree
	//TC12= Verify PageThree
	
	
	@FindBy(xpath="//div[@class='app_logo']") private WebElement PageThreeapplogo;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement PageThreemenuBtn;
	@FindBy(xpath="//span[@class='shopping_cart_badge']") private WebElement PageThreeCart;
	@FindBy(xpath="//div[text()='QTY']") private WebElement PageThreeQuantityLabel;
	@FindBy(xpath="//div[text()='DESCRIPTION']") private WebElement PageThreeDescLabel;
	@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']") private WebElement SauceLabsBoltTShirt;
	@FindBy(xpath="//button[@id='continue-shopping']") private WebElement continueshopping;
	@FindBy(xpath="//button[text()='Remove']") private WebElement Remove;
	@FindBy(xpath="//div[text()='Sauce Labs Fleece Jacket']") private WebElement Jacket;
	@FindBy(xpath="//button[@id='checkout']") private WebElement CheckOut;
	@FindBy(xpath="//span[text()='Checkout: Your Information']") private WebElement Page4;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement saucelabsbackpackAdd1;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement lightAdd2;
	@FindBy(xpath="//span[@class='shopping_cart_badge']") private WebElement ShoppingCartpage2;
	@FindBy(xpath="//span[text()='Checkout: Your Information']") private WebElement Information;
	
	
	
    public InventoryPage3()
    {
    	PageFactory.initElements(driver, this);
    }
    
    public boolean verifyPageThreeapplogo()
    {
    	return PageThreeapplogo.isDisplayed();
    }
    
    public boolean verifyPageThreemenuBtn()
    {
    	return PageThreemenuBtn.isDisplayed();
    }
    
    public boolean verifyPageThreeCart()
    {
    	return PageThreemenuBtn.isDisplayed();
    }
    
    public boolean verifyPageThreeQuantityLabel()
    {
    	return PageThreeQuantityLabel.isDisplayed();
    }
    
    public boolean verifyPageThreeDescLabel()
    {
    	return PageThreeDescLabel.isDisplayed();
    }
    /*
    public boolean verifySauceLabsBoltTShirt()
    {
    	return SauceLabsBoltTShirt.isDisplayed();
    }
    */
    public String verifycontinueshopping()
    {
    	continueshopping.click();
    	return Page4.getText();
    	
    }
    
    public String verifyRemove()
    {
    	Remove.click();
    	return PageThreeCart.getText();   	
    	
    }
    
    public boolean verifyJacket()
    {
    	return Jacket.isDisplayed();
    }
    
    public String verifyAddmorePro()
    {
    	continueshopping.click();
    	saucelabsbackpackAdd1.click();
    	lightAdd2.click();
       return ShoppingCartpage2.getText();
     	
    }
    
    public String verifyCheckOut()
    {
    	CheckOut.click();
    	return Information.getText();
    	
    }
    
	
}
