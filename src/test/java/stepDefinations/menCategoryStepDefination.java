package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class menCategoryStepDefination {

    @Given("^Go to Men's category and click on shirts$")
    public void go_to_mens_category_and_click_on_shirts() throws Throwable {
    	//throw new PendingException();
    	System.out.println("1");
    	}

    @When("^Apply Brand filter color filter price filter and size filter and click on product$")
    public void apply_brand_filter_color_filter_price_filter_and_size_filter_and_click_on_product() throws Throwable {
        //throw new PendingException();
    	System.out.println("2");
    }

    @Then("^Select a size and Click on Add to Bag$")
    public void select_a_size_and_click_on_add_to_bag() throws Throwable {
        //throw new PendingException();
    	System.out.println("3");
    }

}