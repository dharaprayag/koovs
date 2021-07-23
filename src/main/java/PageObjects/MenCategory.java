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
	By textShirtsForMen = By.xpath("//div[@class='pl-subheader-info']/h1");
	By menProductsLinksCount = By.xpath("//*[@class='header_menu_Title']/li[1]/div/ul[1]/li[3]/div/ul/li");
	By shirtsText = By.xpath("//*[@class='header_menu_Title']/li[1]/div/ul[1]/li[3]/div/ul/li");
	By clickOnShirtsLink = By.xpath("//*[@class='header_menu_Title']/li[1]/div/ul[1]/li[3]/div/ul/li/a");
	By loadMore = By.xpath("//div[@text()='Load More']");
	By shirtsCount = By.xpath("//*[@id='prodBox']/li");
	By basicLongSleeveShirt = By.xpath("//div[@class='infoView']/span[2]");
	By clickOnBasicLongSleeveShirt = By.xpath("//div[@class='infoView']");
		
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
	
	public WebElement getLoadMore()
	{
		 return driver.findElement(loadMore);
	}
	
	public List<WebElement> getLinksCount()
	{
		 return driver.findElements(linksCount);
	}
	
	public List<WebElement> getShirtsCount()
	{
		 return driver.findElements(shirtsCount);
	}
	public String getTextShirtForMen()
	{
		 return driver.findElement(textShirtsForMen).getText();
	}
	public List<WebElement> getMenProductsLinksCount()
	{
		 return driver.findElements(menProductsLinksCount);
	}
	public List<WebElement> getShirtsText()
	{
		 return driver.findElements(shirtsText);
	}
	public List<WebElement> getClickOnShirtsLink()
	{
		 return driver.findElements(clickOnShirtsLink);
	}
	
	public List<WebElement> getBasicLongSleeveShirt()
	{
		 return driver.findElements(basicLongSleeveShirt);
	}
	public List<WebElement> getClickOnBasicLongSleeveShirt()
	{
		 return driver.findElements(clickOnBasicLongSleeveShirt);
	}
	
	
}
