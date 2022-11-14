package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class ThirdLastPage extends TestBase{
	
	@FindBy(xpath="//input[@id='first-name']") private WebElement UserName;
	@FindBy(xpath="//input[@id='last-name']") private WebElement LastName;
	@FindBy(xpath="//input[@id='postal-code']") private WebElement ZipCode;
	@FindBy(xpath="//button[@id='cancel']") private WebElement cancled;
	@FindBy(xpath="//input[@id='continue']") private WebElement OrderPlaced;
	@FindBy(xpath="//span[text()='Checkout: Overview']") private WebElement Overview;
	@FindBy(xpath="//span[text()='Your Cart']") private WebElement PriviousPageText;
	
	
	public ThirdLastPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String OrderPlaced()
	{
		UserName.sendKeys("Ayush");
		LastName.sendKeys("Tiwari");
		ZipCode.sendKeys("841226");
		OrderPlaced.click();
		return Overview.getText();
				
	}
	
	public String OrderCanclled()
	{

		UserName.sendKeys("Ayush");
		LastName.sendKeys("Tiwari");
		ZipCode.sendKeys("841226");
		cancled.click();
		return PriviousPageText.getText();
		
	}
	

}
