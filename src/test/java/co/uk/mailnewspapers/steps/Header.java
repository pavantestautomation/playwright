package co.uk.mailnewspapers.steps;

import co.uk.mailnewspapers.context.TestContext;
import co.uk.mailnewspapers.pages.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class Header {

    @Autowired
    TestContext testContext;


    @Given("the Home page")
    public void the_home_page() {
         testContext.getHomePage().dailyMailLogo();
         testContext.getHomePage().acceptCookie();
    }

    @Given("user should see Today page by default")
    public void user_should_see_today_page_by_default() {

    }

    @Given("user should see Today icon highlighted by default")
    public void user_should_see_today_icon_highlighted_by_default() {

    }

    @When("user click on burger menu")
    public void user_click_on_burger_menu() {

    }

    @Then("user should see burger menu items")
    public void user_should_see_burger_menu_items() {

    }

    @When("user click on the mail logo")
    public void user_click_on_the_mail_logo() {

    }

    @Then("user should see home page reloaded")
    public void user_should_see_home_page_reloaded() {

    }

    @When("user click on Today icon")
    public void user_click_on_today_icon() {

    }

    @Then("user should see Today page")
    public void user_should_see_today_page() {

    }

    @Then("user should see Today page highlighted")
    public void user_should_see_today_page_highlighted() {

    }

    @When("user click on Newspaper icon")
    public void user_click_on_newspaper_icon() {

    }

    @Then("user should see Newspaper page")
    public void user_should_see_newspaper_page() {

    }

    @Then("user should see Newspaper page highlighted")
    public void user_should_see_newspaper_page_highlighted() {

    }

    @When("user click on Best Of icon")
    public void user_click_on_best_of_icon() {

    }

    @Then("user should see Best Of page")
    public void user_should_see_best_of_page() {

    }

    @Then("user should see Best Of page highlighted")
    public void user_should_see_best_of_page_highlighted() {

    }

    @When("user click on Puzzles icon")
    public void user_click_on_puzzles_icon() {

    }

    @Then("user should see Puzzles page")
    public void user_should_see_puzzles_page() {

    }

    @Then("user should see Puzzles page highlighted")
    public void user_should_see_puzzles_page_highlighted() {

    }

    @Then("user should see header section in following order")
    public void user_should_see_header_section_in_following_order(DataTable dataTable) {

    }
}
