package com.qa.runner;

//test git

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/qa/features/face.feature", glue = {"com/qa/stepDefinitions"},
//format = {"pretty","html:test:output","json:json_output/cucumber.json","juni:junit_xml/cucumber.xml"},
monochrome= true,
strict = true,
dryRun=false)


public class TestRunner {

}
