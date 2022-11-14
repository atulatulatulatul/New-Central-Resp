package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;                                                                                                           //TEST CASES
import Utility.ReadData;
                                                                                                                                                     //TC1= Verify the URL
public class LoginPage extends TestBase  {                                                                                                          //TC2= Verify the tITLE
	                                                                                                                       
  @FindBy(xpath ="//div[@class='login_logo']") private WebElement LoginLogo;                                                                      //TC3= Verify LoginLogo                                                                                                             //TC1= Verify the URL
  @FindBy(xpath ="//div[@class='bot_column']") private WebElement BotColumnLogo;                                                                  //TC4= Verify BotColumnLogo
  @FindBy(xpath ="//input[@id='user-name']") private WebElement UsernameTextBox;                                                                //TC5 = Verify UserName TextBox
  @FindBy(xpath="//input[@id='password']") private WebElement PasswordTestBox;                                                                  //TC6 = Verify Password TextBox   
  @FindBy(xpath ="//input[@id='login-button']") private WebElement SubmitBtn;                                                                  //TC7 = Verify SubmitBtn
  @FindBy(xpath="//span[text()='Products']") private WebElement ProductLabel;                                                               //TC8 = Verify ProductLabel
   
  public  LoginPage()
  {
	  PageFactory.initElements(driver, this);
  }
  
  
	public void setup() throws Exception
	{
		initialization();
		
	}
	
	public String verifyLoginPageURL()
	{
		return driver.getCurrentUrl();
	}
	
	public String verifyLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyLoginLogo()
	{
		return LoginLogo.isDisplayed();	
	}
	
	public boolean verifyBotColumnLogo()
	{
		return BotColumnLogo.isDisplayed();
	}
	
	public String LoginToPage1() throws Exception
	{
		
		UsernameTextBox.sendKeys("standard_user");
		PasswordTestBox.sendKeys("secret_sauce");
		
		
//		UsernameTextBox.sendKeys(ReadData.readExcelFile(2, 0));
	//	PasswordTestBox.sendKeys(ReadData.readExcelFile(2, 1));
		SubmitBtn.click();
		return ProductLabel.getText();
		
		
		
		
	}
	
	
	
}	