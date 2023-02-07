package KiteProject1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass  extends BrowserOpenBaseClass
{
//  System.out.println("  ");  "  "    " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	   @    @	  _
   
	//WebDriver driver=new ChromeDriver();
	
	KiteLoginPage loginobj;
	KitePinVerificatioPage pinverobj;
	KiteProfilePage profileobj;
	KiteLoggedOutPage logoutobj;

	 @BeforeClass
	 public void openKiteAppPages() throws IOException
	 {
		 openBrowserMethod();
		 loginobj = new KiteLoginPage(driver);
		 pinverobj = new KitePinVerificatioPage(driver);
		 profileobj = new KiteProfilePage(driver);
		 logoutobj = new KiteLoggedOutPage(driver);
		 
	 }
	 
	 @BeforeMethod
	 public void provideTestdata() throws EncryptedDocumentException, IOException
	 {
		 loginobj.enterUserId(Utility.gettestdata(0,0)); // To call  all  class method here  using object
		 loginobj.enterPassword(Utility.gettestdata(0,1));
		 loginobj.clickOnLoginbtn();
		 
		 pinverobj.enterPin(Utility.gettestdata(0,2));
		 pinverobj.clickOnCntBtn();
		 
		 profileobj.clickOnProfileId();
		 profileobj.clickOnLogOutBtn();
		 
		 logoutobj.verifyLogoutId();	 
	 }
	 
	@Test
	public void testcase1() throws EncryptedDocumentException, IOException
	{
		String expectedUserId=Utility.gettestdata(0, 0);
		String actualUserId=logoutobj.verifyLogoutId();
		
		Assert.assertEquals(actualUserId, expectedUserId,"The Actual result and Expected reuslt are not same");
	}
	
	@AfterMethod
	public void srcshotlogout() throws IOException
	{
		Utility.getscrshot(driver);
		
	} 
	
	@AfterClass
	public void appCloseMethod() throws InterruptedException
	{
		Thread.sleep(1500);
		driver.close();
	}
	
//  System.out.println("  ");  "  "    " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	@       @	  _

	
	
	
	
	
	
	 
	 
	 
	
}
