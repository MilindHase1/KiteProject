package TestPackage;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport 
{

//  System.out.println("  ");    "  "   ()  ===>  {}  : : >=  <=   <   >  ||     " "   >   <  %	@ @	  _
	
	@Test
	public void test()
	{
		ExtentHtmlReporter report=new ExtentHtmlReporter("./ExtendReports/TestReport1.Html");
		ExtentReports extent=new  ExtentReports();
		extent.attachReporter(report);
		
		ExtentTest logger=extent.createTest(" Login test");
		logger.log(Status.INFO, "Login to Flipkart");
		logger.log(Status.INFO, "Login Verify Success");
		extent.flush();
		
	}
}
  