package co.uk.motors.stepDefinations;

import co.uk.motors.Page.BasePage;
import co.uk.motors.Page.HomePage;
import co.uk.motors.Page.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class ForSaleSearchStep extends BasePage
{
HomePage homePage = PageFactory.initElements(driver,HomePage.class);
SearchResultPage searchResultPage=PageFactory.initElements(driver,SearchResultPage.class);
    @Given("I navigate to motors homepage")
    public void i_navigate_to_motors_homepage() {
       Launchurl();
    }

    @When("I enter {string} of my house")
    public void i_enter_of_my_house(String postcode) {
     homePage.enterPostcode(postcode);
    }

    @When("I enter {string} of the car")
    public void i_enter_of_the_car(String make) {
     homePage.selectCarMake(make);
    }

    @When("I select {string} of the car")
    public void i_select_of_the_car(String model) {
     homePage.selectcarmodel(model);
    }

    @When("I select {string} from the dropdown")
    public void i_select_from_the_dropdown(String minprice) {
       homePage.selectMinimumPrice(minprice);
    }
    @When("I select MaxPrice from the dropdown")
    public void ISelectFromTheDropdown(String maxprice) {
     homePage.selectMaximumPrice(maxprice);
    }

    @When("I click on search button")
    public void i_click_on_search_button() {
    searchResultPage = homePage.clickOnSubmitButton();
    }

    @Then("new car page is displayed")
    public void new_car_page_is_displayed() {
    }

    @Then("I click on any result to view more detail")
    public void i_click_on_any_result_to_view_more_detail() {

    }

    @Then("The search car page is remain")
    public void the_search_car_page_is_remain() {

    }


}
