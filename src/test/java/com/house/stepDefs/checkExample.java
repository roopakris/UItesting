package com.house.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class checkExample {


    @Given("^Always at homepage$")
    public void always_at_homepage() throws Throwable {
        System.out.println("hey I am in homepage as my background");
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^I am on My account Page$")
    public void i_am_on_My_account_Page() throws Throwable {
        System.out.println("Hey I am in my account page");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I click on GiftCard and E voucher link$")
    public void i_click_on_GiftCard_and_E_voucher_link() throws Throwable {
        System.out.println("I am on evoucher link");
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I should be on Gift card balance Page$")
    public void i_should_be_on_Gift_card_balance_Page() throws Throwable {
        System.out.println("HEy I am on my balance page");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I enter (\\d+) and click ok$")
    public void i_enter_and_click_ok(int ValidGiftCard) throws Throwable {

        System.out.println("Hey Enter"+ValidGiftCard);
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I should see the balance on my card$")
    public void i_should_see_the_balance_on_my_card() throws Throwable {
        System.out.println("Hey I can see my Balance");


        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I enter (\\d+)$")
    public void i_enter(int InvalidGiftCard) throws Throwable {
        System.out.println("Hey Enter"+ InvalidGiftCard);
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I should see the error message$")
    public void i_should_see_the_error_message() throws Throwable {
        System.out.println("Hey I can see my error message");


        // Write code here that turns the phrase above into concrete actions

    }
}
