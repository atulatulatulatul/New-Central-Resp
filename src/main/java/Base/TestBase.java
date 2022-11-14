package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Utility.ReadData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	//public static WebDriver driver;
	
	public static WebDriver driver;
	
	public static void initialization() throws Exception
	
	/*
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");
		
	}
	*/
	{
        String Browser  = ReadData.readPropertyFile("Browser2");
	    if(Browser.equals("chrome"))
	    {
	    	WebDriverManager.chromedriver().setup();
	    	driver = new ChromeDriver();
	    }
	    
	    else if(Browser.equals("edge"))
	    {
	    	WebDriverManager.edgedriver().setup();
	    	driver = new EdgeDriver();
	    }
	    
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://www.saucedemo.com/");
	    	
	}
}

// i push the code on github
// now ever one can access the code	