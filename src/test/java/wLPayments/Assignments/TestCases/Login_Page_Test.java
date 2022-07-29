package wLPayments.Assignments.TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import wLPayments.Assignments.PageObjects.LoginPageObjects;

public class Login_Page_Test extends Base_Page
{
	
	@Test
	public void TestCase_001()
	{
		Assert.assertEquals(driver.getTitle(), "Login");
		Reporter.log("Test Case 001 : User able to launch Expected Page : " + driver.getTitle().equals("Login"),true);
	}
	
	//Test Case with Invalid credentials
	@Test
	public void TestCase_002()
	{
		LoginPageObjects LP=new LoginPageObjects(driver);
		LP.Enter_Login_UserName("test@ents.com");
		LP.Enter_Login_Password("Tet@123");
		LP.Click_Login_submit();
		
		Assert.assertEquals(LP.User_Not_Exist_Error_Message(),"User not exists");
		Reporter.log("Test Case 002 : With invalid login credentials appropriate error message is displayed : "+LP.User_Not_Exist_Error_Message().equals("User not exists"),true);
	}
	
	
	//Test Case with Valid Credentials
	@Test
	public void TestCase_003()
	{
		LoginPageObjects LP=new LoginPageObjects(driver);
		LP.Enter_Login_UserName("test@wlpayments.com");
		LP.Enter_Login_Password("Test@123");
		LP.Click_Login_submit();
		
		Assert.assertEquals(driver.getTitle(),"Register");
		Reporter.log("Test Case 003 : With valid login credentials user able to login to the page successfully : "+driver.getTitle().equals("Register"),true);
	}
	

}
