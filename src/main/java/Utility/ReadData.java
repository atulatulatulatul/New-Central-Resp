package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;
import net.bytebuddy.utility.RandomString;

public class ReadData extends TestBase {
	
	
	public static String readPropertyFile(String value) throws Exception
	{
		Properties pop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\test\\w space\\demo\\ConfigureProperty\\AllHardcodeData");
		pop.load(file);		
		return pop.getProperty(value);
	}
	
	public static  String readExcelFile(int rownum, int rowcell) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\test\\w space\\demo\\ConfigureProperty\\OWNEX...xlsx");
		Sheet Excel = WorkbookFactory.create(file).getSheet("sheet1");
	    String value = Excel.getRow(rownum).getCell(rowcell).getStringCellValue();
	   return value;
		
	}
	
	public static void Screenshots(String name1) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String name = RandomString.make(4);
		File dest = new File("C:\\Users\\test\\w space\\demo\\PHOTOS"+name+".png");
		FileHandler.copy(source,dest);
		
		
	}

}
