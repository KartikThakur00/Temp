package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1_stepDefinition {
    WebDriver driver =new ChromeDriver();

    // before the scenario
    @Before
    public void beforeScenario() {
        driver.manage().window().maximize();
        driver.get("https://www.xenonstack.com/");
    }

    @Given("We are on Xenonstack Website")
    public void we_are_on_xenonstack_website() {
        driver.manage().window().maximize();
        driver.get("https://www.xenonstack.com/");
    }
    @When("Click the logo")
    public void click_the_logo() {
        driver.findElement(By.xpath("//img[@class='xenonstack-logo']")).click();
    }

    @Then("Go to Homepage")
    public void go_to_homepage() {
        String expectedTitle="Real Time Data and AI Company";
        Assert.assertEquals(expectedTitle,driver.getTitle());
    }

    //after the scenario
    @After
    public void afterScenario() {
        driver.quit();
    }
}
