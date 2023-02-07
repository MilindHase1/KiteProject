package KiteProject1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpenBaseClass 
{
//  System.out.println("  ");  "  "    " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	   @    @	  _
   static WebDriver driver;
	
	public void openBrowserMethod() throws IOException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milind Hase\\eclipse-workspace\\KiteProject\\Link\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//implicit wait
		
		driver.get(Utility.geturl());
		
		//
//driver.get("https://kite.zerodha.com/");
		
		
	}
}
