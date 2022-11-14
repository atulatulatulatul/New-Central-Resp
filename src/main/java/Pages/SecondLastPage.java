package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class SecondLastPage  extends TestBase{
	
	@FindBy(xpath="//span[text()='Products']") private WebElement ProductsText;
	@FindBy(xpath="//span[text()='Checkout: Overview']") private WebElement Overview; 
	@FindBy(xpath="//span[text()='Checkout: Complete!']") private WebElement Complete;
	@FindBy(xpath="//button[@id='finish']") private 	WebElement Finish;
	@FindBy(xpath="//button[@id='cancel']") private WebElement Canclled;
	
	
	
	public SecondLastPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean OverviewText()
	{
		return Overview.isDisplayed();
	}
	
	public String Finish()
	{
		Finish.click();
		return Complete.getText();
		
	}
	
	public String Canclled()
	{
		Canclled.click();
		return ProductsText.getText();
	}
	

}
