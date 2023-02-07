package KiteProject1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility 
{
//  System.out.println("  ");  "  "    " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	   @    @	  _

	  //To access URL.properties file
	//   FileInputStream("user.dir");    ---   to access the path  of eclipse workspace
	
	public static String geturl() throws IOException
	{
		Properties obj=new Properties();
		//FileInputStream fileobj=new FileInputStream(System.getProperty("user.dir")+"URL.properties"); 
		
		//FileInputStream fileobj=new FileInputStream(System.getProperty("C:\\Users\\Milind Hase\\eclipse-workspace\\KiteProject\\URL1.properties")); 
	
		FileInputStream fileobj=new FileInputStream(System.getProperty("user.dir")+"\\URL1.properties");
		
		obj.load(fileobj);
		String var = obj.getProperty("URL");
		return var;
	}
	 // to access excel file
	
	public static String gettestdata(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream obj=new FileInputStream("C:\\Users\\Milind Hase\\Desktop\\Automation Note\\TestData.xlsx"); 
		Sheet sh = WorkbookFactory.create(obj).getSheet("Sheet1");
		
		String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
	 // to take screenshot
	
	public static void getscrshot(WebDriver driver) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String name=RandomString.make(3);
		File dest=new File("C:\\Users\\Milind Hase\\Pictures\\ScreenShot"+name+".jpg");
	   FileHandler.copy(src, dest);
		
	}

	
}
//System.out.println("  ");  "  "    " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	   @    @	  _














