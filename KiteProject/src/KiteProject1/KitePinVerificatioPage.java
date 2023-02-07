package KiteProject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KitePinVerificatioPage 
{
	 
//  System.out.println("  ");  "  "    " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	   @    @	  _

	@FindBy(xpath="//input[@label='PIN']") private WebElement pin;

	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement continueBtn;


	public KitePinVerificatioPage(WebDriver driver)
	{
		   PageFactory.initElements(driver, this); 
	}
		
	public void enterPin(String userpin)
	{
		pin.sendKeys(userpin);
	}

	public void clickOnCntBtn()
	{
		continueBtn.click();
	}

}
