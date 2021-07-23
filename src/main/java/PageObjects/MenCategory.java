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
<<<<<<< HEAD
	By textShirtsForMen = By.xpath("//div[@class='pl-subheader-info']/h1");
	By menProductsLinksCount = By.xpath("//*[@class='header_menu_Title']/li[1]/div/ul[1]/li[3]/div/ul/li");
	By shirtsText = By.xpath("//*[@class='header_menu_Title']/li[1]/div/ul[1]/li[3]/div/ul/li");
	By clickOnShirtsLink = By.xpath("//*[@class='header_menu_Title']/li[1]/div/ul[1]/li[3]/div/ul/li/a");
	By loadMore = By.xpath("//div[@text()='Load More']");
	By shirtsCount = By.xpath("//*[@id='prodBox']/li");
	By basicLongSleeveShirt = By.xpath("//div[@class='infoView']/span[2]");
	By clickOnBasicLongSleeveShirt = By.xpath("//div[@class='infoView']");
		
=======
	By menProductsLinksCount = By.xpath("//*[@class='header_menu_Title']/li[1]/div/ul[1]/li[3]/div/ul/li");
	By shirtsText = By.xpath("//*[@class='header_menu_Title']/li[1]/div/ul[1]/li[3]/div/ul/li");
	By clickOnShirtsLink = By.xpath("//*[@class='header_menu_Title']/li[1]/div/ul[1]/li[3]/div/ul/li/a");
	By shirtsCount = By.xpath("//*[@id='prodBox']/li");
	By loadMoreButton = By.xpath("//*[@id='loadMoreList']");
	By totalShirtCount = By.xpath("//div[@class='row-base']/div[2]/ul/li");
	By clickOnViewAllButton = By.xpath("//div[@id='filterRow']/div[4]/div");
	By numberOfBrands = By.xpath("//div[@id='viewAll']/div[2]/div");
	By brandName = By.xpath("//div[@id='viewAll']/div[2]/div/label/span[1]");
	By brandCheckBox = By.xpath("//div[@id='viewAll']/div[2]/div/label/div");
	By clickOnApplyButtonInSelectBrand = By.xpath("//div[@id='viewAll']/div[3]/div[2]");
	By numberOfColors = By.xpath("//div[@id='filterRow']/div[6]/ul/li/label/span[1]");
	By colorName = By.xpath("//div[@id='filterRow']/div[6]/ul/li/label/span[1]");
	By clickOnColor = By.xpath("//div[@id='filterView']/div/div[6]/ul/li/label");
	By priceRanges = By.xpath("//div[@id='filterView']/div/div[8]/ul/li");
	By priceRange = By.xpath("//div[@id='filterView']/div/div[8]/ul/li/label/span[1]");
	By clickOnPriceRangeCheckbox = By.xpath("//div[@id='filterView']/div/div[8]/ul/li/label/div");
	By shirtName = By.xpath("//*[@id=\"prodBox\"]/li/div[3]/a/div[4]/span[2]");
	By mouseHoverOnShirt = By.xpath("//*[@id='prodBox']/li");
	By clickOnAddToCart = By.xpath("//*[@id='prodBox']/li/div[3]/a/div[3]/div[1]/button[1]");
	By totalSize = By.xpath("//*[@class='size-lists']/div");
	By size = By.xpath("//*[@class='size-lists']/div/span");
	By clickOnAddToBag = By.xpath("//div[@class='pd-right-side']/div[3]/div/button");
	By closeProductPopup =By.xpath("//div[@class='modal-content-wrap']/span");
	
	
>>>>>>> 5589e10fb7e955d7345243ac4e9fc6c99692ab18
	public MenCategory(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		//PAGE FACTORY
		PageFactory.initElements(driver, this);
	}
	public List<WebElement> getTotalSize()
	{
		 return driver.findElements(totalSize);
	}
	public List<WebElement> getSize()
	{
		 return driver.findElements(size);
	}
	public WebElement getCloseProductPopup()
	{
		 return driver.findElement(closeProductPopup);
	}
	public WebElement getMouseHoverOnShirt()
	{
		 return driver.findElement(mouseHoverOnShirt);
	}
	public WebElement getClickOnAddToBag()
	{
		 return driver.findElement(clickOnAddToBag);
	}
	public WebElement getClickOnAddToCart()
	{
		 return driver.findElement(clickOnAddToCart);
	}
	public WebElement getClickOnApplyButton()
	{
		 return driver.findElement(clickOnApplyButtonInSelectBrand);
	}
	public List<WebElement> getShirtName()
	{
		 return driver.findElements(shirtName);
	}
	public List<WebElement> getClickOnPriceRangeCheckbox()
	{
		 return driver.findElements(clickOnPriceRangeCheckbox);
	}
	public List<WebElement> getClickOnColor()
	{
		 return driver.findElements(clickOnColor);
	}
	public List<WebElement> getPriceRange()
	{
		 return driver.findElements(priceRange);
	}
	public List<WebElement> getPriceRanges()
	{
		 return driver.findElements(priceRanges);
	}	
	public List<WebElement> getNumberOfColors()
	{
		 return driver.findElements(numberOfColors);
	}
	public List<WebElement> getColorName()
	{
		 return driver.findElements(colorName);
	}
	
	public List<WebElement> getBrandName()
	{
		 return driver.findElements(brandName);
	}
	
	public List<WebElement> getBrandCheckBox()
	{
		return driver.findElements(brandCheckBox);
	}
	public WebElement getClickOnViewAllButton()
	{
		 return driver.findElement(clickOnViewAllButton);
	}
	public WebElement getMenLink()
	{
		 return driver.findElement(menLink);
	}
	public WebElement getLoadMoreButton()
	{
		 return driver.findElement(loadMoreButton);
	}
	
	public List<WebElement> getLoadMoreButtonSize()
	{
		 return driver.findElements(loadMoreButton);
	}
	
	public List<WebElement> getNumberOfBrands()
	{
		 return driver.findElements(numberOfBrands);
	}
	
	public List<WebElement> getTotalShirtCount()
	{
		 return driver.findElements(totalShirtCount);
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
<<<<<<< HEAD
	public String getTextShirtForMen()
	{
		 return driver.findElement(textShirtsForMen).getText();
	}
=======
>>>>>>> 5589e10fb7e955d7345243ac4e9fc6c99692ab18
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
	
<<<<<<< HEAD
	public List<WebElement> getBasicLongSleeveShirt()
	{
		 return driver.findElements(basicLongSleeveShirt);
	}
	public List<WebElement> getClickOnBasicLongSleeveShirt()
	{
		 return driver.findElements(clickOnBasicLongSleeveShirt);
	}
	
=======
	public WebElement getMensCategoryLink()
	{
	return driver.findElement(menLink);
	}
>>>>>>> 5589e10fb7e955d7345243ac4e9fc6c99692ab18
	
}
