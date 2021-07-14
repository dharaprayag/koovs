package PageObjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Resources.base;

public class MenCategory extends base
{
	By menLink = By.xpath("//a[@href='/men']");
	By linksCount = By.xpath("//*[@id='app']/div/div/div/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div/div/ul/li[1]");
		
	public MenCategory(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		//PAGE FACTORY
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getMenLink()
	{
		 return driver.findElement(menLink);
	}
	
	public List<WebElement> getLinksCount()
	{
		 return driver.findElements(linksCount);
	}
	
	
}
