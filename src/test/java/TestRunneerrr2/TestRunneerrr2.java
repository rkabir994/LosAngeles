package TestRunneerrr2;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Features"} , 
plugin = {"json:target/cucumber.json"},
glue = "stepdefinition1")

public class TestRunneerrr2 extends AbstractTestNGCucumberTests  {

}
