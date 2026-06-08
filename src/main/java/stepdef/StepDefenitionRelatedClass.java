package stepdef;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenitionRelatedClass {
	public WebDriver driver;
	
	@Before
	public void setup() {
		driver=new EdgeDriver();
	}
	
	@Given("I open the browser")
	public void i_open_the_browser() {
		driver.get("https://www.google.com");
	    System.out.print("first class");
	}
	@When("I go to {string}")
	public void i_go_to(String url) {
	    driver.get(url);
	}
	
	@Then("I should see the title contains (.+)$")
	public void i_should_see_the_title_contains(String string) {
//	    Assert.assertEquals(driver.getTitle(), "Google");
//	    Assert.assertEquals("", "");
	}

	@And("driver has to be closed")
	public void driver_has_to_be_closed() {
		System.out.print("first class driver closed");
	}
	//background keyword
	
	@Given("login into the application")
	public void login_into_the_application() {
		driver.get("https://www.google.com");
		
	}
	
	@When("User enter the {string} and {string}")
	public void User_enter_the_username_and_password(String username,String password) {
		WebElement ele=driver.findElement(By.name("q"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("Selenium");
	   
	}
	@Then("Get the {string}")
	public void get_the_page_title() {
		System.out.print("Title");
	    
	}
	@After
	public void close(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("test-output/" + scenario.getName() + ".png");
			FileUtils.copyFile(src, dest);	
		}
	}
}
