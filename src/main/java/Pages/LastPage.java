package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LastPage extends TestBase {
	
	@FindBy(xpath="//span[text()='Checkout: Complete!']") private WebElement Complete;
	@FindBy(xpath="//h2[text()='THANK YOU FOR YOUR ORDER']") private WebElement Text;
	@FindBy(xpath="//img[@class='pony_express']") private WebElement Logo;
	@FindBy(xpath="//button[@id='back-to-products']") private WebElement lastbtn;
	@FindBy(xpath="//span[text()='Products']") private WebElement ProductsText;
	
	
	
	public LastPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String Complete()
	{
		return Complete.getText();
	}

	public String Text()
	{
		return Text.getText();
	}
	
	public boolean Logo()
	{
		return Logo.isDisplayed();
	}
	
	public String lastbtn()
	{
		lastbtn.click();
		return ProductsText.getText();
		
		
	}
}
