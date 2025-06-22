package stepdef;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
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
	    driver.manage().window().maximize();
	}
	
	@Then("I should see the title contains (.+)$")
	public void i_should_see_the_title_contains(String string) {
		Assert.assertFalse(driver.getTitle().contains(string));

	}

	
	
	// Background step for Feature 2
    @Given("Open the browser and launch Google homepage")
    public void open_browser_and_launch_google() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @When("Enter the {string} in the search field and submit")
    public void enter_in_search_field_and_submit(String searchTerm) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchTerm);
        searchBox.sendKeys(Keys.RETURN);
    }

    @Then("The page title should contain {string}")
    public void page_title_should_contain(String searchTerm) {
        String title = driver.getTitle();
        Assert.assertTrue("Title does not contain search term", title.contains(searchTerm));
    }

    // Close driver after each scenario automatically
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
