package test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/featurefil",
glue="stepdef",
tags="@tag",
monochrome=true,plugin= {"pretty","html:target/cucumber-report.html"})
public class TestRunner extends AbstractTestNGCucumberTests{

}
