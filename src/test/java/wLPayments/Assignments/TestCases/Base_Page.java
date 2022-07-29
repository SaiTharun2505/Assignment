package wLPayments.Assignments.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Base_Page 
{
	public static WebDriver driver;
	public static WebDriverWait wait;

	@Parameters("Browser")
	@BeforeClass
	public void Browser_Launch(String Browser)
	{
		if(Browser.equals("Chrome"))
		{	
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://localhost:8053/login-service/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			new WebDriverWait(driver, 30);
		}
		
		else if(Browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("http://localhost:8053/login-service/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		else if(Browser.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.get("http://localhost:8053/login-service/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		else
		{
			System.out.println("No Browser Initiated");
		}
	}
	
	@AfterClass
	public void Browser_Close()
	{
		driver.quit();
	}

}
