package stepdefOne;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class StepDefenitionRealtedClassWithExample {
    
    public WebDriver driver;
    
    @Given("Open the browser and launch the URL")
    public void open_the_browser_and_launch_the_url() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @When("I search for {string}")
    public void i_search_for(String searchTerm) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchTerm);
        searchBox.sendKeys(Keys.RETURN);
    }

    @Then("Check the title as {string}")
    public void check_the_title_as(String expectedTerm) {
        String actualTitle = driver.getTitle();
        Assert.assertTrue("Expected term not found in title. Actual title: " + actualTitle,
                          actualTitle.contains(expectedTerm));
        driver.quit();
    }
}
