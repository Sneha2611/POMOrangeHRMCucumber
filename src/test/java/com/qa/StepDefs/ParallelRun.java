package com.qa.StepDefs;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"src/test/java/com/qa/StepDefs"},
        //tags = {"~@Ignore"},
        		plugin = {"pretty",
        				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        				"timeline:test-output-thread/"
        				}
        //,plugin = "json:target/cucumber-reports/CucumberTestReport.json")

        )

public class ParallelRun {

}
