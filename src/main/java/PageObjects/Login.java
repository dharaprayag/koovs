package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	public WebDriver driver;
	
	By loginLink = By.xpath("//a[text()='Login']");
	By enterEmail = By.cssSelector("input[id='login-email']");
	By enterPassword = By.cssSelector("input[id='login-pswd']");
	By loginButton = By.xpath("//button[@type='submit']");
	By AcceptButtton = By.xpath("//*[@id='app']/div/div/div/div[1]/div[3]/div[2]/div");
	By notification = By.id("notification-wrapper");
	By userName = By.xpath("//div[@class='account-links']/span");
	
	
	
	
	public Login(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		//PAGE FACTORY
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getLoginLink()
	{
		 return driver.findElement(loginLink);
	}
	
	public WebElement getEnterEmail()
	{
		return driver.findElement(enterEmail);
	}
	
	public WebElement getEnterPassword()
	{
		return driver.findElement(enterPassword);
	}
	
	public WebElement getLoginButton()
	{
		return driver.findElement(loginButton);
	}
	
	public WebElement getAcceptButton()
	{
		return driver.findElement(AcceptButtton);
	}
	
	public WebElement getNotification()
	{
		return driver.findElement(notification);
	}
	
	public WebElement getUserName()
	{
		return driver.findElement(userName);
	}
	

}
