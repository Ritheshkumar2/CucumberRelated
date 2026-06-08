package test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
		features="src/main/java/featurefileOne",
		glue="stepdefOne",
	    tags="@tag",
		monochrome=true,
        plugin= {"pretty","json:target/cucumber-report.html"}
		)
public class TestRunnerWithExample extends AbstractTestNGCucumberTests{

}
