package wLPayments.Assignments.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects 
{
	WebDriver driver;
	public LoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']") WebElement Login_UserName;
	@FindBy(xpath = "//input[@id='password']") WebElement Login_Password;
	@FindBy(xpath = "//a[@id='submit']") WebElement Login_Submit;
	@FindBy(xpath = "//div[@class='xd-message-content']/p") WebElement Error_Message;

	
	
	public void Enter_Login_UserName(String UserName)
	{
		Login_UserName.clear();
		Login_UserName.sendKeys(UserName);
	}
	
	public void Enter_Login_Password(String Password)
	{
		Login_Password.clear();
		Login_Password.sendKeys(Password);
	}
	
	public void Click_Login_submit()
	{
		Login_Submit.click();
	}
	
	public String User_Not_Exist_Error_Message()
	{
		return Error_Message.getText();
	}
	
	
	
}
