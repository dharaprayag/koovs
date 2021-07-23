package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import PageObjects.Login;
import PageObjects.MenCategory;
import Resources.base;

@RunWith(Cucumber.class)
public class LoginStepDefination extends base 
{
	Login login;
	MenCategory men;
	Actions action;
	
	@Before(value="@firstScenario,@secondScenario", order=1)
	@Given("^Initialize browser with chrome and navigate to site$")
    public void initialize_browser_with_chrome_and_navigate_to_site() throws Throwable 
	{
		
		driver = initilizeDriver();
		driver.get(siteUrl);
		driver.manage().window().maximize();
		login = new Login(driver);
    }
	@Before(value="@firstScenario,@secondScenario", order=2)
    @When("^click on login link and Fill up Email and Password and click on log in button$")
    public void click_on_login_link_and_Fill_up_Email_and_Password_and_click_on_log_in_button() throws Throwable
    {
    	Thread.sleep(5000);    	
    	
    		login.getLoginLink().click();
    		login.getEnterEmail().sendKeys(Email);
        	login.getEnterPassword().sendKeys(Password);
        	login.getAcceptButton().click();
        	login.getLoginButton().click();
        	
    }

    @Then("^Landed into home page$")
    public void landed_into_home_page() throws Throwable
    {
    	Thread.sleep(2000);
    	System.out.println("Username is " + login.getUserName().getText());
    	driver.quit();
    	System.out.println("Login Successful");
    	//System.out.println(login.getNotification().getText());
    }
    
    ///MENS CATEGORY//////////////////////
    @After(value="@Login")
	@Given("^Go to Mens category$")
    public void Go_to_Mens_category() throws Throwable 
	{
    	/*INITIALIZE DRIVER
    	driver = initilizeDriver();
		driver.get(siteUrl);
		driver.manage().window().maximize();
		//login = new Login(driver);
		//INITIALIZE DRIVER 
		javascript = (JavascriptExecutor) driver;
		wait = (WebDriverWait) new WebDriverWait(driver, 30);*/
		
    	men = new MenCategory(driver);
		action = new Actions(driver);
		WebElement menlink = men.getMensCategoryLink();
		action.moveToElement(menlink).build().perform();
    }
	
    
    
    @When("^Select a shirt Section$")
    public void Select_a_shirt_Section() throws Throwable
    {
		Thread.sleep(3000);
    	//click on shirt link
    	int count = men.getMenProductsLinksCount().size();
    	System.out.println(count);		
    	for(int i=0; i<count; i++)
   		{
    		String text =men.getShirtsText().get(i).getText();
  			if(text.equalsIgnoreCase(mensProductCategory))
   			{
   				men.getClickOnShirtsLink().get(i).click();
   				break;
   			}
   		}
    	
    }
  
    @Then("^Get total number of shirts$")
    public void Get_total_number_of_shirts() throws Throwable 
    {
    	//int loadMoreCount = men.getLoadMoreButtonSize().size();
    	System.out.println("Total number of Shirts are " + men.getTotalShirtCount().size());
    	//driver.quit();
    	
    	/*for (int i=0; i<loadMoreCount; i++)
		{
			Thread.sleep(3000);
			javascript.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(3000);
			while(men.getLoadMoreButton().isDisplayed())
			{
				Thread.sleep(3000);
				String button = men.getLoadMoreButtonSize().get(i).getText();
				if(button.equalsIgnoreCase("Load More"))
				{
					men.getLoadMoreButtonSize().get(i).click();
					Thread.sleep(3000);
					javascript.executeScript("window.scrollTo(0, document.body.scrollHeight)");
					Thread.sleep(3000);
				}
			}
			javascript.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		}
		System.out.println("Total number of Shirts are " + men.getTotalShirtCount().size());*/
    }
    
    
    //SECOND SCENARIO
    @After(value="@firstScenario", order=1)
    @Given("^Select (.+) and mousehover on shirt image$")
    public void select_and_mousehover_on_shirt_image(String shirtName) throws Throwable
    {
    	men = new MenCategory(driver);
    	action = new Actions(driver);
    	int shirtCount = men.getTotalShirtCount().size();
		for(int j=0; j<shirtCount; j++)
		{
			String shirt = men.getShirtName().get(j).getText();
			if(shirt.equalsIgnoreCase(shirtName))
			{
				Thread.sleep(3000);
				WebElement mouseHoverOnShirt = men.getMouseHoverOnShirt();
				action.moveToElement(mouseHoverOnShirt).build().perform();
				break;
			}
		}
    }
	
    @When("^Select size and click on add to bag$")
    public void Select_size_and_click_on_add_to_bag() throws Throwable
    {
    	men.getClickOnAddToCart().click();
    	int sizes = men.getTotalSize().size();
    	for(int k=0; k<sizes; k++)
    	{
    		String Size = men.getSize().get(k).getText();
    		if(Size.equalsIgnoreCase(size))
    		{
    			men.getTotalSize().get(k).click();
    			break;
    		}
    	}
    	men.getClickOnAddToBag().click();
    	men.getCloseProductPopup().click();
    }

    
    @Then("^Check number of items added into cart and badge digit are equal$")
    public void check_number_of_items_added_into_cart_and_badge_digit_are_equal() throws Throwable
    {
    	System.out.println("Check number of items added into cart and badge digit are equal");
    	driver.quit();
    }
    

}
