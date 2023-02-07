package KitePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteProfile
{
  //  System.out.println("  ");  "  "    "  "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	   @    @	  _

	@FindBy(xpath="//span[@class='user-id']") private WebElement clickprofilelogout;
	@FindBy(xpath="//a[@target='_self']") private WebElement ClickLogoutbtn;
	
	public KiteProfile(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void ClickToProfileLogout()
	{
		clickprofilelogout.click();
	}
	
	public void ClickToLogoutbtn()
	
	{
		ClickLogoutbtn.click();
	}
	
}
