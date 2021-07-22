package stepDefinations;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import PageObjects.Login;
import Resources.base;

@RunWith(Cucumber.class)
public class LoginStepDefination extends base 
{
	Login login;
	
	@Before(value="@firstScenario", order=1)
	@Given("^Initialize browser with chrome and navigate to site$")
    public void initialize_browser_with_chrome_and_navigate_to_site() throws Throwable 
	{
		
		driver = initilizeDriver();
		driver.get(siteUrl);
		driver.manage().window().maximize();
		login = new Login(driver);
    }
	@Before(value="@firstScenario", order=2)
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
    	//System.out.println(login.getNotification().getText());
    }	

}
