package com.house.stepDefs;

import com.house.BasePack;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.logging.Logger;

public class registration {

    WebDriver driver;
    //Logger log = Logger.getLogger(registration.class);
    // private static final Logger log = LoggerFactory.getLogger(SampleApiStepdefs.class);
    BasePack base= new BasePack();

    @Given("^I am home page$")
    public void i_am_home_page() throws Throwable {

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\drivers\\latestChromeDriver\\chromedriver.exe");
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.get("http://wwww.yahoomail.com");
        System.out.println("I am in nopcommercesitenow Given");

    }

    @When("^I enter rk and KRis$")
    public void i_enter_rk_and_KRis() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String title = driver.getTitle();
          System.out.println(title);

    }

    @Then("^I would have logged on$")
    public void i_would_have_logged_on() throws Throwable {
            driver.quit();
        // Write cod here that turns the phrase above into concrete actions
        System.out.println("I am in sc1 Then");
    }

    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am in sc2 Given");
    }

    @When("^I enter ndfdf and kris$")
    public void i_enter_ndfdf_and_kris() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am in sc2 When");


    }

    @Then("^I would have registered$")
    public void i_would_have_registered() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am in sc2 Then");

    }



}
