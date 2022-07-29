package wLPayments.Assignments.TestUtilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import wLPayments.Assignments.TestCases.Base_Page;

public class Test_Results  extends Base_Page implements ITestListener
{
	

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result)
	{
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("hh-mm dd-MM-yyyy");
		String Time=sdf.format(date);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileHandler.copy(src, new File("Screenshots\\"+Time+".png"));
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	

}


