package com.house.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

       features = "C:\\Users\\usakr\\IdeaProjects\\cucumberGherkin\\src\\test\\java\\com\\house\\features\\registration.feature"
        , glue = {"com.house.stepDefs"}
        , format = {"pretty","html:test-output"}
        //    , format = {"pretty", “junit:junit_xml/cucumber.xml“}
        , dryRun = false
        , monochrome = true
        ,  strict = true
        ,tags = ("@Functional")
        //can be used Sanity, Functional and Regression testcases to run
)


public class mytestrunner {
}
