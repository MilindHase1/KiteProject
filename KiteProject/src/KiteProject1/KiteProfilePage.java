package KiteProject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KiteProfilePage
{
//  System.out.println("  ");  "  "    " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	   @    @	  _

	 @FindBy(xpath="//span[@class='user-id']") private WebElement profileId;
	  @FindBy(xpath="//a[@target='_self']")  private WebElement logOutBtn;
	  
	  public KiteProfilePage(WebDriver driver)
	  {
	  	   PageFactory.initElements(driver, this); 
	  }
	  
	  public void clickOnProfileId()
	  {
		  profileId.click(); 
	  }
	  
	  public void clickOnLogOutBtn()
	  {
		  logOutBtn.click(); 
	  }
}
