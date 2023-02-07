package KiteProject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage
{
//  System.out.println("  ");  "  "    " "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	   @    @	  _
	
	@FindBy(xpath="//input[@id='userid']") private WebElement userid;
	   
	   @FindBy(xpath="//input[@id='password']") private WebElement pswd;
	   
	   @FindBy(xpath="//button[@class='button-orange wide']") private WebElement loginBtn;
	   
	   public KiteLoginPage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this); 
	   }
	   
	   public void enterUserId(String username)
	   {
		   userid.sendKeys(username);
	   }
	   
	   public void enterPassword(String password)
	   {
		   pswd.sendKeys(password);
	   }
	   
	   public void clickOnLoginbtn()
	   {
		   loginBtn.click();
	   }

}
