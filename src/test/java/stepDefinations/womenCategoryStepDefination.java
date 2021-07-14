package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class womenCategoryStepDefination {

    @Given("^Go to women's category and click on shirts$")
    public void go_to_womens_category_and_click_on_shirts() throws Throwable {
        System.out.println("Women 1");
    }

    @When("^Apply Brand filter color filter price filter and size filter$")
    public void apply_brand_filter_color_filter_price_filter_and_size_filter() throws Throwable {
    	System.out.println("Women 2");
    }

    @Then("^Add to Bag$")
    public void add_to_bag() throws Throwable {
    	System.out.println("Women 3");
    }

}