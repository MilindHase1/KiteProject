package KitePackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;

public class KiteTestClass   //  here  used  by inheritance concept 
{
	 //  System.out.println("  ");  "  "    " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	   @    @	  _
	
	WebDriver driver=new ChromeDriver();
	
	// To declared global  variable for  every web pages because used  anywhere in the  program.
	
	KiteLogin login;
	KitePinVerification  pinverify;
	KiteProfile  profile;
	KiteLoggedOut  logout;
	
	public KiteTestClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@BeforeClass  //  to call every class  constructor
	public void OpenKiteAppPage() throws IOException
	{
		//OpenBrowserMethod();  // Base class  method  call  here  this method  is   used  to  open  your  browser  
		
		login = new KiteLogin(driver);
		pinverify = new KitePinVerification(driver);
		profile = new KiteProfile(driver);
		logout = new KiteLoggedOut(driver);
		
	}
	
	@BeforeClass
	public void providetestdata() throws IOException
	{
		// KiteLogin class method call here
		login.EnterUserId(null);
		login.EnterPassword(null);
		login.clickloginbtn();
		
		//KitePinVerification Class method  call here
		pinverify.EnterUserPin(null);
		pinverify.ClicktoContinuebtn();
		
		//KiteProfile class method  call  here
		profile.ClickToProfileLogout();
		profile.ClickToLogoutbtn();
		
		//KiteLoggedOut class method  call  here
		logout.logout();
		
	}
	
	@Test
	public void testcase() throws IOException
	{
		String Expectedresult=null;
		String Actualresult=logout.logout();
		
		Assert.assertEquals(Actualresult, Expectedresult, "Actual Result  and Expected Result  are  not same");
		
	}
	
	@AfterMethod()
	public void scrshotlogout() throws IOException
	 {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String name=RandomString.make();
		
		File Dest=new File("D:\\ScreenShort\\img\"+name+\".png");
		
		FileHandler.copy(source, Dest);
		
	 }
	
	@AfterClass()
	public void ApplicationClose()
	{
		driver.close();
	    driver.quit();
	}
	
	 //  System.out.println("  ");  "  "    " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	   @    @	  _		
}
