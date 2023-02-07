package KitePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinVerification 
{
//  System.out.println("  ");  "  "    "  "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	   @    @	  _

	@FindBy(xpath="//input[@type='password']") private WebElement PinVerification;
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement ClickContinuebtn;
	
	public KitePinVerification(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void EnterUserPin(String pinverify)
	{
		PinVerification.sendKeys(pinverify);
	}
	
	
	public void ClicktoContinuebtn() 
	{
		
		ClickContinuebtn.click();
	}
	
}
