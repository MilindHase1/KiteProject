package TestPackage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class OpenGoogle {

//  System.out.println("  ");  (  )  ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %  @  @  @   ()
	
	ChromeDriver driver;
	
	@BeforeClass()
	public void RunFirst()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		
	}
	
	@Test
	public void TestOpenGoogle() throws InterruptedException
	{
		driver.get("https://www.google.com/");
		 WebElement flipkart = driver.findElement(By.xpath("//input[@name='q']"));//.sendKeys("FlipKart");
		 flipkart.sendKeys("FlipKart");
		
		Thread.sleep(2000);
		List<WebElement> data = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		System.out.println("Total No of Suggestion"+data.size());  //ul[@class='G43f7e']/li  
		
		for(WebElement temp:data)
		{
			System.out.println(temp.getText());
		}
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());	
		
		flipkart.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		flipkart.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		flipkart.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		flipkart.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		driver.close();
		
	}
	
	@Test
	public void TestFaceBook() throws InterruptedException, IOException
	{
		
		
		
		 driver.get("https://www.facebook.com/");
		 
		 WebElement fb = driver.findElement(By.xpath("//input[@id='email']"));
		
		 fb.sendKeys("Milind");
     
		WebElement click = driver.findElement(By.xpath("//button[@name='login']"));
		click.click();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String name=RandomString.make(4);
		File dest=new File("D:\\ScreenShot/"+name+".jpg");
		FileHandler.copy(src, dest);
		
		Thread.sleep(5000);
	}
	
//  System.out.println("  ");   " "   (  )  ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %  @  @  @   ()

	
	
	
	
	
	
	
}
