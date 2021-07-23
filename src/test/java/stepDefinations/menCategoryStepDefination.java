package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import PageObjects.MenCategory;
import Resources.base;

@RunWith(Cucumber.class)
public class menCategoryStepDefination extends base 
{
	MenCategory men;
	JavascriptExecutor javascript;
	

    @SuppressWarnings("deprecation")
	@Given("^Go to Men's category and click on shirts$")
    public void go_to_mens_category_and_click_on_shirts() throws Throwable {
    	//INITIALIZE DRIVER//
    	driver = initilizeDriver();
		driver.get(siteUrl);
		driver.manage().window().maximize();
		//login = new Login(driver);
		//INITIALIZE DRIVER 
		
		WebElement menlink = driver.findElement(By.xpath("//*[@class='header_menu_Title']/li[1]"));
		
		men = new MenCategory(driver);
		javascript = (JavascriptExecutor) driver;
		Actions action = new Actions(driver);
		action.moveToElement(menlink).build().perform();

		// Select a Basic Long Sleeve Shirt (Blue color) with small size
		int count = men.getMenProductsLinksCount().size();
		System.out.println(count);		
		for(int i=0; i<count; i++)
		{
			String text =men.getShirtsText().get(i).getText();
			if(text.equalsIgnoreCase("Shirts"))
			{
				men.getClickOnShirtsLink().get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		
		//String expected = driver.findElement(By.xpath("//*[@class='pl-subheader']/div/h1/text()")).getText();
		String Actual = driver.findElement(By.xpath("//*[@class='pl-subheader']/div/h1")).getText();
		//System.out.println(driver.findElement(By.xpath("//*[@class='pl-subheader']/div/h1")).getText());
		Assert.assertTrue(Actual.startsWith("Shirts For Men"));
		
		int shirtsCount = men.getShirtsCount().size();
		System.out.println("Total Shirt count is " + shirtsCount);
		WebElement mouseHoverOnProduct = driver.findElement(By.xpath("//*[@id='prodBox']/li/div[3]"));
		for (int i=0; i<count; i++)
		{
			String basicLongSleeveShirt = men.getBasicLongSleeveShirt().get(i).getText();
			if(basicLongSleeveShirt.equalsIgnoreCase("basicLongSleeveShirt"))
			{
				action.moveToElement(mouseHoverOnProduct).build().perform();
				action.click().perform();
				//men.getClickOnBasicLongSleeveShirt().get(i).click();
				break;
			}
		}
		
    }

    @When("^Apply Brand filter color filter price filter and size filter and click on product$")
    public void apply_brand_filter_color_filter_price_filter_and_size_filter_and_click_on_product() throws Throwable {
        //throw new PendingException();
    //	System.out.println("2");
    }

    @Then("^Select a size and Click on Add to Bag$")
    public void select_a_size_and_click_on_add_to_bag() throws Throwable {
        //throw new PendingException();
    	//System.out.println("3");
    	driver.quit();
    }

}