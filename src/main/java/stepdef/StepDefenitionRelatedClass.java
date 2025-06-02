package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenitionRelatedClass {
	public WebDriver driver;
	
	@Given("I open the browser")
	public void i_open_the_browser() {
	    driver=new ChromeDriver();
	}
	@When("I go to {string}")
	public void i_go_to(String url) {
	    driver.get(url);
	}
	
	@Then("I should see the title contains {string}")
	public void i_should_see_the_title_contains(String string) {
	    Assert.assertEquals(driver.getTitle(), "Google");
	}

	@And("driver has to be closed")
	public void driver_has_to_be_closed() {
	    driver.close();
	}
}
