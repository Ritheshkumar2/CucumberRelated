package test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/featurefile",
glue="stepdef",
tags="@tag12",
monochrome=true,plugin= {"pretty","html:target/cucumber-report.html"})
public class TestRunner extends AbstractTestNGCucumberTests{

}
