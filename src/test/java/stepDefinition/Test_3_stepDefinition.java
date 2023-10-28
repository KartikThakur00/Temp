package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_3_stepDefinition {

    WebDriver driver =new ChromeDriver();

    // before the scenario
//    @Before
//    public void beforeScenario() {
//        driver.manage().window().maximize();
//        driver.get("https://www.xenonstack.com/");
//    }
    @When("Open ContactUs Form")
    public void open_contact_us_form() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("Fill All inout fields")
    public void fill_all_inout_fields() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Click Next")
    public void click_next() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

//    @After
//    public void afterScenario() {
//        driver.quit();
//    }
}
