package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test_2_stepDefinition {

    WebDriver driver =new ChromeDriver();

    // before the scenario
//    @Before
//    public void beforeScenario() {
//        driver.manage().window().maximize();
//        driver.get("https://www.xenonstack.com/");
//    }
    @When("Hover On {string}")
    public void hover_on(String string) {
    }
    @When("Click the on {string}")
    public void click_the_on(String string) {
    }
    @Then("Cross check with {string}")
    public void cross_check_with(String string) {
    }

//    @After
//    public void afterScenario() {
//        driver.quit();
//    }
}
