package com.house.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;

public class stepdefWebsite {


    @Given("^customer enters url in Browser$")
    public void customer_enters_url_in_Browser() throws Throwable  {

        System.out.println("I am at given");

    }

    @When("^enters user name and password$")
    public void enters_user_name_and_password() throws Throwable  {
        System.out.println("I am at when");
    }

    @Then("^user is in home page$")
    public void user_is_in_home_page() throws Throwable  {
        System.out.println("I am at Then");
    }

 //// Next SCenario

    @Given("^user has got logged into accounts$")
    public void user_has_got_logged_into_accounts() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("hurrany regression GIVEN");
    }

    @When("^clicks on chage number$")
    public void clicks_on_chage_number() throws Throwable {
        System.out.println("hurrany regression When");
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^number has changed$")
    public void number_has_changed() throws Throwable {
        System.out.println("hurrany regression THEN");
        // Write code here that turns the phrase above into concrete actions

    }

    /////////////// Scenario3/////////////

    @Given("^user is in checkout page$")
    public void user_is_in_checkout_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Funational GIVEN");
    }

    @When("^clicks on logout button$")
    public void clicks_on_logout_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Funational WHEN");
    }

    @Then("^completely logout message should appear$")
    public void completely_logout_message_should_appear() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Funational THEN");
    }
}
