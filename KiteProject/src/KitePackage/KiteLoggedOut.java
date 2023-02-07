package KitePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoggedOut 
{
    //  System.out.println("  ");  "  "    " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	   @    @	  _
	
	@FindBy(xpath="//h2[@class='userid']") private WebElement Logoutid;
	
	public KiteLoggedOut(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public String logout()
	{
		String varuserid = Logoutid.getText();
		
		return varuserid;
		
	}
	
	
}
