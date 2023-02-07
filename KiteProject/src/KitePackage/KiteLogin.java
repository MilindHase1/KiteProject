package KitePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin 
{
	  /*	
	username--- XB2732
	Password --- Jaichandra@123
	pin -------  940395   
	
	 */
//  System.out.println("  ");  "  "    "  "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	   @    @	  _

	@FindBy(xpath="//input[@id='userid']")  private WebElement userid;
	@FindBy(xpath="//input[@type='password']") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement btnclick;
	
	
	public KiteLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	} 
	
	public void EnterUserId(String username)
	{
	   userid.sendKeys(username);
	}
	
	
	 public void EnterPassword(String userpassword)
	 {
		 password.sendKeys(userpassword);
	 }
	 
	 public void clickloginbtn()
	 {
		 btnclick.click();
	 }

}
