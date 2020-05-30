package co.uk.motors.stepDefinations;

import co.uk.motors.Page.BasePage;
import co.uk.motors.Page.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.PageFactory;

public class ForSaleSeachStep extends BasePage
{
    HomePage homePage = PageFactory.initElements(driver,HomePage.class);
    @Given("I navigate to motors homepage")
    public void i_navigate_to_motors_homepage()
    {
      Launchurl();
    }

    @When("I enter {string} of my house")
    public void i_enter_of_my_house(String postcode)
    {
     homePage.enterPostcode(postcode);
    }

    @When("I enter {string} of the car")
    public void i_enter_of_the_car(String make)
    {
      homePage.selectCarMake(make);
    }

    @When("I select {string} of the car")
    public void i_select_of_the_car(String model)
    {
   homePage.selectCarMake(model);
    }

    @When("I click on monthly cost")
    public void i_click_on_monthly_cost()
    {

    }

    @When("I click on search button")
    public void i_click_on_search_button()
    {

    }

    @Then("new car page is displayed")
    public void new_car_page_is_displayed()
    {

    }

    @Then("I click on any result to view more detail")
    public void i_click_on_any_result_to_view_more_detail()
    {

    }

    @Then("The search car page is remain")
    public void the_search_car_page_is_remain()
    {

    }


}
