package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethod {
	
	
	public static void SelectClass(WebElement Element,String VALUE)
	{
		Select s = new Select(Element);
		s.selectByVisibleText(VALUE);
	}

}
