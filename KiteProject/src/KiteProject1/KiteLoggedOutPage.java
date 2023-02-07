package KiteProject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KiteLoggedOutPage 
{
//  System.out.println("  ");  "  "    " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	   @    @	  _

	 @FindBy(xpath="//h2[@class='userid']") private WebElement logOutId;
	  
	  public KiteLoggedOutPage(WebDriver driver)
	  {
	  	   PageFactory.initElements(driver, this); 
	  }
	  
	  public String verifyLogoutId()
	  {
		 String VarUserId = logOutId.getText();
		 
		 return VarUserId;
	  }
}
